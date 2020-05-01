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
 * The AdlsGen1DataSource model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind", defaultImpl = AdlsGen1DataSource.class)
@JsonTypeName("AdlsGen1")
@JsonFlatten
public class AdlsGen1DataSource extends DataSource {
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
     * The resourceGroup property.
     */
    @JsonProperty(value = "properties.resourceGroup")
    private String resourceGroup;

    /**
     * The subscriptionId property.
     */
    @JsonProperty(value = "properties.subscriptionId")
    private String subscriptionId;

    /**
     * The endpoint property.
     */
    @JsonProperty(value = "properties.endpoint")
    private String endpoint;

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
     * Get the resourceGroup value.
     *
     * @return the resourceGroup value
     */
    public String resourceGroup() {
        return this.resourceGroup;
    }

    /**
     * Set the resourceGroup value.
     *
     * @param resourceGroup the resourceGroup value to set
     * @return the AdlsGen1DataSource object itself.
     */
    public AdlsGen1DataSource withResourceGroup(String resourceGroup) {
        this.resourceGroup = resourceGroup;
        return this;
    }

    /**
     * Get the subscriptionId value.
     *
     * @return the subscriptionId value
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Set the subscriptionId value.
     *
     * @param subscriptionId the subscriptionId value to set
     * @return the AdlsGen1DataSource object itself.
     */
    public AdlsGen1DataSource withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * Get the endpoint value.
     *
     * @return the endpoint value
     */
    public String endpoint() {
        return this.endpoint;
    }

    /**
     * Set the endpoint value.
     *
     * @param endpoint the endpoint value to set
     * @return the AdlsGen1DataSource object itself.
     */
    public AdlsGen1DataSource withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

}
