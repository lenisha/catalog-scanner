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
    /// ClassificationAssociateRequest
    /// </summary>
    /// <remarks>
    /// The request for classification association.
    /// </remarks>
    public partial class JsonClassificationAssociateRequest
    {
        /// <summary>
        /// Initializes a new instance of the
        /// JsonClassificationAssociateRequest class.
        /// </summary>
        public JsonClassificationAssociateRequest()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the
        /// JsonClassificationAssociateRequest class.
        /// </summary>
        /// <param name="entityGuids">The GUID of the entity.</param>
        /// <param name="entities">An array of Atlas Object Id with its parent
        /// GUID.</param>
        public JsonClassificationAssociateRequest(JsonAtlasClassification classification = default(JsonAtlasClassification), IList<string> entityGuids = default(IList<string>), IList<JsonAtlasObjectIdWithParentGuid> entities = default(IList<JsonAtlasObjectIdWithParentGuid>))
        {
            Classification = classification;
            EntityGuids = entityGuids;
            Entities = entities;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "classification")]
        public JsonAtlasClassification Classification { get; set; }

        /// <summary>
        /// Gets or sets the GUID of the entity.
        /// </summary>
        [JsonProperty(PropertyName = "entityGuids")]
        public IList<string> EntityGuids { get; set; }

        /// <summary>
        /// Gets or sets an array of Atlas Object Id with its parent GUID.
        /// </summary>
        [JsonProperty(PropertyName = "entities")]
        public IList<JsonAtlasObjectIdWithParentGuid> Entities { get; set; }

    }
}
