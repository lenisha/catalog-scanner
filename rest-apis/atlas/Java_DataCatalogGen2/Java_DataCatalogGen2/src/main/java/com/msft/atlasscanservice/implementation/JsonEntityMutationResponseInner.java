/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.msft.atlasscanservice.implementation;

import java.util.Map;
import java.util.List;
import com.msft.atlasscanservice.JsonAtlasEntityHeader;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EntityMutationResponse.
 * The mutation response of entity.
 */
public class JsonEntityMutationResponseInner {
    /**
     * A map of GUID assignments with entities.
     */
    @JsonProperty(value = "guidAssignments")
    private Map<String, String> guidAssignments;

    /**
     * The entity headers of mutated entities.
     */
    @JsonProperty(value = "mutatedEntities")
    private Map<String, List<JsonAtlasEntityHeader>> mutatedEntities;

    /**
     * An array of entity headers that partially updated.
     */
    @JsonProperty(value = "partialUpdatedEntities")
    private List<JsonAtlasEntityHeader> partialUpdatedEntities;

    /**
     * Get a map of GUID assignments with entities.
     *
     * @return the guidAssignments value
     */
    public Map<String, String> guidAssignments() {
        return this.guidAssignments;
    }

    /**
     * Set a map of GUID assignments with entities.
     *
     * @param guidAssignments the guidAssignments value to set
     * @return the JsonEntityMutationResponseInner object itself.
     */
    public JsonEntityMutationResponseInner withGuidAssignments(Map<String, String> guidAssignments) {
        this.guidAssignments = guidAssignments;
        return this;
    }

    /**
     * Get the entity headers of mutated entities.
     *
     * @return the mutatedEntities value
     */
    public Map<String, List<JsonAtlasEntityHeader>> mutatedEntities() {
        return this.mutatedEntities;
    }

    /**
     * Set the entity headers of mutated entities.
     *
     * @param mutatedEntities the mutatedEntities value to set
     * @return the JsonEntityMutationResponseInner object itself.
     */
    public JsonEntityMutationResponseInner withMutatedEntities(Map<String, List<JsonAtlasEntityHeader>> mutatedEntities) {
        this.mutatedEntities = mutatedEntities;
        return this;
    }

    /**
     * Get an array of entity headers that partially updated.
     *
     * @return the partialUpdatedEntities value
     */
    public List<JsonAtlasEntityHeader> partialUpdatedEntities() {
        return this.partialUpdatedEntities;
    }

    /**
     * Set an array of entity headers that partially updated.
     *
     * @param partialUpdatedEntities the partialUpdatedEntities value to set
     * @return the JsonEntityMutationResponseInner object itself.
     */
    public JsonEntityMutationResponseInner withPartialUpdatedEntities(List<JsonAtlasEntityHeader> partialUpdatedEntities) {
        this.partialUpdatedEntities = partialUpdatedEntities;
        return this;
    }

}
