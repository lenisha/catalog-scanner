// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace ScannerBabylonService.Models
{
    using Newtonsoft.Json;
    using System.Linq;

    public partial class ScanRunProperties
    {
        /// <summary>
        /// Initializes a new instance of the ScanRunProperties class.
        /// </summary>
        public ScanRunProperties()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the ScanRunProperties class.
        /// </summary>
        /// <param name="scanLevel">Possible values include: 'Full',
        /// 'Incremental'</param>
        public ScanRunProperties(string scanLevel = default(string), System.DateTime? incrementalScanStartTime = default(System.DateTime?))
        {
            ScanLevel = scanLevel;
            IncrementalScanStartTime = incrementalScanStartTime;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets or sets possible values include: 'Full', 'Incremental'
        /// </summary>
        [JsonProperty(PropertyName = "scanLevel")]
        public string ScanLevel { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "incrementalScanStartTime")]
        public System.DateTime? IncrementalScanStartTime { get; set; }

    }
}