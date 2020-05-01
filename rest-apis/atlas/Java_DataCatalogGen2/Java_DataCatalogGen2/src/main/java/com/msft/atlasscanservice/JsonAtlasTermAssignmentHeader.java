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
 * AtlasTermAssignmentHeader.
 * The header for term assignment.
 */
public class JsonAtlasTermAssignmentHeader {
    /**
     * The confidence of the term assignment.
     */
    @JsonProperty(value = "confidence")
    private Integer confidence;

    /**
     * The user who created the record.
     */
    @JsonProperty(value = "createdBy")
    private String createdBy;

    /**
     * The description of the term assignment.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * The display text.
     */
    @JsonProperty(value = "displayText")
    private String displayText;

    /**
     * The expression of the term assignment.
     */
    @JsonProperty(value = "expression")
    private String expression;

    /**
     * The GUID of the relationship.
     */
    @JsonProperty(value = "relationGuid")
    private String relationGuid;

    /**
     * The source of the term.
     */
    @JsonProperty(value = "source")
    private String source;

    /**
     * Possible values include: 'DISCOVERED', 'PROPOSED', 'IMPORTED',
     * 'VALIDATED', 'DEPRECATED', 'OBSOLETE', 'OTHER'.
     */
    @JsonProperty(value = "status")
    private String status;

    /**
     * The steward of the term.
     */
    @JsonProperty(value = "steward")
    private String steward;

    /**
     * The GUID of the term.
     */
    @JsonProperty(value = "termGuid")
    private String termGuid;

    /**
     * Get the confidence of the term assignment.
     *
     * @return the confidence value
     */
    public Integer confidence() {
        return this.confidence;
    }

    /**
     * Set the confidence of the term assignment.
     *
     * @param confidence the confidence value to set
     * @return the JsonAtlasTermAssignmentHeader object itself.
     */
    public JsonAtlasTermAssignmentHeader withConfidence(Integer confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * Get the user who created the record.
     *
     * @return the createdBy value
     */
    public String createdBy() {
        return this.createdBy;
    }

    /**
     * Set the user who created the record.
     *
     * @param createdBy the createdBy value to set
     * @return the JsonAtlasTermAssignmentHeader object itself.
     */
    public JsonAtlasTermAssignmentHeader withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Get the description of the term assignment.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description of the term assignment.
     *
     * @param description the description value to set
     * @return the JsonAtlasTermAssignmentHeader object itself.
     */
    public JsonAtlasTermAssignmentHeader withDescription(String description) {
        this.description = description;
        return this;
    }

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
     * @return the JsonAtlasTermAssignmentHeader object itself.
     */
    public JsonAtlasTermAssignmentHeader withDisplayText(String displayText) {
        this.displayText = displayText;
        return this;
    }

    /**
     * Get the expression of the term assignment.
     *
     * @return the expression value
     */
    public String expression() {
        return this.expression;
    }

    /**
     * Set the expression of the term assignment.
     *
     * @param expression the expression value to set
     * @return the JsonAtlasTermAssignmentHeader object itself.
     */
    public JsonAtlasTermAssignmentHeader withExpression(String expression) {
        this.expression = expression;
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
     * @return the JsonAtlasTermAssignmentHeader object itself.
     */
    public JsonAtlasTermAssignmentHeader withRelationGuid(String relationGuid) {
        this.relationGuid = relationGuid;
        return this;
    }

    /**
     * Get the source of the term.
     *
     * @return the source value
     */
    public String source() {
        return this.source;
    }

    /**
     * Set the source of the term.
     *
     * @param source the source value to set
     * @return the JsonAtlasTermAssignmentHeader object itself.
     */
    public JsonAtlasTermAssignmentHeader withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * Get possible values include: 'DISCOVERED', 'PROPOSED', 'IMPORTED', 'VALIDATED', 'DEPRECATED', 'OBSOLETE', 'OTHER'.
     *
     * @return the status value
     */
    public String status() {
        return this.status;
    }

    /**
     * Set possible values include: 'DISCOVERED', 'PROPOSED', 'IMPORTED', 'VALIDATED', 'DEPRECATED', 'OBSOLETE', 'OTHER'.
     *
     * @param status the status value to set
     * @return the JsonAtlasTermAssignmentHeader object itself.
     */
    public JsonAtlasTermAssignmentHeader withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the steward of the term.
     *
     * @return the steward value
     */
    public String steward() {
        return this.steward;
    }

    /**
     * Set the steward of the term.
     *
     * @param steward the steward value to set
     * @return the JsonAtlasTermAssignmentHeader object itself.
     */
    public JsonAtlasTermAssignmentHeader withSteward(String steward) {
        this.steward = steward;
        return this;
    }

    /**
     * Get the GUID of the term.
     *
     * @return the termGuid value
     */
    public String termGuid() {
        return this.termGuid;
    }

    /**
     * Set the GUID of the term.
     *
     * @param termGuid the termGuid value to set
     * @return the JsonAtlasTermAssignmentHeader object itself.
     */
    public JsonAtlasTermAssignmentHeader withTermGuid(String termGuid) {
        this.termGuid = termGuid;
        return this;
    }

}