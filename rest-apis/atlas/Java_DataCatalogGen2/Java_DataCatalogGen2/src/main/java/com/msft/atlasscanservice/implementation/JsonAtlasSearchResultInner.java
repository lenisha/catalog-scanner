/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.msft.atlasscanservice.implementation;

import com.msft.atlasscanservice.JsonAttributeSearchResult;
import java.util.List;
import com.msft.atlasscanservice.JsonAtlasEntityHeader;
import com.msft.atlasscanservice.JsonAtlasFullTextResult;
import java.util.Map;
import com.msft.atlasscanservice.JsonSearchParameters;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AtlasSearchResult.
 * The result of the search.
 */
public class JsonAtlasSearchResultInner {
    /**
     * The attributes property.
     */
    @JsonProperty(value = "attributes")
    private JsonAttributeSearchResult attributes;

    /**
     * The classification of the result.
     */
    @JsonProperty(value = "classification")
    private String classification;

    /**
     * An array of entity headers.
     */
    @JsonProperty(value = "entities")
    private List<JsonAtlasEntityHeader> entities;

    /**
     * The full text search result.
     */
    @JsonProperty(value = "fullTextResult")
    private List<JsonAtlasFullTextResult> fullTextResult;

    /**
     * The query text.
     */
    @JsonProperty(value = "queryText")
    private String queryText;

    /**
     * Possible values include: 'DSL', 'FULL_TEXT', 'GREMLIN', 'BASIC',
     * 'ATTRIBUTE', 'RELATIONSHIP'.
     */
    @JsonProperty(value = "queryType")
    private String queryType;

    /**
     * The referred entity header.
     */
    @JsonProperty(value = "referredEntities")
    private Map<String, JsonAtlasEntityHeader> referredEntities;

    /**
     * The searchParameters property.
     */
    @JsonProperty(value = "searchParameters")
    private JsonSearchParameters searchParameters;

    /**
     * The type of the record.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Get the attributes value.
     *
     * @return the attributes value
     */
    public JsonAttributeSearchResult attributes() {
        return this.attributes;
    }

    /**
     * Set the attributes value.
     *
     * @param attributes the attributes value to set
     * @return the JsonAtlasSearchResultInner object itself.
     */
    public JsonAtlasSearchResultInner withAttributes(JsonAttributeSearchResult attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * Get the classification of the result.
     *
     * @return the classification value
     */
    public String classification() {
        return this.classification;
    }

    /**
     * Set the classification of the result.
     *
     * @param classification the classification value to set
     * @return the JsonAtlasSearchResultInner object itself.
     */
    public JsonAtlasSearchResultInner withClassification(String classification) {
        this.classification = classification;
        return this;
    }

    /**
     * Get an array of entity headers.
     *
     * @return the entities value
     */
    public List<JsonAtlasEntityHeader> entities() {
        return this.entities;
    }

    /**
     * Set an array of entity headers.
     *
     * @param entities the entities value to set
     * @return the JsonAtlasSearchResultInner object itself.
     */
    public JsonAtlasSearchResultInner withEntities(List<JsonAtlasEntityHeader> entities) {
        this.entities = entities;
        return this;
    }

    /**
     * Get the full text search result.
     *
     * @return the fullTextResult value
     */
    public List<JsonAtlasFullTextResult> fullTextResult() {
        return this.fullTextResult;
    }

    /**
     * Set the full text search result.
     *
     * @param fullTextResult the fullTextResult value to set
     * @return the JsonAtlasSearchResultInner object itself.
     */
    public JsonAtlasSearchResultInner withFullTextResult(List<JsonAtlasFullTextResult> fullTextResult) {
        this.fullTextResult = fullTextResult;
        return this;
    }

    /**
     * Get the query text.
     *
     * @return the queryText value
     */
    public String queryText() {
        return this.queryText;
    }

    /**
     * Set the query text.
     *
     * @param queryText the queryText value to set
     * @return the JsonAtlasSearchResultInner object itself.
     */
    public JsonAtlasSearchResultInner withQueryText(String queryText) {
        this.queryText = queryText;
        return this;
    }

    /**
     * Get possible values include: 'DSL', 'FULL_TEXT', 'GREMLIN', 'BASIC', 'ATTRIBUTE', 'RELATIONSHIP'.
     *
     * @return the queryType value
     */
    public String queryType() {
        return this.queryType;
    }

    /**
     * Set possible values include: 'DSL', 'FULL_TEXT', 'GREMLIN', 'BASIC', 'ATTRIBUTE', 'RELATIONSHIP'.
     *
     * @param queryType the queryType value to set
     * @return the JsonAtlasSearchResultInner object itself.
     */
    public JsonAtlasSearchResultInner withQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }

    /**
     * Get the referred entity header.
     *
     * @return the referredEntities value
     */
    public Map<String, JsonAtlasEntityHeader> referredEntities() {
        return this.referredEntities;
    }

    /**
     * Set the referred entity header.
     *
     * @param referredEntities the referredEntities value to set
     * @return the JsonAtlasSearchResultInner object itself.
     */
    public JsonAtlasSearchResultInner withReferredEntities(Map<String, JsonAtlasEntityHeader> referredEntities) {
        this.referredEntities = referredEntities;
        return this;
    }

    /**
     * Get the searchParameters value.
     *
     * @return the searchParameters value
     */
    public JsonSearchParameters searchParameters() {
        return this.searchParameters;
    }

    /**
     * Set the searchParameters value.
     *
     * @param searchParameters the searchParameters value to set
     * @return the JsonAtlasSearchResultInner object itself.
     */
    public JsonAtlasSearchResultInner withSearchParameters(JsonSearchParameters searchParameters) {
        this.searchParameters = searchParameters;
        return this;
    }

    /**
     * Get the type of the record.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type of the record.
     *
     * @param type the type value to set
     * @return the JsonAtlasSearchResultInner object itself.
     */
    public JsonAtlasSearchResultInner withType(String type) {
        this.type = type;
        return this;
    }

}