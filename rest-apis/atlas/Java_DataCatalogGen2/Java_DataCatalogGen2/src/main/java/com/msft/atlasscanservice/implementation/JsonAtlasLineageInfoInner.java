/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.msft.atlasscanservice.implementation;

import java.util.Map;
import com.msft.atlasscanservice.JsonAtlasEntityHeader;
import java.util.List;
import com.msft.atlasscanservice.JsonLineageRelation;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AtlasLineageInfo.
 * The lineage information.
 */
public class JsonAtlasLineageInfoInner {
    /**
     * The GUID of the base entity.
     */
    @JsonProperty(value = "baseEntityGuid")
    private String baseEntityGuid;

    /**
     * The GUID entity map.
     */
    @JsonProperty(value = "guidEntityMap")
    private Map<String, JsonAtlasEntityHeader> guidEntityMap;

    /**
     * The depth of lineage.
     */
    @JsonProperty(value = "lineageDepth")
    private Integer lineageDepth;

    /**
     * Possible values include: 'INPUT', 'OUTPUT', 'BOTH'.
     */
    @JsonProperty(value = "lineageDirection")
    private String lineageDirection;

    /**
     * An array of lineage relations.
     */
    @JsonProperty(value = "relations")
    private List<JsonLineageRelation> relations;

    /**
     * Get the GUID of the base entity.
     *
     * @return the baseEntityGuid value
     */
    public String baseEntityGuid() {
        return this.baseEntityGuid;
    }

    /**
     * Set the GUID of the base entity.
     *
     * @param baseEntityGuid the baseEntityGuid value to set
     * @return the JsonAtlasLineageInfoInner object itself.
     */
    public JsonAtlasLineageInfoInner withBaseEntityGuid(String baseEntityGuid) {
        this.baseEntityGuid = baseEntityGuid;
        return this;
    }

    /**
     * Get the GUID entity map.
     *
     * @return the guidEntityMap value
     */
    public Map<String, JsonAtlasEntityHeader> guidEntityMap() {
        return this.guidEntityMap;
    }

    /**
     * Set the GUID entity map.
     *
     * @param guidEntityMap the guidEntityMap value to set
     * @return the JsonAtlasLineageInfoInner object itself.
     */
    public JsonAtlasLineageInfoInner withGuidEntityMap(Map<String, JsonAtlasEntityHeader> guidEntityMap) {
        this.guidEntityMap = guidEntityMap;
        return this;
    }

    /**
     * Get the depth of lineage.
     *
     * @return the lineageDepth value
     */
    public Integer lineageDepth() {
        return this.lineageDepth;
    }

    /**
     * Set the depth of lineage.
     *
     * @param lineageDepth the lineageDepth value to set
     * @return the JsonAtlasLineageInfoInner object itself.
     */
    public JsonAtlasLineageInfoInner withLineageDepth(Integer lineageDepth) {
        this.lineageDepth = lineageDepth;
        return this;
    }

    /**
     * Get possible values include: 'INPUT', 'OUTPUT', 'BOTH'.
     *
     * @return the lineageDirection value
     */
    public String lineageDirection() {
        return this.lineageDirection;
    }

    /**
     * Set possible values include: 'INPUT', 'OUTPUT', 'BOTH'.
     *
     * @param lineageDirection the lineageDirection value to set
     * @return the JsonAtlasLineageInfoInner object itself.
     */
    public JsonAtlasLineageInfoInner withLineageDirection(String lineageDirection) {
        this.lineageDirection = lineageDirection;
        return this;
    }

    /**
     * Get an array of lineage relations.
     *
     * @return the relations value
     */
    public List<JsonLineageRelation> relations() {
        return this.relations;
    }

    /**
     * Set an array of lineage relations.
     *
     * @param relations the relations value to set
     * @return the JsonAtlasLineageInfoInner object itself.
     */
    public JsonAtlasLineageInfoInner withRelations(List<JsonLineageRelation> relations) {
        this.relations = relations;
        return this;
    }

}
