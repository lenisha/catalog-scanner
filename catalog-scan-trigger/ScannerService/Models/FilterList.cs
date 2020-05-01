// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace ScannerBabylonService.Models
{
    using Newtonsoft.Json;
    using System.Collections;
    using System.Collections.Generic;
    using System.Linq;

    public partial class FilterList
    {
        /// <summary>
        /// Initializes a new instance of the FilterList class.
        /// </summary>
        public FilterList()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the FilterList class.
        /// </summary>
        public FilterList(IList<Filter> value = default(IList<Filter>), string nextLink = default(string), long? count = default(long?))
        {
            Value = value;
            NextLink = nextLink;
            Count = count;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "value")]
        public IList<Filter> Value { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "nextLink")]
        public string NextLink { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "count")]
        public long? Count { get; set; }

    }
}