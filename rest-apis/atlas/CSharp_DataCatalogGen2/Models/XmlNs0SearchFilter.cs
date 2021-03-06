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
    /// searchFilter
    /// </summary>
    /// <remarks>
    /// Generic filter, to specify search criteria using name/value pairs.
    /// </remarks>
    public partial class XmlNs0SearchFilter
    {
        /// <summary>
        /// Initializes a new instance of the XmlNs0SearchFilter class.
        /// </summary>
        public XmlNs0SearchFilter()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the XmlNs0SearchFilter class.
        /// </summary>
        /// <param name="getCount">Determines if get the count.</param>
        /// <param name="maxRows">The maximum of rows.</param>
        /// <param name="paramsProperty">The parameter of the search.</param>
        /// <param name="sortBy">The sorted by field.</param>
        /// <param name="sortType">Possible values include: 'NONE', 'ASC',
        /// 'DESC'</param>
        /// <param name="startIndex">The start index of the search.</param>
        public XmlNs0SearchFilter(bool? getCount = default(bool?), long? maxRows = default(long?), object paramsProperty = default(object), string sortBy = default(string), string sortType = default(string), long? startIndex = default(long?))
        {
            GetCount = getCount;
            MaxRows = maxRows;
            ParamsProperty = paramsProperty;
            SortBy = sortBy;
            SortType = sortType;
            StartIndex = startIndex;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets or sets determines if get the count.
        /// </summary>
        [JsonProperty(PropertyName = "getCount")]
        public bool? GetCount { get; set; }

        /// <summary>
        /// Gets or sets the maximum of rows.
        /// </summary>
        [JsonProperty(PropertyName = "maxRows")]
        public long? MaxRows { get; set; }

        /// <summary>
        /// Gets or sets the parameter of the search.
        /// </summary>
        [JsonProperty(PropertyName = "params")]
        public object ParamsProperty { get; set; }

        /// <summary>
        /// Gets or sets the sorted by field.
        /// </summary>
        [JsonProperty(PropertyName = "sortBy")]
        public string SortBy { get; set; }

        /// <summary>
        /// Gets or sets possible values include: 'NONE', 'ASC', 'DESC'
        /// </summary>
        [JsonProperty(PropertyName = "sortType")]
        public string SortType { get; set; }

        /// <summary>
        /// Gets or sets the start index of the search.
        /// </summary>
        [JsonProperty(PropertyName = "startIndex")]
        public long? StartIndex { get; set; }

    }
}
