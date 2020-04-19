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
    /// AtlasRelatedCategoryHeader
    /// </summary>
    /// <remarks>
    /// The header of the related category.
    /// </remarks>
    public partial class JsonAtlasRelatedCategoryHeader
    {
        /// <summary>
        /// Initializes a new instance of the JsonAtlasRelatedCategoryHeader
        /// class.
        /// </summary>
        public JsonAtlasRelatedCategoryHeader()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the JsonAtlasRelatedCategoryHeader
        /// class.
        /// </summary>
        /// <param name="categoryGuid">The GUID of the category.</param>
        /// <param name="description">The description of the category
        /// header.</param>
        /// <param name="displayText">The display text.</param>
        /// <param name="parentCategoryGuid">The GUID of the parent
        /// category.</param>
        /// <param name="relationGuid">The GUID of the relationship.</param>
        public JsonAtlasRelatedCategoryHeader(string categoryGuid = default(string), string description = default(string), string displayText = default(string), string parentCategoryGuid = default(string), string relationGuid = default(string))
        {
            CategoryGuid = categoryGuid;
            Description = description;
            DisplayText = displayText;
            ParentCategoryGuid = parentCategoryGuid;
            RelationGuid = relationGuid;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets or sets the GUID of the category.
        /// </summary>
        [JsonProperty(PropertyName = "categoryGuid")]
        public string CategoryGuid { get; set; }

        /// <summary>
        /// Gets or sets the description of the category header.
        /// </summary>
        [JsonProperty(PropertyName = "description")]
        public string Description { get; set; }

        /// <summary>
        /// Gets or sets the display text.
        /// </summary>
        [JsonProperty(PropertyName = "displayText")]
        public string DisplayText { get; set; }

        /// <summary>
        /// Gets or sets the GUID of the parent category.
        /// </summary>
        [JsonProperty(PropertyName = "parentCategoryGuid")]
        public string ParentCategoryGuid { get; set; }

        /// <summary>
        /// Gets or sets the GUID of the relationship.
        /// </summary>
        [JsonProperty(PropertyName = "relationGuid")]
        public string RelationGuid { get; set; }

    }
}