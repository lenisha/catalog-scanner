/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.msft.atlasscanservice;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CatalogCreationRequest.
 * Request for catalog creation.
 */
public class JsonCatalogCreationRequest {
    /**
     * Name of the catalog.
     */
    @JsonProperty(value = "catalogName")
    private String catalogName;

    /**
     * ID of the catalog.
     */
    @JsonProperty(value = "catalogId")
    private String catalogId;

    /**
     * User ID or the creator.
     */
    @JsonProperty(value = "creatorUserId")
    private String creatorUserId;

    /**
     * The connection string of the Event Hubs.
     */
    @JsonProperty(value = "eventHubConnectionString")
    private String eventHubConnectionString;

    /**
     * Get name of the catalog.
     *
     * @return the catalogName value
     */
    public String catalogName() {
        return this.catalogName;
    }

    /**
     * Set name of the catalog.
     *
     * @param catalogName the catalogName value to set
     * @return the JsonCatalogCreationRequest object itself.
     */
    public JsonCatalogCreationRequest withCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }

    /**
     * Get iD of the catalog.
     *
     * @return the catalogId value
     */
    public String catalogId() {
        return this.catalogId;
    }

    /**
     * Set iD of the catalog.
     *
     * @param catalogId the catalogId value to set
     * @return the JsonCatalogCreationRequest object itself.
     */
    public JsonCatalogCreationRequest withCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }

    /**
     * Get user ID or the creator.
     *
     * @return the creatorUserId value
     */
    public String creatorUserId() {
        return this.creatorUserId;
    }

    /**
     * Set user ID or the creator.
     *
     * @param creatorUserId the creatorUserId value to set
     * @return the JsonCatalogCreationRequest object itself.
     */
    public JsonCatalogCreationRequest withCreatorUserId(String creatorUserId) {
        this.creatorUserId = creatorUserId;
        return this;
    }

    /**
     * Get the connection string of the Event Hubs.
     *
     * @return the eventHubConnectionString value
     */
    public String eventHubConnectionString() {
        return this.eventHubConnectionString;
    }

    /**
     * Set the connection string of the Event Hubs.
     *
     * @param eventHubConnectionString the eventHubConnectionString value to set
     * @return the JsonCatalogCreationRequest object itself.
     */
    public JsonCatalogCreationRequest withEventHubConnectionString(String eventHubConnectionString) {
        this.eventHubConnectionString = eventHubConnectionString;
        return this;
    }

}
