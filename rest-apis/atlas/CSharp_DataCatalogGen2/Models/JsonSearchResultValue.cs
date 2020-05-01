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
    /// SearchResultValue
    /// </summary>
    /// <remarks>
    /// The result item of the search.
    /// </remarks>
    public partial class JsonSearchResultValue
    {
        /// <summary>
        /// Initializes a new instance of the JsonSearchResultValue class.
        /// </summary>
        public JsonSearchResultValue()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the JsonSearchResultValue class.
        /// </summary>
        /// <param name="searchhighlights">A highlight list that consists of
        /// index fields id ,qualifiedName, name, description, typeName, and
        /// owner. When the keyword appears in those fields, the value of the
        /// field, attached with emphasis mark, is returned as an element of
        /// @search.highlights list.</param>
        /// <param name="searchscore">The search score calculated by Azure
        /// Search. The results are ordered by search score by
        /// default..</param>
        /// <param name="description">The description of the record.</param>
        /// <param name="id">The ID of the record.</param>
        /// <param name="name">The name of the record.</param>
        /// <param name="owner">The owner of the record.</param>
        /// <param name="qualifiedName">The qualified name of the
        /// record.</param>
        /// <param name="typeName">The type name of the record.</param>
        public JsonSearchResultValue(JsonSearchHighlights searchhighlights, double? searchscore = default(double?), string description = default(string), string id = default(string), string name = default(string), string owner = default(string), string qualifiedName = default(string), string typeName = default(string), IList<string> allClassifications = default(IList<string>) )
        {
            Searchhighlights = searchhighlights;
            Searchscore = searchscore;
            Description = description;
            Id = id;
            Name = name;
            Owner = owner;
            QualifiedName = qualifiedName;
            TypeName = typeName;
            AllClassifications = allClassifications;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets or sets a highlight list that consists of index fields id
        /// ,qualifiedName, name, description, typeName, and owner. When the
        /// keyword appears in those fields, the value of the field, attached
        /// with emphasis mark, is returned as an element of @search.highlights
        /// list.
        /// </summary>
        [JsonProperty(PropertyName = "@search.highlights")]
        public JsonSearchHighlights Searchhighlights { get; set; }

        /// <summary>
        /// Gets or sets the search score calculated by Azure Search. The
        /// results are ordered by search score by default..
        /// </summary>
        [JsonProperty(PropertyName = "@search.score")]
        public double? Searchscore { get; set; }

        /// <summary>
        /// Gets or sets the description of the record.
        /// </summary>
        [JsonProperty(PropertyName = "description")]
        public string Description { get; set; }

        /// <summary>
        /// Gets or sets the ID of the record.
        /// </summary>
        [JsonProperty(PropertyName = "id")]
        public string Id { get; set; }

        /// <summary>
        /// Gets or sets the name of the record.
        /// </summary>
        [JsonProperty(PropertyName = "name")]
        public string Name { get; set; }

        /// <summary>
        /// Gets or sets the owner of the record.
        /// </summary>
        [JsonProperty(PropertyName = "owner")]
        public string Owner { get; set; }

        /// <summary>
        /// Gets or sets the qualified name of the record.
        /// </summary>
        [JsonProperty(PropertyName = "qualifiedName")]
        public string QualifiedName { get; set; }

        /// <summary>
        /// Gets or sets the type name of the record.
        /// </summary>
        [JsonProperty(PropertyName = "typeName")]
        public string TypeName { get; set; }

        [JsonProperty(PropertyName = "allClassifications")]
        public IList<string> AllClassifications { get; set; }
    }
}
