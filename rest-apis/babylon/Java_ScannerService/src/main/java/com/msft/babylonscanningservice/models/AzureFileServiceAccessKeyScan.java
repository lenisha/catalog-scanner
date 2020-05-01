/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.msft.babylonscanningservice.models;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The AzureFileServiceAccessKeyScan model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind", defaultImpl = AzureFileServiceAccessKeyScan.class)
@JsonTypeName("AzureFileServiceAccessKey")
@JsonFlatten
public class AzureFileServiceAccessKeyScan extends Scan {
    /**
     * The scanRulesetName property.
     */
    @JsonProperty(value = "properties.scanRulesetName")
    private String scanRulesetName;

    /**
     * The workers property.
     */
    @JsonProperty(value = "properties.workers")
    private Integer workers;

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
     * The accessKey property.
     */
    @JsonProperty(value = "properties.accessKey")
    private String accessKey;

    /**
     * The shareName property.
     */
    @JsonProperty(value = "properties.shareName")
    private String shareName;

    /**
     * Get the scanRulesetName value.
     *
     * @return the scanRulesetName value
     */
    public String scanRulesetName() {
        return this.scanRulesetName;
    }

    /**
     * Set the scanRulesetName value.
     *
     * @param scanRulesetName the scanRulesetName value to set
     * @return the AzureFileServiceAccessKeyScan object itself.
     */
    public AzureFileServiceAccessKeyScan withScanRulesetName(String scanRulesetName) {
        this.scanRulesetName = scanRulesetName;
        return this;
    }

    /**
     * Get the workers value.
     *
     * @return the workers value
     */
    public Integer workers() {
        return this.workers;
    }

    /**
     * Set the workers value.
     *
     * @param workers the workers value to set
     * @return the AzureFileServiceAccessKeyScan object itself.
     */
    public AzureFileServiceAccessKeyScan withWorkers(Integer workers) {
        this.workers = workers;
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

    /**
     * Get the accessKey value.
     *
     * @return the accessKey value
     */
    public String accessKey() {
        return this.accessKey;
    }

    /**
     * Set the accessKey value.
     *
     * @param accessKey the accessKey value to set
     * @return the AzureFileServiceAccessKeyScan object itself.
     */
    public AzureFileServiceAccessKeyScan withAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    /**
     * Get the shareName value.
     *
     * @return the shareName value
     */
    public String shareName() {
        return this.shareName;
    }

    /**
     * Set the shareName value.
     *
     * @param shareName the shareName value to set
     * @return the AzureFileServiceAccessKeyScan object itself.
     */
    public AzureFileServiceAccessKeyScan withShareName(String shareName) {
        this.shareName = shareName;
        return this;
    }

}