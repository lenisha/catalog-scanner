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
    /// AtlasError
    /// </summary>
    /// <remarks>
    /// The atlas error response.
    /// </remarks>
    public partial class JsonAtlasError
    {
        /// <summary>
        /// Initializes a new instance of the JsonAtlasError class.
        /// </summary>
        public JsonAtlasError()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the JsonAtlasError class.
        /// </summary>
        /// <param name="errorCode">Error code</param>
        /// <param name="errorMessage">Error message</param>
        public JsonAtlasError(string errorCode = default(string), string errorMessage = default(string))
        {
            ErrorCode = errorCode;
            ErrorMessage = errorMessage;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets or sets error code
        /// </summary>
        [JsonProperty(PropertyName = "errorCode")]
        public string ErrorCode { get; set; }

        /// <summary>
        /// Gets or sets error message
        /// </summary>
        [JsonProperty(PropertyName = "errorMessage")]
        public string ErrorMessage { get; set; }

    }
}