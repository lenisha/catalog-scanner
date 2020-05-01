/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.msft.babylonscanningservice.models;

import org.joda.time.DateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The AzureSqlDatabaseScanRuleset model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind", defaultImpl = AzureSqlDatabaseScanRuleset.class)
@JsonTypeName("AzureSqlDatabase")
@JsonFlatten
public class AzureSqlDatabaseScanRuleset extends ScanRuleset {
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
     * The excludedSystemClassifications property.
     */
    @JsonProperty(value = "properties.excludedSystemClassifications")
    private List<String> excludedSystemClassifications;

    /**
     * The includedCustomClassificationRuleNames property.
     */
    @JsonProperty(value = "properties.includedCustomClassificationRuleNames")
    private List<String> includedCustomClassificationRuleNames;

    /**
     * The description property.
     */
    @JsonProperty(value = "properties.description")
    private String description;

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

    /**
     * Get the excludedSystemClassifications value.
     *
     * @return the excludedSystemClassifications value
     */
    public List<String> excludedSystemClassifications() {
        return this.excludedSystemClassifications;
    }

    /**
     * Set the excludedSystemClassifications value.
     *
     * @param excludedSystemClassifications the excludedSystemClassifications value to set
     * @return the AzureSqlDatabaseScanRuleset object itself.
     */
    public AzureSqlDatabaseScanRuleset withExcludedSystemClassifications(List<String> excludedSystemClassifications) {
        this.excludedSystemClassifications = excludedSystemClassifications;
        return this;
    }

    /**
     * Get the includedCustomClassificationRuleNames value.
     *
     * @return the includedCustomClassificationRuleNames value
     */
    public List<String> includedCustomClassificationRuleNames() {
        return this.includedCustomClassificationRuleNames;
    }

    /**
     * Set the includedCustomClassificationRuleNames value.
     *
     * @param includedCustomClassificationRuleNames the includedCustomClassificationRuleNames value to set
     * @return the AzureSqlDatabaseScanRuleset object itself.
     */
    public AzureSqlDatabaseScanRuleset withIncludedCustomClassificationRuleNames(List<String> includedCustomClassificationRuleNames) {
        this.includedCustomClassificationRuleNames = includedCustomClassificationRuleNames;
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
     * @return the AzureSqlDatabaseScanRuleset object itself.
     */
    public AzureSqlDatabaseScanRuleset withDescription(String description) {
        this.description = description;
        return this;
    }

}
