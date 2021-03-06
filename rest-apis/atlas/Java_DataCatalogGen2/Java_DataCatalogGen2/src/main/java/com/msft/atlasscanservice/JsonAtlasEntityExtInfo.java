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
 * AtlasEntityExtInfo.
 * An instance of an entity along with extended info - like hive_table,
 * hive_database.
 */
public class JsonAtlasEntityExtInfo {
    /**
     * The referred entities.
     */
    @JsonProperty(value = "referredEntities")
    private Map<String, JsonAtlasEntity> referredEntities;

    /**
     * Get the referred entities.
     *
     * @return the referredEntities value
     */
    public Map<String, JsonAtlasEntity> referredEntities() {
        return this.referredEntities;
    }

    /**
     * Set the referred entities.
     *
     * @param referredEntities the referredEntities value to set
     * @return the JsonAtlasEntityExtInfo object itself.
     */
    public JsonAtlasEntityExtInfo withReferredEntities(Map<String, JsonAtlasEntity> referredEntities) {
        this.referredEntities = referredEntities;
        return this;
    }

}
