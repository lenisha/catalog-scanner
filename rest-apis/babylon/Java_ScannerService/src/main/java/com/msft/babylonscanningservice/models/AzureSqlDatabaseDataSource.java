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
 * The AzureSqlDatabaseDataSource model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind", defaultImpl = AzureSqlDatabaseDataSource.class)
@JsonTypeName("AzureSqlDatabase")
@JsonFlatten
public class AzureSqlDatabaseDataSource extends DataSource {
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
     * The serverEndpoint property.
     */
    @JsonProperty(value = "properties.serverEndpoint")
    private String serverEndpoint;

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
     * @return the AzureSqlDatabaseDataSource object itself.
     */
    public AzureSqlDatabaseDataSource withResourceGroup(String resourceGroup) {
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
     * @return the AzureSqlDatabaseDataSource object itself.
     */
    public AzureSqlDatabaseDataSource withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * Get the serverEndpoint value.
     *
     * @return the serverEndpoint value
     */
    public String serverEndpoint() {
        return this.serverEndpoint;
    }

    /**
     * Set the serverEndpoint value.
     *
     * @param serverEndpoint the serverEndpoint value to set
     * @return the AzureSqlDatabaseDataSource object itself.
     */
    public AzureSqlDatabaseDataSource withServerEndpoint(String serverEndpoint) {
        this.serverEndpoint = serverEndpoint;
        return this;
    }

}
