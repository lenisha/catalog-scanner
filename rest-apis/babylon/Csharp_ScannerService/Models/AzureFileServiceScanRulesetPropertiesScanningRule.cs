// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace ScannerBabylonService.Models
{
    using System.Collections;
    using System.Collections.Generic;
    using System.Linq;

    public partial class AzureFileServiceScanRulesetPropertiesScanningRule : AzureFileServiceScanningRule
    {
        /// <summary>
        /// Initializes a new instance of the
        /// AzureFileServiceScanRulesetPropertiesScanningRule class.
        /// </summary>
        public AzureFileServiceScanRulesetPropertiesScanningRule()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the
        /// AzureFileServiceScanRulesetPropertiesScanningRule class.
        /// </summary>
        public AzureFileServiceScanRulesetPropertiesScanningRule(IList<string> fileExtensions = default(IList<string>))
            : base(fileExtensions)
        {
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Validate the object.
        /// </summary>
        /// <exception cref="Microsoft.Rest.ValidationException">
        /// Thrown if validation fails
        /// </exception>
        public override void Validate()
        {
            base.Validate();
        }
    }
}
