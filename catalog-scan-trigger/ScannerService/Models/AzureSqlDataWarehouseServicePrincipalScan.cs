// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace ScannerBabylonService.Models
{
    using Microsoft.Rest;
    using Microsoft.Rest.Serialization;
    using Newtonsoft.Json;
    using System.Linq;

    [Newtonsoft.Json.JsonObject("AzureSqlDataWarehouseServicePrincipal")]
    [JsonTransformation]
    public partial class AzureSqlDataWarehouseServicePrincipalScan : Scan
    {
        /// <summary>
        /// Initializes a new instance of the
        /// AzureSqlDataWarehouseServicePrincipalScan class.
        /// </summary>
        public AzureSqlDataWarehouseServicePrincipalScan()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the
        /// AzureSqlDataWarehouseServicePrincipalScan class.
        /// </summary>
        public AzureSqlDataWarehouseServicePrincipalScan(string id = default(string), string name = default(string), string scanRulesetName = default(string), int? workers = default(int?), System.DateTime? createdAt = default(System.DateTime?), System.DateTime? lastModifiedAt = default(System.DateTime?), string serverEndpoint = default(string), string databaseName = default(string), string tenantId = default(string), string servicePrincipalId = default(string), string servicePrincipalKey = default(string))
            : base(id, name)
        {
            ScanRulesetName = scanRulesetName;
            Workers = workers;
            CreatedAt = createdAt;
            LastModifiedAt = lastModifiedAt;
            ServerEndpoint = serverEndpoint;
            DatabaseName = databaseName;
            TenantId = tenantId;
            ServicePrincipalId = servicePrincipalId;
            ServicePrincipalKey = servicePrincipalKey;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "properties.scanRulesetName")]
        public string ScanRulesetName { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "properties.workers")]
        public int? Workers { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "properties.createdAt")]
        public System.DateTime? CreatedAt { get; private set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "properties.lastModifiedAt")]
        public System.DateTime? LastModifiedAt { get; private set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "properties.serverEndpoint")]
        public string ServerEndpoint { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "properties.databaseName")]
        public string DatabaseName { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "properties.tenantId")]
        public string TenantId { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "properties.servicePrincipalId")]
        public string ServicePrincipalId { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "properties.servicePrincipalKey")]
        public string ServicePrincipalKey { get; set; }

    }
}
