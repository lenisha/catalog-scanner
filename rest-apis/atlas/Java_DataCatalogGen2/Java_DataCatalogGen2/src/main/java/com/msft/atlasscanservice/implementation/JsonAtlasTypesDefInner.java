/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.msft.atlasscanservice.implementation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AtlasTypesDef.
 * The definitions of types.
 */
public class JsonAtlasTypesDefInner {
    /**
     * An array of classification definitions.
     */
    @JsonProperty(value = "classificationDefs")
    private List<JsonAtlasClassificationDefInner> classificationDefs;

    /**
     * An array of entity definitions.
     */
    @JsonProperty(value = "entityDefs")
    private List<JsonAtlasEntityDefInner> entityDefs;

    /**
     * An array of enum definitions.
     */
    @JsonProperty(value = "enumDefs")
    private List<JsonAtlasEnumDefInner> enumDefs;

    /**
     * An array of relationship definitions.
     */
    @JsonProperty(value = "relationshipDefs")
    private List<JsonAtlasRelationshipDefInner> relationshipDefs;

    /**
     * An array of struct definitions.
     */
    @JsonProperty(value = "structDefs")
    private List<JsonAtlasStructDefInner> structDefs;

    /**
     * Get an array of classification definitions.
     *
     * @return the classificationDefs value
     */
    public List<JsonAtlasClassificationDefInner> classificationDefs() {
        return this.classificationDefs;
    }

    /**
     * Set an array of classification definitions.
     *
     * @param classificationDefs the classificationDefs value to set
     * @return the JsonAtlasTypesDefInner object itself.
     */
    public JsonAtlasTypesDefInner withClassificationDefs(List<JsonAtlasClassificationDefInner> classificationDefs) {
        this.classificationDefs = classificationDefs;
        return this;
    }

    /**
     * Get an array of entity definitions.
     *
     * @return the entityDefs value
     */
    public List<JsonAtlasEntityDefInner> entityDefs() {
        return this.entityDefs;
    }

    /**
     * Set an array of entity definitions.
     *
     * @param entityDefs the entityDefs value to set
     * @return the JsonAtlasTypesDefInner object itself.
     */
    public JsonAtlasTypesDefInner withEntityDefs(List<JsonAtlasEntityDefInner> entityDefs) {
        this.entityDefs = entityDefs;
        return this;
    }

    /**
     * Get an array of enum definitions.
     *
     * @return the enumDefs value
     */
    public List<JsonAtlasEnumDefInner> enumDefs() {
        return this.enumDefs;
    }

    /**
     * Set an array of enum definitions.
     *
     * @param enumDefs the enumDefs value to set
     * @return the JsonAtlasTypesDefInner object itself.
     */
    public JsonAtlasTypesDefInner withEnumDefs(List<JsonAtlasEnumDefInner> enumDefs) {
        this.enumDefs = enumDefs;
        return this;
    }

    /**
     * Get an array of relationship definitions.
     *
     * @return the relationshipDefs value
     */
    public List<JsonAtlasRelationshipDefInner> relationshipDefs() {
        return this.relationshipDefs;
    }

    /**
     * Set an array of relationship definitions.
     *
     * @param relationshipDefs the relationshipDefs value to set
     * @return the JsonAtlasTypesDefInner object itself.
     */
    public JsonAtlasTypesDefInner withRelationshipDefs(List<JsonAtlasRelationshipDefInner> relationshipDefs) {
        this.relationshipDefs = relationshipDefs;
        return this;
    }

    /**
     * Get an array of struct definitions.
     *
     * @return the structDefs value
     */
    public List<JsonAtlasStructDefInner> structDefs() {
        return this.structDefs;
    }

    /**
     * Set an array of struct definitions.
     *
     * @param structDefs the structDefs value to set
     * @return the JsonAtlasTypesDefInner object itself.
     */
    public JsonAtlasTypesDefInner withStructDefs(List<JsonAtlasStructDefInner> structDefs) {
        this.structDefs = structDefs;
        return this;
    }

}
