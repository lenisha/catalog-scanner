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
    /// SearchHighlights
    /// </summary>
    /// <remarks>
    /// The search highlights of the result.
    /// </remarks>
    public partial class JsonSearchHighlights
    {
        /// <summary>
        /// Initializes a new instance of the JsonSearchHighlights class.
        /// </summary>
        public JsonSearchHighlights()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the JsonSearchHighlights class.
        /// </summary>
        public JsonSearchHighlights(IList<string> name = default(IList<string>), IList<string> qualifiedName = default(IList<string>))
        {
            Name = name;
            QualifiedName = qualifiedName;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "name")]
        public IList<string> Name { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "qualifiedName")]
        public IList<string> QualifiedName { get; set; }

    }
}