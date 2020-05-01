/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.msft.atlasscanservice.implementation;

import java.util.List;
import com.msft.atlasscanservice.JsonAtlasAttributeDef;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AtlasStructDef.
 * class that captures details of a struct-type.
 */
public class JsonAtlasStructDefInner extends JsonAtlasBaseTypeDefInner {
    /**
     * An array of attribute definitions.
     */
    @JsonProperty(value = "attributeDefs")
    private List<JsonAtlasAttributeDef> attributeDefs;

    /**
     * Get an array of attribute definitions.
     *
     * @return the attributeDefs value
     */
    public List<JsonAtlasAttributeDef> attributeDefs() {
        return this.attributeDefs;
    }

    /**
     * Set an array of attribute definitions.
     *
     * @param attributeDefs the attributeDefs value to set
     * @return the JsonAtlasStructDefInner object itself.
     */
    public JsonAtlasStructDefInner withAttributeDefs(List<JsonAtlasAttributeDef> attributeDefs) {
        this.attributeDefs = attributeDefs;
        return this;
    }

}
