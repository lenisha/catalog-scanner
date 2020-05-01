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

    [Newtonsoft.Json.JsonObject("AzureCosmosDb")]
    [JsonTransformation]
    public partial class AzureCosmosDbDataSource : DataSource
    {
        /// <summary>
        /// Initializes a new instance of the AzureCosmosDbDataSource class.
        /// </summary>
        public AzureCosmosDbDataSource()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the AzureCosmosDbDataSource class.
        /// </summary>
        public AzureCosmosDbDataSource(string id = default(string), string name = default(string), System.DateTime? createdAt = default(System.DateTime?), System.DateTime? lastModifiedAt = default(System.DateTime?), string resourceGroup = default(string), string subscriptionId = default(string), string accountUri = default(string))
            : base(id, name)
        {
            CreatedAt = createdAt;
            LastModifiedAt = lastModifiedAt;
            ResourceGroup = resourceGroup;
            SubscriptionId = subscriptionId;
            AccountUri = accountUri;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

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
        [JsonProperty(PropertyName = "properties.resourceGroup")]
        public string ResourceGroup { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "properties.subscriptionId")]
        public string SubscriptionId { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "properties.accountUri")]
        public string AccountUri { get; set; }

    }
}
