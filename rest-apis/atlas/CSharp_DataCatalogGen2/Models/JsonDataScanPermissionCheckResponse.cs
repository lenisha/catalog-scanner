// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace DataCatalogGen2.Models
{
    using Newtonsoft.Json;
    using System.Linq;

    /// <summary>
    /// DataScanPermissionCheckResponse
    /// </summary>
    /// <remarks>
    /// Response for data scan permission check.
    /// </remarks>
    public partial class JsonDataScanPermissionCheckResponse
    {
        /// <summary>
        /// Initializes a new instance of the
        /// JsonDataScanPermissionCheckResponse class.
        /// </summary>
        public JsonDataScanPermissionCheckResponse()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the
        /// JsonDataScanPermissionCheckResponse class.
        /// </summary>
        /// <param name="result">The result of the response.</param>
        public JsonDataScanPermissionCheckResponse(string result = default(string))
        {
            Result = result;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets or sets the result of the response.
        /// </summary>
        [JsonProperty(PropertyName = "result")]
        public string Result { get; set; }

    }
}
