// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace ScannerBabylonService.Models
{
    using Newtonsoft.Json;
    using System.Linq;

    [Newtonsoft.Json.JsonObject("Scan")]
    public partial class Scan : ProxyResource
    {
        /// <summary>
        /// Initializes a new instance of the Scan class.
        /// </summary>
        public Scan()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the Scan class.
        /// </summary>
        public Scan(string id = default(string), string name = default(string))
            : base(id, name)
        {
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

    }
}
