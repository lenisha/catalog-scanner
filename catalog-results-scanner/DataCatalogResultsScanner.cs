using Microsoft.Extensions.Configuration;
using Microsoft.Extensions.Logging;
using System;
using System.Collections.Generic;
using DataCatalogGen2;
using System.Net.Http;
using DataCatalogGen2.Models;
using Newtonsoft.Json;
using Newtonsoft.Json.Linq;
using Microsoft.Rest;

namespace catalog_scanner
{
    class DataCatalogResultsScanner
    {
       
        ILogger _Logger;
        IConfiguration _Config;


        public DataCatalogResultsScanner(ILoggerFactory logger, IConfiguration config)
        {

            _Logger = logger.CreateLogger<DataCatalogResultsScanner>();
            _Config = config;
        }

        public void Run()
        {

            Dictionary<string, string> tableguids = getAllClassifiedTablesAtServer();
            foreach (var table  in tableguids) 
            {
                Dictionary<string, string> columns = getClassifiedColumns(table.Value);
                _Logger.LogInformation("Found classifications in table {0}", table.Key);
                foreach (var column in columns) {
                    _Logger.LogInformation(" --- Column  {0} --- Classification {1}", column.Key, column.Value);
                }
            }

        }

        private DataCatalogClient getDCClient() 
        {
            // Get DC client with token
            var svcClientCreds = new TokenCredentials(getToken(), "Bearer");
            var client = new DataCatalogClient(svcClientCreds);
            // Overwrite base URI if needed
            string baseUrl = _Config.GetValue<String>("AtlasUrl") + "/api/atlas";

            client.BaseUri = new System.Uri(baseUrl);
            return client;
        }

        private Dictionary<string,string> getAllClassifiedTablesAtServer()
        {
            var client = getDCClient();
            string sqlServer = _Config.GetValue<String>("SqlServer");

            // Get SQL Tables with all classificatuions that are on the server
            JsonSearchParameters p2 = new JsonSearchParameters();
            p2.IncludeSubTypes = true;
            p2.TypeName = "azure_sql_table";
            p2.IncludeClassificationAttributes = true;
            p2.IncludeSubClassifications = true;
            
            // Get tables request
            JsonSearchRequest req = new JsonSearchRequest(sqlServer, null, null, p2);
            JsonAdvancedResult results = client.DiscoveryREST.SearchAdvanced(req);

            _Logger.LogDebug("Found tables {0}", results.Searchcount);

            Dictionary<string, string> tableguids = new Dictionary<string, string>();
            foreach (var table in results.Value ) {
                if ( table.AllClassifications != null &&  table.AllClassifications.Count > 0 )
                    tableguids.Add(table.QualifiedName, table.Id);
            }

            _Logger.LogDebug("Found tables with classifications {0}", tableguids.Count);
            return tableguids;
        }

        private Dictionary<string,string> getClassifiedColumns(string tableguid)
        {
            // find columns in this table by guid
            var client = getDCClient();
            JsonAtlasEntityWithExtInfo dbinfo = client.EntityREST.GetById(tableguid);

            // only get columns with classififcations attached to them
            Dictionary<string, string> classifiedcolumns = new Dictionary<string, string>();
            foreach (var column in dbinfo.ReferredEntities.Values) 
            {
                if (column.Classifications != null && column.Classifications.Count > 0)
                {
                    // name
                    object qName;
                    column.Attributes.TryGetValue("qualifiedName",out qName);
                    // classifications    
                    string classifications = column.Classifications[0].TypeName; // TODO: iterate over all
                    classifiedcolumns.Add(qName as string, classifications);
                }
            }
            _Logger.LogDebug("Found classified columns {0} in table {1}", classifiedcolumns.Count, tableguid);
            return classifiedcolumns;
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
                     { "resource", "https://projectbabylon.azure.net" }
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
