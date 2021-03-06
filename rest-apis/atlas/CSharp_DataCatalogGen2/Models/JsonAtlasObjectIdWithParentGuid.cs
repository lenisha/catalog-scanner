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
    /// AtlasObjectIdWithParentGuid
    /// </summary>
    /// <remarks>
    /// Reference to an object-instance of AtlasEntity type along with its
    /// parent entity guid
    /// </remarks>
    public partial class JsonAtlasObjectIdWithParentGuid : JsonAtlasObjectId
    {
        /// <summary>
        /// Initializes a new instance of the JsonAtlasObjectIdWithParentGuid
        /// class.
        /// </summary>
        public JsonAtlasObjectIdWithParentGuid()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the JsonAtlasObjectIdWithParentGuid
        /// class.
        /// </summary>
        /// <param name="guid">The GUID of the object.</param>
        /// <param name="typeName">The name of the type.</param>
        /// <param name="uniqueAttributes">The unique attributes of the
        /// object.</param>
        /// <param name="parentEntityGuid">The parent entity guid.</param>
        public JsonAtlasObjectIdWithParentGuid(string guid = default(string), string typeName = default(string), IDictionary<string, object> uniqueAttributes = default(IDictionary<string, object>), string parentEntityGuid = default(string))
            : base(guid, typeName, uniqueAttributes)
        {
            ParentEntityGuid = parentEntityGuid;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets or sets the parent entity guid.
        /// </summary>
        [JsonProperty(PropertyName = "parentEntityGuid")]
        public string ParentEntityGuid { get; set; }

    }
}
