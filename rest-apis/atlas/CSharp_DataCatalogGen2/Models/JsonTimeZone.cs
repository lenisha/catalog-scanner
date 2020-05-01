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
    /// TimeZone
    /// </summary>
    /// <remarks>
    /// The timezone information.
    /// </remarks>
    public partial class JsonTimeZone
    {
        /// <summary>
        /// Initializes a new instance of the JsonTimeZone class.
        /// </summary>
        public JsonTimeZone()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the JsonTimeZone class.
        /// </summary>
        /// <param name="dSTSavings">The value of the daylight saving
        /// time.</param>
        /// <param name="id">The ID of the timezone.</param>
        /// <param name="availableIDs">An array of available IDs.</param>
        /// <param name="displayName">The display name of the timezone.</param>
        /// <param name="rawOffset">The raw offset of the timezone.</param>
        public JsonTimeZone(int? dSTSavings = default(int?), string id = default(string), IList<string> availableIDs = default(IList<string>), JsonTimeZone defaultProperty = default(JsonTimeZone), string displayName = default(string), int? rawOffset = default(int?))
        {
            DSTSavings = dSTSavings;
            ID = id;
            AvailableIDs = availableIDs;
            DefaultProperty = defaultProperty;
            DisplayName = displayName;
            RawOffset = rawOffset;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets or sets the value of the daylight saving time.
        /// </summary>
        [JsonProperty(PropertyName = "DSTSavings")]
        public int? DSTSavings { get; set; }

        /// <summary>
        /// Gets or sets the ID of the timezone.
        /// </summary>
        [JsonProperty(PropertyName = "ID")]
        public string ID { get; set; }

        /// <summary>
        /// Gets or sets an array of available IDs.
        /// </summary>
        [JsonProperty(PropertyName = "availableIDs")]
        public IList<string> AvailableIDs { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "default")]
        public JsonTimeZone DefaultProperty { get; set; }

        /// <summary>
        /// Gets or sets the display name of the timezone.
        /// </summary>
        [JsonProperty(PropertyName = "displayName")]
        public string DisplayName { get; set; }

        /// <summary>
        /// Gets or sets the raw offset of the timezone.
        /// </summary>
        [JsonProperty(PropertyName = "rawOffset")]
        public int? RawOffset { get; set; }

    }
}
