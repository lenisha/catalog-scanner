/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.msft.babylonscanningservice.models;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The SystemClassificationRuleProperties model.
 */
public class SystemClassificationRuleProperties {
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
     * @return the SystemClassificationRuleProperties object itself.
     */
    public SystemClassificationRuleProperties withDescription(String description) {
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
     * @return the SystemClassificationRuleProperties object itself.
     */
    public SystemClassificationRuleProperties withClassificationName(String classificationName) {
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
     * @return the SystemClassificationRuleProperties object itself.
     */
    public SystemClassificationRuleProperties withOwner(String owner) {
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
     * @return the SystemClassificationRuleProperties object itself.
     */
    public SystemClassificationRuleProperties withRuleStatus(String ruleStatus) {
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
