/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.msft.atlasscanservice.implementation;

import java.util.List;
import com.msft.atlasscanservice.JsonTimeBoundary;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.msft.atlasscanservice.JsonAtlasStruct;

/**
 * AtlasClassification.
 * An instance of a classification; it doesn't have an identity, this object
 * exists only when associated with an entity.
 */
public class JsonAtlasClassificationInner extends JsonAtlasStruct {
    /**
     * The GUID of the entity.
     */
    @JsonProperty(value = "entityGuid")
    private String entityGuid;

    /**
     * Possible values include: 'ACTIVE', 'DELETED'.
     */
    @JsonProperty(value = "entityStatus")
    private String entityStatus;

    /**
     * Determines if the classification will be propagated.
     */
    @JsonProperty(value = "propagate")
    private Boolean propagate;

    /**
     * Determines if propagations will be removed on entity deletion.
     */
    @JsonProperty(value = "removePropagationsOnEntityDelete")
    private Boolean removePropagationsOnEntityDelete;

    /**
     * An array of time boundaries indicating validity periods.
     */
    @JsonProperty(value = "validityPeriods")
    private List<JsonTimeBoundary> validityPeriods;

    /**
     * Get the GUID of the entity.
     *
     * @return the entityGuid value
     */
    public String entityGuid() {
        return this.entityGuid;
    }

    /**
     * Set the GUID of the entity.
     *
     * @param entityGuid the entityGuid value to set
     * @return the JsonAtlasClassificationInner object itself.
     */
    public JsonAtlasClassificationInner withEntityGuid(String entityGuid) {
        this.entityGuid = entityGuid;
        return this;
    }

    /**
     * Get possible values include: 'ACTIVE', 'DELETED'.
     *
     * @return the entityStatus value
     */
    public String entityStatus() {
        return this.entityStatus;
    }

    /**
     * Set possible values include: 'ACTIVE', 'DELETED'.
     *
     * @param entityStatus the entityStatus value to set
     * @return the JsonAtlasClassificationInner object itself.
     */
    public JsonAtlasClassificationInner withEntityStatus(String entityStatus) {
        this.entityStatus = entityStatus;
        return this;
    }

    /**
     * Get determines if the classification will be propagated.
     *
     * @return the propagate value
     */
    public Boolean propagate() {
        return this.propagate;
    }

    /**
     * Set determines if the classification will be propagated.
     *
     * @param propagate the propagate value to set
     * @return the JsonAtlasClassificationInner object itself.
     */
    public JsonAtlasClassificationInner withPropagate(Boolean propagate) {
        this.propagate = propagate;
        return this;
    }

    /**
     * Get determines if propagations will be removed on entity deletion.
     *
     * @return the removePropagationsOnEntityDelete value
     */
    public Boolean removePropagationsOnEntityDelete() {
        return this.removePropagationsOnEntityDelete;
    }

    /**
     * Set determines if propagations will be removed on entity deletion.
     *
     * @param removePropagationsOnEntityDelete the removePropagationsOnEntityDelete value to set
     * @return the JsonAtlasClassificationInner object itself.
     */
    public JsonAtlasClassificationInner withRemovePropagationsOnEntityDelete(Boolean removePropagationsOnEntityDelete) {
        this.removePropagationsOnEntityDelete = removePropagationsOnEntityDelete;
        return this;
    }

    /**
     * Get an array of time boundaries indicating validity periods.
     *
     * @return the validityPeriods value
     */
    public List<JsonTimeBoundary> validityPeriods() {
        return this.validityPeriods;
    }

    /**
     * Set an array of time boundaries indicating validity periods.
     *
     * @param validityPeriods the validityPeriods value to set
     * @return the JsonAtlasClassificationInner object itself.
     */
    public JsonAtlasClassificationInner withValidityPeriods(List<JsonTimeBoundary> validityPeriods) {
        this.validityPeriods = validityPeriods;
        return this;
    }

}
