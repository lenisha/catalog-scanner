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

    [Newtonsoft.Json.JsonObject("Custom")]
    [JsonTransformation]
    public partial class CustomClassificationRule : ClassificationRule
    {
        /// <summary>
        /// Initializes a new instance of the CustomClassificationRule class.
        /// </summary>
        public CustomClassificationRule()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the CustomClassificationRule class.
        /// </summary>
        /// <param name="classificationAction">Possible values include: 'Keep',
        /// 'Delete'</param>
        /// <param name="ruleStatus">Possible values include: 'Enabled',
        /// 'Disabled'</param>
        public CustomClassificationRule(string id = default(string), string name = default(string), int? minimumDistinctMatchCount = default(int?), double? minimumPercentageMatch = default(double?), string classificationAction = default(string), IList<ClassificationRulePattern> dataPatterns = default(IList<ClassificationRulePattern>), IList<ClassificationRulePattern> columnPatterns = default(IList<ClassificationRulePattern>), string description = default(string), int? version = default(int?), string classificationName = default(string), string owner = default(string), string ruleStatus = default(string), System.DateTime? createdAt = default(System.DateTime?), System.DateTime? lastModifiedAt = default(System.DateTime?))
            : base(id, name)
        {
            MinimumDistinctMatchCount = minimumDistinctMatchCount;
            MinimumPercentageMatch = minimumPercentageMatch;
            ClassificationAction = classificationAction;
            DataPatterns = dataPatterns;
            ColumnPatterns = columnPatterns;
            Description = description;
            Version = version;
            ClassificationName = classificationName;
            Owner = owner;
            RuleStatus = ruleStatus;
            CreatedAt = createdAt;
            LastModifiedAt = lastModifiedAt;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "properties.minimumDistinctMatchCount")]
        public int? MinimumDistinctMatchCount { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "properties.minimumPercentageMatch")]
        public double? MinimumPercentageMatch { get; set; }

        /// <summary>
        /// Gets possible values include: 'Keep', 'Delete'
        /// </summary>
        [JsonProperty(PropertyName = "properties.classificationAction")]
        public string ClassificationAction { get; private set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "properties.dataPatterns")]
        public IList<ClassificationRulePattern> DataPatterns { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "properties.columnPatterns")]
        public IList<ClassificationRulePattern> ColumnPatterns { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "properties.description")]
        public string Description { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "properties.version")]
        public int? Version { get; private set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "properties.classificationName")]
        public string ClassificationName { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "properties.owner")]
        public string Owner { get; set; }

        /// <summary>
        /// Gets or sets possible values include: 'Enabled', 'Disabled'
        /// </summary>
        [JsonProperty(PropertyName = "properties.ruleStatus")]
        public string RuleStatus { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "properties.createdAt")]
        public System.DateTime? CreatedAt { get; private set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "properties.lastModifiedAt")]
        public System.DateTime? LastModifiedAt { get; private set; }

    }
}
