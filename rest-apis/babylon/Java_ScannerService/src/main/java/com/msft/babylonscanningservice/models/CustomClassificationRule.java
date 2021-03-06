/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.msft.babylonscanningservice.models;

import java.util.List;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The CustomClassificationRule model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind", defaultImpl = CustomClassificationRule.class)
@JsonTypeName("Custom")
@JsonFlatten
public class CustomClassificationRule extends ClassificationRule {
    /**
     * The minimumDistinctMatchCount property.
     */
    @JsonProperty(value = "properties.minimumDistinctMatchCount")
    private Integer minimumDistinctMatchCount;

    /**
     * The minimumPercentageMatch property.
     */
    @JsonProperty(value = "properties.minimumPercentageMatch")
    private Double minimumPercentageMatch;

    /**
     * Possible values include: 'Keep', 'Delete'.
     */
    @JsonProperty(value = "properties.classificationAction", access = JsonProperty.Access.WRITE_ONLY)
    private String classificationAction;

    /**
     * The dataPatterns property.
     */
    @JsonProperty(value = "properties.dataPatterns")
    private List<ClassificationRulePattern> dataPatterns;

    /**
     * The columnPatterns property.
     */
    @JsonProperty(value = "properties.columnPatterns")
    private List<ClassificationRulePattern> columnPatterns;

    /**
     * The description property.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * The version property.
     */
    @JsonProperty(value = "properties.version", access = JsonProperty.Access.WRITE_ONLY)
    private Integer version;

    /**
     * The classificationName property.
     */
    @JsonProperty(value = "properties.classificationName")
    private String classificationName;

    /**
     * The owner property.
     */
    @JsonProperty(value = "properties.owner")
    private String owner;

    /**
     * Possible values include: 'Enabled', 'Disabled'.
     */
    @JsonProperty(value = "properties.ruleStatus")
    private String ruleStatus;

    /**
     * The createdAt property.
     */
    @JsonProperty(value = "properties.createdAt", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime createdAt;

    /**
     * The lastModifiedAt property.
     */
    @JsonProperty(value = "properties.lastModifiedAt", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastModifiedAt;

    /**
     * Get the minimumDistinctMatchCount value.
     *
     * @return the minimumDistinctMatchCount value
     */
    public Integer minimumDistinctMatchCount() {
        return this.minimumDistinctMatchCount;
    }

    /**
     * Set the minimumDistinctMatchCount value.
     *
     * @param minimumDistinctMatchCount the minimumDistinctMatchCount value to set
     * @return the CustomClassificationRule object itself.
     */
    public CustomClassificationRule withMinimumDistinctMatchCount(Integer minimumDistinctMatchCount) {
        this.minimumDistinctMatchCount = minimumDistinctMatchCount;
        return this;
    }

    /**
     * Get the minimumPercentageMatch value.
     *
     * @return the minimumPercentageMatch value
     */
    public Double minimumPercentageMatch() {
        return this.minimumPercentageMatch;
    }

    /**
     * Set the minimumPercentageMatch value.
     *
     * @param minimumPercentageMatch the minimumPercentageMatch value to set
     * @return the CustomClassificationRule object itself.
     */
    public CustomClassificationRule withMinimumPercentageMatch(Double minimumPercentageMatch) {
        this.minimumPercentageMatch = minimumPercentageMatch;
        return this;
    }

    /**
     * Get possible values include: 'Keep', 'Delete'.
     *
     * @return the classificationAction value
     */
    public String classificationAction() {
        return this.classificationAction;
    }

    /**
     * Get the dataPatterns value.
     *
     * @return the dataPatterns value
     */
    public List<ClassificationRulePattern> dataPatterns() {
        return this.dataPatterns;
    }

    /**
     * Set the dataPatterns value.
     *
     * @param dataPatterns the dataPatterns value to set
     * @return the CustomClassificationRule object itself.
     */
    public CustomClassificationRule withDataPatterns(List<ClassificationRulePattern> dataPatterns) {
        this.dataPatterns = dataPatterns;
        return this;
    }

    /**
     * Get the columnPatterns value.
     *
     * @return the columnPatterns value
     */
    public List<ClassificationRulePattern> columnPatterns() {
        return this.columnPatterns;
    }

    /**
     * Set the columnPatterns value.
     *
     * @param columnPatterns the columnPatterns value to set
     * @return the CustomClassificationRule object itself.
     */
    public CustomClassificationRule withColumnPatterns(List<ClassificationRulePattern> columnPatterns) {
        this.columnPatterns = columnPatterns;
        return this;
    }

    /**
     * Get the description value.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description value.
     *
     * @param description the description value to set
     * @return the CustomClassificationRule object itself.
     */
    public CustomClassificationRule withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the version value.
     *
     * @return the version value
     */
    public Integer version() {
        return this.version;
    }

    /**
     * Get the classificationName value.
     *
     * @return the classificationName value
     */
    public String classificationName() {
        return this.classificationName;
    }

    /**
     * Set the classificationName value.
     *
     * @param classificationName the classificationName value to set
     * @return the CustomClassificationRule object itself.
     */
    public CustomClassificationRule withClassificationName(String classificationName) {
        this.classificationName = classificationName;
        return this;
    }

    /**
     * Get the owner value.
     *
     * @return the owner value
     */
    public String owner() {
        return this.owner;
    }

    /**
     * Set the owner value.
     *
     * @param owner the owner value to set
     * @return the CustomClassificationRule object itself.
     */
    public CustomClassificationRule withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Get possible values include: 'Enabled', 'Disabled'.
     *
     * @return the ruleStatus value
     */
    public String ruleStatus() {
        return this.ruleStatus;
    }

    /**
     * Set possible values include: 'Enabled', 'Disabled'.
     *
     * @param ruleStatus the ruleStatus value to set
     * @return the CustomClassificationRule object itself.
     */
    public CustomClassificationRule withRuleStatus(String ruleStatus) {
        this.ruleStatus = ruleStatus;
        return this;
    }

    /**
     * Get the createdAt value.
     *
     * @return the createdAt value
     */
    public DateTime createdAt() {
        return this.createdAt;
    }

    /**
     * Get the lastModifiedAt value.
     *
     * @return the lastModifiedAt value
     */
    public DateTime lastModifiedAt() {
        return this.lastModifiedAt;
    }

}
