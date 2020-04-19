// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace DataCatalogGen2.Models
{
    using Newtonsoft.Json;
    using System.Collections;
    using System.Collections.Generic;
    using System.Linq;

    /// <summary>
    /// AutocompleteResult
    /// </summary>
    /// <remarks>
    /// The result of the autocomplete request.
    /// </remarks>
    public partial class JsonAutocompleteResult
    {
        /// <summary>
        /// Initializes a new instance of the JsonAutocompleteResult class.
        /// </summary>
        public JsonAutocompleteResult()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the JsonAutocompleteResult class.
        /// </summary>
        public JsonAutocompleteResult(IList<JsonAutocompleteResultValue> value = default(IList<JsonAutocompleteResultValue>))
        {
            Value = value;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "value")]
        public IList<JsonAutocompleteResultValue> Value { get; set; }

    }
}