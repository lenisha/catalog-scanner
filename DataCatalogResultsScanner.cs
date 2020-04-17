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
        private static string BASE_URI = "https://contoso.catalog.azure.com/api/atlas";

        ILogger _Logger;
        IConfiguration _Config;


        public DataCatalogResultsScanner(ILoggerFactory logger, IConfiguration config)
        {

            _Logger = logger.CreateLogger<DataCatalogResultsScanner>();
            _Config = config;
        }

        public void Run()
        {
            // Get token and set auth
            var svcClientCreds = new TokenCredentials(getToken(), "Bearer");
            var client = new DataCatalogClient(svcClientCreds);
            // Overwrite base URI if needed
            client.BaseUri = new System.Uri(BASE_URI);
            // /v2/entity/guid/{guid}
            var task = client.EntityREST.GetByIdWithHttpMessagesAsync("97c36ab1-016f-f099-63d1-042f71e6de81");
            task.Wait();

            _Logger.LogInformation("\nURI:\n {0}", task.Result.Request.RequestUri);
            _Logger.LogInformation("\nStatus Code:\n {0}", task.Result.Response.StatusCode);
            printResultBody(task.Result.Body);

        }

        private  void printResultBody(Object body)
        {
            _Logger.LogInformation("\n Result:\n {0}", JsonConvert.SerializeObject(body, Formatting.Indented));
        }

        private  string getToken()
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
    }
}
