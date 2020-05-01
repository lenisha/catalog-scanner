// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace ScannerBabylonService.Models
{
    using Microsoft.Rest;
    using Microsoft.Rest.Serialization;
    using Newtonsoft.Json;
    using System.Collections;
    using System.Collections.Generic;
    using System.Linq;

    [Newtonsoft.Json.JsonObject("AzureStorage")]
    [JsonTransformation]
    public partial class AzureStorageScanRuleset : ScanRuleset
    {
        /// <summary>
        /// Initializes a new instance of the AzureStorageScanRuleset class.
        /// </summary>
        public AzureStorageScanRuleset()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the AzureStorageScanRuleset class.
        /// </summary>
        public AzureStorageScanRuleset(string id = default(string), string name = default(string), System.DateTime? createdAt = default(System.DateTime?), System.DateTime? lastModifiedAt = default(System.DateTime?), IList<string> excludedSystemClassifications = default(IList<string>), IList<string> includedCustomClassificationRuleNames = default(IList<string>), string description = default(string), AzureStorageScanRulesetPropertiesScanningRule scanningRule = default(AzureStorageScanRulesetPropertiesScanningRule))
            : base(id, name)
        {
            CreatedAt = createdAt;
            LastModifiedAt = lastModifiedAt;
            ExcludedSystemClassifications = excludedSystemClassifications;
            IncludedCustomClassificationRuleNames = includedCustomClassificationRuleNames;
            Description = description;
            ScanningRule = scanningRule;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "properties.createdAt")]
        public System.DateTime? CreatedAt { get; private set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "properties.lastModifiedAt")]
        public System.DateTime? LastModifiedAt { get; private set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "properties.excludedSystemClassifications")]
        public IList<string> ExcludedSystemClassifications { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "properties.includedCustomClassificationRuleNames")]
        public IList<string> IncludedCustomClassificationRuleNames { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "properties.description")]
        public string Description { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "properties.scanningRule")]
        public AzureStorageScanRulesetPropertiesScanningRule ScanningRule { get; set; }

        /// <summary>
        /// Validate the object.
        /// </summary>
        /// <exception cref="ValidationException">
        /// Thrown if validation fails
        /// </exception>
        public virtual void Validate()
        {
            if (ExcludedSystemClassifications != null)
            {
                if (ExcludedSystemClassifications.Count != System.Linq.Enumerable.Count(System.Linq.Enumerable.Distinct(ExcludedSystemClassifications)))
                {
                    throw new ValidationException(ValidationRules.UniqueItems, "ExcludedSystemClassifications");
                }
            }
            if (IncludedCustomClassificationRuleNames != null)
            {
                if (IncludedCustomClassificationRuleNames.Count != System.Linq.Enumerable.Count(System.Linq.Enumerable.Distinct(IncludedCustomClassificationRuleNames)))
                {
                    throw new ValidationException(ValidationRules.UniqueItems, "IncludedCustomClassificationRuleNames");
                }
            }
            if (ScanningRule != null)
            {
                ScanningRule.Validate();
            }
        }
    }
}
