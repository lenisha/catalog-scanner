/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.msft.babylonscanningservice.models;

import java.util.List;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The CustomClassificationRuleProperties model.
 */
public class CustomClassificationRuleProperties {
    /**
     * The minimumDistinctMatchCount property.
     */
    @JsonProperty(value = "minimumDistinctMatchCount")
    private Integer minimumDistinctMatchCount;

    /**
     * The minimumPercentageMatch property.
     */
    @JsonProperty(value = "minimumPercentageMatch")
    private Double minimumPercentageMatch;

    /**
     * Possible values include: 'Keep', 'Delete'.
     */
    @JsonProperty(value = "classificationAction", access = JsonProperty.Access.WRITE_ONLY)
    private String classificationAction;

    /**
     * The dataPatterns property.
     */
    @JsonProperty(value = "dataPatterns")
    private List<ClassificationRulePattern> dataPatterns;

    /**
     * The columnPatterns property.
     */
    @JsonProperty(value = "columnPatterns")
    private List<ClassificationRulePattern> columnPatterns;

    /**
     * The description property.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * The version property.
     */
    @JsonProperty(value = "version", access = JsonProperty.Access.WRITE_ONLY)
    private Integer version;

    /**
     * The classificationName property.
     */
    @JsonProperty(value = "classificationName")
    private String classificationName;

    /**
     * The owner property.
     */
    @JsonProperty(value = "owner")
    private String owner;

    /**
     * Possible values include: 'Enabled', 'Disabled'.
     */
    @JsonProperty(value = "ruleStatus")
    private String ruleStatus;

    /**
     * The createdAt property.
     */
    @JsonProperty(value = "createdAt", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime createdAt;

    /**
     * The lastModifiedAt property.
     */
    @JsonProperty(value = "lastModifiedAt", access = JsonProperty.Access.WRITE_ONLY)
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
     * @return the CustomClassificationRuleProperties object itself.
     */
    public CustomClassificationRuleProperties withMinimumDistinctMatchCount(Integer minimumDistinctMatchCount) {
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
     * @return the CustomClassificationRuleProperties object itself.
     */
    public CustomClassificationRuleProperties withMinimumPercentageMatch(Double minimumPercentageMatch) {
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
     * @return the CustomClassificationRuleProperties object itself.
     */
    public CustomClassificationRuleProperties withDataPatterns(List<ClassificationRulePattern> dataPatterns) {
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
     * @return the CustomClassificationRuleProperties object itself.
     */
    public CustomClassificationRuleProperties withColumnPatterns(List<ClassificationRulePattern> columnPatterns) {
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
     * @return the CustomClassificationRuleProperties object itself.
     */
    public CustomClassificationRuleProperties withDescription(String description) {
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
     * @return the CustomClassificationRuleProperties object itself.
     */
    public CustomClassificationRuleProperties withClassificationName(String classificationName) {
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
     * @return the CustomClassificationRuleProperties object itself.
     */
    public CustomClassificationRuleProperties withOwner(String owner) {
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
     * @return the CustomClassificationRuleProperties object itself.
     */
    public CustomClassificationRuleProperties withRuleStatus(String ruleStatus) {
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