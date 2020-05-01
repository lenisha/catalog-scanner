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
    /// HookNotification
    /// </summary>
    /// <remarks>
    /// The base class for hook notification.
    /// </remarks>
    public partial class JsonHookNotification
    {
        /// <summary>
        /// Initializes a new instance of the JsonHookNotification class.
        /// </summary>
        public JsonHookNotification()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the JsonHookNotification class.
        /// </summary>
        /// <param name="type">The type of the notification. Different behavior
        /// will be invoked by the value. Possible values include:
        /// 'TYPE_CREATE', 'TYPE_UPDATE', 'ENTITY_CREATE',
        /// 'ENTITY_PARTIAL_UPDATE', 'ENTITY_FULL_UPDATE', 'ENTITY_DELETE',
        /// 'ENTITY_CREATE_V2', 'ENTITY_PARTIAL_UPDATE_V2',
        /// 'ENTITY_FULL_UPDATE_V2', 'ENTITY_DELETE_V2'</param>
        /// <param name="user">The user of the notification. Default to be
        /// "UNKNOWN".</param>
        public JsonHookNotification(string type = default(string), string user = default(string))
        {
            Type = type;
            User = user;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets or sets the type of the notification. Different behavior will
        /// be invoked by the value. Possible values include: 'TYPE_CREATE',
        /// 'TYPE_UPDATE', 'ENTITY_CREATE', 'ENTITY_PARTIAL_UPDATE',
        /// 'ENTITY_FULL_UPDATE', 'ENTITY_DELETE', 'ENTITY_CREATE_V2',
        /// 'ENTITY_PARTIAL_UPDATE_V2', 'ENTITY_FULL_UPDATE_V2',
        /// 'ENTITY_DELETE_V2'
        /// </summary>
        [JsonProperty(PropertyName = "type")]
        public string Type { get; set; }

        /// <summary>
        /// Gets or sets the user of the notification. Default to be "UNKNOWN".
        /// </summary>
        [JsonProperty(PropertyName = "user")]
        public string User { get; set; }

    }
}