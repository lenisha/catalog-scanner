/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.msft.atlasscanservice;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AtlasObjectId.
 * Reference to an object-instance of an Atlas type - like entity.
 */
public class JsonAtlasObjectId {
    /**
     * The GUID of the object.
     */
    @JsonProperty(value = "guid")
    private String guid;

    /**
     * The name of the type.
     */
    @JsonProperty(value = "typeName")
    private String typeName;

    /**
     * The unique attributes of the object.
     */
    @JsonProperty(value = "uniqueAttributes")
    private Map<String, Object> uniqueAttributes;

    /**
     * Get the GUID of the object.
     *
     * @return the guid value
     */
    public String guid() {
        return this.guid;
    }

    /**
     * Set the GUID of the object.
     *
     * @param guid the guid value to set
     * @return the JsonAtlasObjectId object itself.
     */
    public JsonAtlasObjectId withGuid(String guid) {
        this.guid = guid;
        return this;
    }

    /**
     * Get the name of the type.
     *
     * @return the typeName value
     */
    public String typeName() {
        return this.typeName;
    }

    /**
     * Set the name of the type.
     *
     * @param typeName the typeName value to set
     * @return the JsonAtlasObjectId object itself.
     */
    public JsonAtlasObjectId withTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }

    /**
     * Get the unique attributes of the object.
     *
     * @return the uniqueAttributes value
     */
    public Map<String, Object> uniqueAttributes() {
        return this.uniqueAttributes;
    }

    /**
     * Set the unique attributes of the object.
     *
     * @param uniqueAttributes the uniqueAttributes value to set
     * @return the JsonAtlasObjectId object itself.
     */
    public JsonAtlasObjectId withUniqueAttributes(Map<String, Object> uniqueAttributes) {
        this.uniqueAttributes = uniqueAttributes;
        return this;
    }

}