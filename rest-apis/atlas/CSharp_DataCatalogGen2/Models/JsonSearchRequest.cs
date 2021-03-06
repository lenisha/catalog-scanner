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
    /// SearchRequest
    /// </summary>
    /// <remarks>
    /// The search query of advanced search request.
    /// </remarks>
    public partial class JsonSearchRequest
    {
        /// <summary>
        /// Initializes a new instance of the JsonSearchRequest class.
        /// </summary>
        public JsonSearchRequest()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the JsonSearchRequest class.
        /// </summary>
        /// <param name="keywords">The keywords applied to all searchable
        /// fields.</param>
        /// <param name="offset">The offset. The default value is 0.</param>
        /// <param name="limit">The limit of the number of the search result.
        /// default value is 50; maximum value is 1000.</param>
        /// <param name="filter">The filter for the search.</param>
        public JsonSearchRequest(string keywords = default(string), int? offset = default(int?), int? limit = default(int?), object filter = default(object))
        {
            Keywords = keywords;
            Offset = offset;
            Limit = limit;
            Filter = filter;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets or sets the keywords applied to all searchable fields.
        /// </summary>
        [JsonProperty(PropertyName = "keywords")]
        public string Keywords { get; set; }

        /// <summary>
        /// Gets or sets the offset. The default value is 0.
        /// </summary>
        [JsonProperty(PropertyName = "offset")]
        public int? Offset { get; set; }

        /// <summary>
        /// Gets or sets the limit of the number of the search result. default
        /// value is 50; maximum value is 1000.
        /// </summary>
        [JsonProperty(PropertyName = "limit")]
        public int? Limit { get; set; }

        /// <summary>
        /// Gets or sets the filter for the search.
        /// </summary>
        [JsonProperty(PropertyName = "filter")]
        public object Filter { get; set; }

    }
}
