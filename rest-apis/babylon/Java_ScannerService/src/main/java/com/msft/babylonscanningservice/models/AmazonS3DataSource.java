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
 * The AmazonS3DataSource model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind", defaultImpl = AmazonS3DataSource.class)
@JsonTypeName("AmazonS3")
@JsonFlatten
public class AmazonS3DataSource extends DataSource {
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
     * The serviceUrl property.
     */
    @JsonProperty(value = "properties.serviceUrl")
    private String serviceUrl;

    /**
     * The roleARN property.
     */
    @JsonProperty(value = "properties.roleARN")
    private String roleARN;

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
     * Get the serviceUrl value.
     *
     * @return the serviceUrl value
     */
    public String serviceUrl() {
        return this.serviceUrl;
    }

    /**
     * Set the serviceUrl value.
     *
     * @param serviceUrl the serviceUrl value to set
     * @return the AmazonS3DataSource object itself.
     */
    public AmazonS3DataSource withServiceUrl(String serviceUrl) {
        this.serviceUrl = serviceUrl;
        return this;
    }

    /**
     * Get the roleARN value.
     *
     * @return the roleARN value
     */
    public String roleARN() {
        return this.roleARN;
    }

    /**
     * Set the roleARN value.
     *
     * @param roleARN the roleARN value to set
     * @return the AmazonS3DataSource object itself.
     */
    public AmazonS3DataSource withRoleARN(String roleARN) {
        this.roleARN = roleARN;
        return this;
    }

}
