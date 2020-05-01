using Microsoft.Extensions.Configuration;
using Microsoft.Extensions.Logging;
using System;
using System.Collections.Generic;
using System.Net.Http;
using Newtonsoft.Json;
using Newtonsoft.Json.Linq;
using Microsoft.Rest;
using ScannerBabylonService;
using ScannerBabylonService.Models;

namespace catalog_scan_trigger
{
    class DataCatalogScanTrigger
    {
        
        ILogger _Logger;
        IConfiguration _Config;


        public DataCatalogScanTrigger(ILoggerFactory logger, IConfiguration config)
        {

            _Logger = logger.CreateLogger<DataCatalogScanTrigger>();
            _Config = config;
        }

        public void Run()
        {
            string dsName = _Config.GetValue<String>("ScanningDataSourceName");
            // Logic could differ here we just create DS and setup a scan
            AzureSqlDatabaseDataSource ds = createDataSource(dsName);
            Scan scan = createScan(dsName);
            setSchedule(dsName, scan.Name);

            // test Adhoc
            runNow(dsName, scan.Name);
        }

        private MicrosoftScanningClient getScanClient() 
        {
            // Get DC client with token
            var svcClientCreds = new TokenCredentials(getToken(), "Bearer");
            var client = new MicrosoftScanningClient(svcClientCreds);
            // Overwrite base URI if needed
            client.BaseUri = new System.Uri(_Config.GetValue<String>("ScanningServiceUrl"));
            client.ApiVersion = "2018-12-01-preview"; 
            return client;
        }

        // Create DataSource
        private AzureSqlDatabaseDataSource createDataSource(string dsname)
        {
            var client = getScanClient();
            string sqlServer = _Config.GetValue<String>("SqlServer");

            // find if datasource already exists
            /*DataSource dsfind = client.DataSources.Get(dsname);
            if (dsfind != null && dsfind.Id != null) 
            {
                _Logger.LogDebug("Datasource {0} exists", dsname);
            }*/

            // Create new Datasource
            AzureSqlDatabaseDataSource datasource = new AzureSqlDatabaseDataSource(null, dsname, null, null, null, null, sqlServer);
           
            DataSource result = client.DataSources.CreateOrUpdate(dsname, datasource);
            if (result != null )
              _Logger.LogDebug("Created datasource {0}", result.Id);

            return (AzureSqlDatabaseDataSource)result;
        }

        // Create Scan using Azure MSI
        private Scan createScan(String dsName)
        {
            var client = getScanClient();
            string scanName = "scan_" + System.DateTime.Now.Ticks;

            AzureSqlDatabaseMsiScan scan = new AzureSqlDatabaseMsiScan();
            scan.DatabaseName = _Config.GetValue<String>("SqlDb");
            scan.ServerEndpoint = _Config.GetValue<String>("SqlServer");
            // TODO
            // scan.ScanRulesetName = "";

            Scan scanresult = client.Scans.CreateOrUpdate(dsName, scanName, scan);
            _Logger.LogInformation("Scan created {0}", scanresult.Id);
            return scanresult;
        }

        // Run Scan AdHoc
        private String runNow(String dsName,string scanName)
        {
            var client = getScanClient();

            ScanRunProperties props = new ScanRunProperties("Full"); // Or "Incremental"
            OperationResponse scanresult = client.Scans.Run(dsName, scanName, props);
            _Logger.LogDebug("Scan Run now status {0}", scanresult.Status);
            if ( scanresult.Error != null )
                _Logger.LogDebug("Scan Run now error {0}", scanresult.Error);

            _Logger.LogInformation("Scan Run now status {0}", scanresult.Status);
            return scanresult.Status;
        }


        // Schedule Scan to run weekly by setting Trigger
        private String setSchedule(String dsName,String scanName)
        {
            var client = getScanClient();

            Trigger trigger = new Trigger(null, "default", "7.00:00:00", "7.00:00:00", null, null, null, "Incremental");
            
            Trigger triggeresult = client.Triggers.CreateTrigger(dsName, scanName, "default", trigger);
            _Logger.LogInformation("Trigger scheduled {0} Time {1}", triggeresult.Id, triggeresult.IncrementalScanStartTime);

            return triggeresult.Name;
        }


        private  void printResultBody(Object body)
        {
            _Logger.LogDebug("\n Result:\n {0}", JsonConvert.SerializeObject(body, Formatting.Indented));
        }

        private string getToken()
        {
            Boolean useMI = _Config.GetValue<Boolean>("UseMI");

            if (useMI)
                return getMIToken();
            else
                return getSPToken();
        }

        private string getSPToken() 
        { 
            string clientId = _Config.GetValue<String>("ClientId");
            string clientSecret = _Config.GetValue<String>("ClientSecret");
            string tenantId = _Config.GetValue<String>("TenantId");

            string loginUrl = String.Format("https://login.windows.net/{0}/oauth2/token", tenantId);

            var values = new Dictionary<string, string>
                     {
                     { "grant_type", "client_credentials" },
                     { "client_id", clientId },
                     { "client_secret", clientSecret },
                     { "resource", "https://management.core.windows.net/" }
                     };

            var content = new FormUrlEncodedContent(values);
            HttpClient authClient = new HttpClient();
            var bearerResult = authClient.PostAsync(loginUrl, content);
            bearerResult.Wait();
            var resultContent = bearerResult.Result.Content.ReadAsStringAsync();
            resultContent.Wait();
            var bearerToken =
            JObject.Parse(resultContent.Result)["access_token"].ToString();

            return bearerToken;
        }

        private string getMIToken()
        {
            string miUrl = @"http://169.254.169.254/metadata/identity/oauth2/token?api-version=2018-02-01&resource=https://management.core.windows.net";

            HttpClient authClient = new HttpClient();
           
            var bearerResult = authClient.GetAsync(miUrl);
            bearerResult.Wait();
            var resultContent = bearerResult.Result.Content.ReadAsStringAsync();
            resultContent.Wait();
            var bearerToken =
            JObject.Parse(resultContent.Result)["access_token"].ToString();

            return bearerToken;
        }
    }
}
