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
    /// AtlasObjectId
    /// </summary>
    /// <remarks>
    /// Reference to an object-instance of an Atlas type - like entity.
    /// </remarks>
    public partial class JsonAtlasObjectId
    {
        /// <summary>
        /// Initializes a new instance of the JsonAtlasObjectId class.
        /// </summary>
        public JsonAtlasObjectId()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the JsonAtlasObjectId class.
        /// </summary>
        /// <param name="guid">The GUID of the object.</param>
        /// <param name="typeName">The name of the type.</param>
        /// <param name="uniqueAttributes">The unique attributes of the
        /// object.</param>
        public JsonAtlasObjectId(string guid = default(string), string typeName = default(string), IDictionary<string, object> uniqueAttributes = default(IDictionary<string, object>))
        {
            Guid = guid;
            TypeName = typeName;
            UniqueAttributes = uniqueAttributes;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets or sets the GUID of the object.
        /// </summary>
        [JsonProperty(PropertyName = "guid")]
        public string Guid { get; set; }

        /// <summary>
        /// Gets or sets the name of the type.
        /// </summary>
        [JsonProperty(PropertyName = "typeName")]
        public string TypeName { get; set; }

        /// <summary>
        /// Gets or sets the unique attributes of the object.
        /// </summary>
        [JsonProperty(PropertyName = "uniqueAttributes")]
        public IDictionary<string, object> UniqueAttributes { get; set; }

    }
}
