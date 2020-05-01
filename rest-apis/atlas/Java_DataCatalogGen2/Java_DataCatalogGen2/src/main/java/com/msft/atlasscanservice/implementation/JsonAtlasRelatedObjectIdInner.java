/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.msft.atlasscanservice.implementation;

import com.msft.atlasscanservice.JsonAtlasStruct;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.msft.atlasscanservice.JsonAtlasObjectId;

/**
 * AtlasRelatedObjectId.
 * Reference to an object-instance of AtlasEntity type used in relationship
 * attribute values.
 */
public class JsonAtlasRelatedObjectIdInner extends JsonAtlasObjectId {
    /**
     * The display text.
     */
    @JsonProperty(value = "displayText")
    private String displayText;

    /**
     * Possible values include: 'ACTIVE', 'DELETED'.
     */
    @JsonProperty(value = "entityStatus")
    private String entityStatus;

    /**
     * The relationshipAttributes property.
     */
    @JsonProperty(value = "relationshipAttributes")
    private JsonAtlasStruct relationshipAttributes;

    /**
     * The GUID of the relationship.
     */
    @JsonProperty(value = "relationshipGuid")
    private String relationshipGuid;

    /**
     * Possible values include: 'ACTIVE', 'DELETED'.
     */
    @JsonProperty(value = "relationshipStatus")
    private String relationshipStatus;

    /**
     * Get the display text.
     *
     * @return the displayText value
     */
    public String displayText() {
        return this.displayText;
    }

    /**
     * Set the display text.
     *
     * @param displayText the displayText value to set
     * @return the JsonAtlasRelatedObjectIdInner object itself.
     */
    public JsonAtlasRelatedObjectIdInner withDisplayText(String displayText) {
        this.displayText = displayText;
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
     * @return the JsonAtlasRelatedObjectIdInner object itself.
     */
    public JsonAtlasRelatedObjectIdInner withEntityStatus(String entityStatus) {
        this.entityStatus = entityStatus;
        return this;
    }

    /**
     * Get the relationshipAttributes value.
     *
     * @return the relationshipAttributes value
     */
    public JsonAtlasStruct relationshipAttributes() {
        return this.relationshipAttributes;
    }

    /**
     * Set the relationshipAttributes value.
     *
     * @param relationshipAttributes the relationshipAttributes value to set
     * @return the JsonAtlasRelatedObjectIdInner object itself.
     */
    public JsonAtlasRelatedObjectIdInner withRelationshipAttributes(JsonAtlasStruct relationshipAttributes) {
        this.relationshipAttributes = relationshipAttributes;
        return this;
    }

    /**
     * Get the GUID of the relationship.
     *
     * @return the relationshipGuid value
     */
    public String relationshipGuid() {
        return this.relationshipGuid;
    }

    /**
     * Set the GUID of the relationship.
     *
     * @param relationshipGuid the relationshipGuid value to set
     * @return the JsonAtlasRelatedObjectIdInner object itself.
     */
    public JsonAtlasRelatedObjectIdInner withRelationshipGuid(String relationshipGuid) {
        this.relationshipGuid = relationshipGuid;
        return this;
    }

    /**
     * Get possible values include: 'ACTIVE', 'DELETED'.
     *
     * @return the relationshipStatus value
     */
    public String relationshipStatus() {
        return this.relationshipStatus;
    }

    /**
     * Set possible values include: 'ACTIVE', 'DELETED'.
     *
     * @param relationshipStatus the relationshipStatus value to set
     * @return the JsonAtlasRelatedObjectIdInner object itself.
     */
    public JsonAtlasRelatedObjectIdInner withRelationshipStatus(String relationshipStatus) {
        this.relationshipStatus = relationshipStatus;
        return this;
    }

}
