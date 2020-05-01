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
    /// AtlasBaseModelObject
    /// </summary>
    /// <remarks>
    /// The base model object.
    /// </remarks>
    public partial class JsonAtlasBaseModelObject
    {
        /// <summary>
        /// Initializes a new instance of the JsonAtlasBaseModelObject class.
        /// </summary>
        public JsonAtlasBaseModelObject()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the JsonAtlasBaseModelObject class.
        /// </summary>
        /// <param name="guid">The GUID of the object.</param>
        public JsonAtlasBaseModelObject(string guid = default(string))
        {
            Guid = guid;
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

    }
}