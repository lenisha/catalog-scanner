/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.msft.atlasscanservice;

import com.msft.atlasscanservice.implementation.JsonAtlasEntitiesWithExtInfoInner;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EntityPartialUpdateRequestV2.
 * The class for hook notification for type ENTITY_PARTIAL_UPDATE_V2.
 */
public class JsonEntityPartialUpdateRequestV2 {
    /**
     * The type of the notification. Different behavior will be invoked by the
     * value. Possible values include: 'TYPE_CREATE', 'TYPE_UPDATE',
     * 'ENTITY_CREATE', 'ENTITY_PARTIAL_UPDATE', 'ENTITY_FULL_UPDATE',
     * 'ENTITY_DELETE', 'ENTITY_CREATE_V2', 'ENTITY_PARTIAL_UPDATE_V2',
     * 'ENTITY_FULL_UPDATE_V2', 'ENTITY_DELETE_V2'.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * The user of the notification. Default to be "UNKNOWN".
     */
    @JsonProperty(value = "user")
    private String user;

    /**
     * The entityId property.
     */
    @JsonProperty(value = "entityId")
    private JsonAtlasObjectId entityId;

    /**
     * The entity property.
     */
    @JsonProperty(value = "entity")
    private JsonAtlasEntitiesWithExtInfoInner entity;

    /**
     * Get the type of the notification. Different behavior will be invoked by the value. Possible values include: 'TYPE_CREATE', 'TYPE_UPDATE', 'ENTITY_CREATE', 'ENTITY_PARTIAL_UPDATE', 'ENTITY_FULL_UPDATE', 'ENTITY_DELETE', 'ENTITY_CREATE_V2', 'ENTITY_PARTIAL_UPDATE_V2', 'ENTITY_FULL_UPDATE_V2', 'ENTITY_DELETE_V2'.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type of the notification. Different behavior will be invoked by the value. Possible values include: 'TYPE_CREATE', 'TYPE_UPDATE', 'ENTITY_CREATE', 'ENTITY_PARTIAL_UPDATE', 'ENTITY_FULL_UPDATE', 'ENTITY_DELETE', 'ENTITY_CREATE_V2', 'ENTITY_PARTIAL_UPDATE_V2', 'ENTITY_FULL_UPDATE_V2', 'ENTITY_DELETE_V2'.
     *
     * @param type the type value to set
     * @return the JsonEntityPartialUpdateRequestV2 object itself.
     */
    public JsonEntityPartialUpdateRequestV2 withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the user of the notification. Default to be "UNKNOWN".
     *
     * @return the user value
     */
    public String user() {
        return this.user;
    }

    /**
     * Set the user of the notification. Default to be "UNKNOWN".
     *
     * @param user the user value to set
     * @return the JsonEntityPartialUpdateRequestV2 object itself.
     */
    public JsonEntityPartialUpdateRequestV2 withUser(String user) {
        this.user = user;
        return this;
    }

    /**
     * Get the entityId value.
     *
     * @return the entityId value
     */
    public JsonAtlasObjectId entityId() {
        return this.entityId;
    }

    /**
     * Set the entityId value.
     *
     * @param entityId the entityId value to set
     * @return the JsonEntityPartialUpdateRequestV2 object itself.
     */
    public JsonEntityPartialUpdateRequestV2 withEntityId(JsonAtlasObjectId entityId) {
        this.entityId = entityId;
        return this;
    }

    /**
     * Get the entity value.
     *
     * @return the entity value
     */
    public JsonAtlasEntitiesWithExtInfoInner entity() {
        return this.entity;
    }

    /**
     * Set the entity value.
     *
     * @param entity the entity value to set
     * @return the JsonEntityPartialUpdateRequestV2 object itself.
     */
    public JsonEntityPartialUpdateRequestV2 withEntity(JsonAtlasEntitiesWithExtInfoInner entity) {
        this.entity = entity;
        return this;
    }

}
