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

    [Newtonsoft.Json.JsonObject("AzureStorageSas")]
    [JsonTransformation]
    public partial class AzureStorageSasScan : Scan
    {
        /// <summary>
        /// Initializes a new instance of the AzureStorageSasScan class.
        /// </summary>
        public AzureStorageSasScan()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the AzureStorageSasScan class.
        /// </summary>
        public AzureStorageSasScan(string id = default(string), string name = default(string), string scanRulesetName = default(string), int? workers = default(int?), System.DateTime? createdAt = default(System.DateTime?), System.DateTime? lastModifiedAt = default(System.DateTime?), string sasUri = default(string))
            : base(id, name)
        {
            ScanRulesetName = scanRulesetName;
            Workers = workers;
            CreatedAt = createdAt;
            LastModifiedAt = lastModifiedAt;
            SasUri = sasUri;
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
        [JsonProperty(PropertyName = "properties.sasUri")]
        public string SasUri { get; set; }

    }
}
