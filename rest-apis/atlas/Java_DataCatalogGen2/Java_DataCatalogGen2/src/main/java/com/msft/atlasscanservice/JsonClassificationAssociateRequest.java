/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.msft.atlasscanservice;

import com.msft.atlasscanservice.implementation.JsonAtlasClassificationInner;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ClassificationAssociateRequest.
 * The request for classification association.
 */
public class JsonClassificationAssociateRequest {
    /**
     * The classification property.
     */
    @JsonProperty(value = "classification")
    private JsonAtlasClassificationInner classification;

    /**
     * The GUID of the entity.
     */
    @JsonProperty(value = "entityGuids")
    private List<String> entityGuids;

    /**
     * An array of Atlas Object Id with its parent GUID.
     */
    @JsonProperty(value = "entities")
    private List<JsonAtlasObjectIdWithParentGuid> entities;

    /**
     * Get the classification value.
     *
     * @return the classification value
     */
    public JsonAtlasClassificationInner classification() {
        return this.classification;
    }

    /**
     * Set the classification value.
     *
     * @param classification the classification value to set
     * @return the JsonClassificationAssociateRequest object itself.
     */
    public JsonClassificationAssociateRequest withClassification(JsonAtlasClassificationInner classification) {
        this.classification = classification;
        return this;
    }

    /**
     * Get the GUID of the entity.
     *
     * @return the entityGuids value
     */
    public List<String> entityGuids() {
        return this.entityGuids;
    }

    /**
     * Set the GUID of the entity.
     *
     * @param entityGuids the entityGuids value to set
     * @return the JsonClassificationAssociateRequest object itself.
     */
    public JsonClassificationAssociateRequest withEntityGuids(List<String> entityGuids) {
        this.entityGuids = entityGuids;
        return this;
    }

    /**
     * Get an array of Atlas Object Id with its parent GUID.
     *
     * @return the entities value
     */
    public List<JsonAtlasObjectIdWithParentGuid> entities() {
        return this.entities;
    }

    /**
     * Set an array of Atlas Object Id with its parent GUID.
     *
     * @param entities the entities value to set
     * @return the JsonClassificationAssociateRequest object itself.
     */
    public JsonClassificationAssociateRequest withEntities(List<JsonAtlasObjectIdWithParentGuid> entities) {
        this.entities = entities;
        return this;
    }

}
