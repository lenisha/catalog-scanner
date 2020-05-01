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
    /// AtlasRelationshipEndDef
    /// </summary>
    /// <remarks>
    /// The relationshipEndDef represents an end of the relationship. The end
    /// of the relationship is defined by a type, an
    /// attribute name, cardinality and whether it  is the container end of the
    /// relationship.
    /// </remarks>
    public partial class JsonAtlasRelationshipEndDef
    {
        /// <summary>
        /// Initializes a new instance of the JsonAtlasRelationshipEndDef
        /// class.
        /// </summary>
        public JsonAtlasRelationshipEndDef()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the JsonAtlasRelationshipEndDef
        /// class.
        /// </summary>
        /// <param name="cardinality">Possible values include: 'SINGLE',
        /// 'LIST', 'SET'</param>
        /// <param name="description">The description of the relationship end
        /// definition.</param>
        /// <param name="isContainer">Determines if it is container.</param>
        /// <param name="isLegacyAttribute">Determines if it is a legacy
        /// attribute.</param>
        /// <param name="name">The name of the relationship end
        /// definition.</param>
        /// <param name="type">The type of the relationship end.</param>
        public JsonAtlasRelationshipEndDef(string cardinality = default(string), string description = default(string), bool? isContainer = default(bool?), bool? isLegacyAttribute = default(bool?), string name = default(string), string type = default(string))
        {
            Cardinality = cardinality;
            Description = description;
            IsContainer = isContainer;
            IsLegacyAttribute = isLegacyAttribute;
            Name = name;
            Type = type;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets or sets possible values include: 'SINGLE', 'LIST', 'SET'
        /// </summary>
        [JsonProperty(PropertyName = "cardinality")]
        public string Cardinality { get; set; }

        /// <summary>
        /// Gets or sets the description of the relationship end definition.
        /// </summary>
        [JsonProperty(PropertyName = "description")]
        public string Description { get; set; }

        /// <summary>
        /// Gets or sets determines if it is container.
        /// </summary>
        [JsonProperty(PropertyName = "isContainer")]
        public bool? IsContainer { get; set; }

        /// <summary>
        /// Gets or sets determines if it is a legacy attribute.
        /// </summary>
        [JsonProperty(PropertyName = "isLegacyAttribute")]
        public bool? IsLegacyAttribute { get; set; }

        /// <summary>
        /// Gets or sets the name of the relationship end definition.
        /// </summary>
        [JsonProperty(PropertyName = "name")]
        public string Name { get; set; }

        /// <summary>
        /// Gets or sets the type of the relationship end.
        /// </summary>
        [JsonProperty(PropertyName = "type")]
        public string Type { get; set; }

    }
}