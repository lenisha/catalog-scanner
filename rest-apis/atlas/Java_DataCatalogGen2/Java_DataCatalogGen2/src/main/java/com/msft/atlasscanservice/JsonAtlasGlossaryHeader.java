/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.msft.atlasscanservice;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AtlasGlossaryHeader.
 * The glossary header with basic information.
 */
public class JsonAtlasGlossaryHeader {
    /**
     * The display text.
     */
    @JsonProperty(value = "displayText")
    private String displayText;

    /**
     * The GUID of the glossary.
     */
    @JsonProperty(value = "glossaryGuid")
    private String glossaryGuid;

    /**
     * The GUID of the relationship.
     */
    @JsonProperty(value = "relationGuid")
    private String relationGuid;

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
     * @return the JsonAtlasGlossaryHeader object itself.
     */
    public JsonAtlasGlossaryHeader withDisplayText(String displayText) {
        this.displayText = displayText;
        return this;
    }

    /**
     * Get the GUID of the glossary.
     *
     * @return the glossaryGuid value
     */
    public String glossaryGuid() {
        return this.glossaryGuid;
    }

    /**
     * Set the GUID of the glossary.
     *
     * @param glossaryGuid the glossaryGuid value to set
     * @return the JsonAtlasGlossaryHeader object itself.
     */
    public JsonAtlasGlossaryHeader withGlossaryGuid(String glossaryGuid) {
        this.glossaryGuid = glossaryGuid;
        return this;
    }

    /**
     * Get the GUID of the relationship.
     *
     * @return the relationGuid value
     */
    public String relationGuid() {
        return this.relationGuid;
    }

    /**
     * Set the GUID of the relationship.
     *
     * @param relationGuid the relationGuid value to set
     * @return the JsonAtlasGlossaryHeader object itself.
     */
    public JsonAtlasGlossaryHeader withRelationGuid(String relationGuid) {
        this.relationGuid = relationGuid;
        return this;
    }

}
