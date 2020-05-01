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

    [Newtonsoft.Json.JsonObject("AzureSqlDataWarehouseMsi")]
    [JsonTransformation]
    public partial class AzureSqlDataWarehouseMsiScan : Scan
    {
        /// <summary>
        /// Initializes a new instance of the AzureSqlDataWarehouseMsiScan
        /// class.
        /// </summary>
        public AzureSqlDataWarehouseMsiScan()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the AzureSqlDataWarehouseMsiScan
        /// class.
        /// </summary>
        public AzureSqlDataWarehouseMsiScan(string id = default(string), string name = default(string), string scanRulesetName = default(string), int? workers = default(int?), System.DateTime? createdAt = default(System.DateTime?), System.DateTime? lastModifiedAt = default(System.DateTime?), string serverEndpoint = default(string), string databaseName = default(string))
            : base(id, name)
        {
            ScanRulesetName = scanRulesetName;
            Workers = workers;
            CreatedAt = createdAt;
            LastModifiedAt = lastModifiedAt;
            ServerEndpoint = serverEndpoint;
            DatabaseName = databaseName;
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

    }
}