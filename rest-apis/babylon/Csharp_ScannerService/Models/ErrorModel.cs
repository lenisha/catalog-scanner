// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace ScannerBabylonService.Models
{
    using Newtonsoft.Json;
    using System.Collections;
    using System.Collections.Generic;
    using System.Linq;

    public partial class ErrorModel
    {
        /// <summary>
        /// Initializes a new instance of the ErrorModel class.
        /// </summary>
        public ErrorModel()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the ErrorModel class.
        /// </summary>
        public ErrorModel(string code = default(string), string message = default(string), string target = default(string), IList<ErrorModel> details = default(IList<ErrorModel>))
        {
            Code = code;
            Message = message;
            Target = target;
            Details = details;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "code")]
        public string Code { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "message")]
        public string Message { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "target")]
        public string Target { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "details")]
        public IList<ErrorModel> Details { get; set; }

    }
}
