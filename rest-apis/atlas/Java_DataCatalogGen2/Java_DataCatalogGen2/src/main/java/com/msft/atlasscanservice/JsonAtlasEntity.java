/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.msft.atlasscanservice;

import java.util.List;
import com.msft.atlasscanservice.implementation.JsonAtlasClassificationInner;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AtlasEntity.
 * An instance of an entity - like hive_table, hive_database.
 */
public class JsonAtlasEntity extends JsonAtlasStruct {
    /**
     * An array of classifications.
     */
    @JsonProperty(value = "classifications")
    private List<JsonAtlasClassificationInner> classifications;

    /**
     * The created time of the record.
     */
    @JsonProperty(value = "createTime")
    private Double createTime;

    /**
     * The user who created the record.
     */
    @JsonProperty(value = "createdBy")
    private String createdBy;

    /**
     * The GUID of the entity.
     */
    @JsonProperty(value = "guid")
    private String guid;

    /**
     * The home ID of the entity.
     */
    @JsonProperty(value = "homeId")
    private String homeId;

    /**
     * An array of term assignment headers indicating the meanings of the
     * entity.
     */
    @JsonProperty(value = "meanings")
    private List<JsonAtlasTermAssignmentHeader> meanings;

    /**
     * Determines if there's a proxy.
     */
    @JsonProperty(value = "proxy")
    private Boolean proxy;

    /**
     * The attributes of relationship.
     */
    @JsonProperty(value = "relationshipAttributes")
    private Map<String, Object> relationshipAttributes;

    /**
     * Possible values include: 'ACTIVE', 'DELETED'.
     */
    @JsonProperty(value = "status")
    private String status;

    /**
     * The update time of the record.
     */
    @JsonProperty(value = "updateTime")
    private Double updateTime;

    /**
     * The user who updated the record.
     */
    @JsonProperty(value = "updatedBy")
    private String updatedBy;

    /**
     * The version of the entity.
     */
    @JsonProperty(value = "version")
    private Double version;

    /**
     * Get an array of classifications.
     *
     * @return the classifications value
     */
    public List<JsonAtlasClassificationInner> classifications() {
        return this.classifications;
    }

    /**
     * Set an array of classifications.
     *
     * @param classifications the classifications value to set
     * @return the JsonAtlasEntity object itself.
     */
    public JsonAtlasEntity withClassifications(List<JsonAtlasClassificationInner> classifications) {
        this.classifications = classifications;
        return this;
    }

    /**
     * Get the created time of the record.
     *
     * @return the createTime value
     */
    public Double createTime() {
        return this.createTime;
    }

    /**
     * Set the created time of the record.
     *
     * @param createTime the createTime value to set
     * @return the JsonAtlasEntity object itself.
     */
    public JsonAtlasEntity withCreateTime(Double createTime) {
        this.createTime = createTime;
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
     * @return the JsonAtlasEntity object itself.
     */
    public JsonAtlasEntity withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Get the GUID of the entity.
     *
     * @return the guid value
     */
    public String guid() {
        return this.guid;
    }

    /**
     * Set the GUID of the entity.
     *
     * @param guid the guid value to set
     * @return the JsonAtlasEntity object itself.
     */
    public JsonAtlasEntity withGuid(String guid) {
        this.guid = guid;
        return this;
    }

    /**
     * Get the home ID of the entity.
     *
     * @return the homeId value
     */
    public String homeId() {
        return this.homeId;
    }

    /**
     * Set the home ID of the entity.
     *
     * @param homeId the homeId value to set
     * @return the JsonAtlasEntity object itself.
     */
    public JsonAtlasEntity withHomeId(String homeId) {
        this.homeId = homeId;
        return this;
    }

    /**
     * Get an array of term assignment headers indicating the meanings of the entity.
     *
     * @return the meanings value
     */
    public List<JsonAtlasTermAssignmentHeader> meanings() {
        return this.meanings;
    }

    /**
     * Set an array of term assignment headers indicating the meanings of the entity.
     *
     * @param meanings the meanings value to set
     * @return the JsonAtlasEntity object itself.
     */
    public JsonAtlasEntity withMeanings(List<JsonAtlasTermAssignmentHeader> meanings) {
        this.meanings = meanings;
        return this;
    }

    /**
     * Get determines if there's a proxy.
     *
     * @return the proxy value
     */
    public Boolean proxy() {
        return this.proxy;
    }

    /**
     * Set determines if there's a proxy.
     *
     * @param proxy the proxy value to set
     * @return the JsonAtlasEntity object itself.
     */
    public JsonAtlasEntity withProxy(Boolean proxy) {
        this.proxy = proxy;
        return this;
    }

    /**
     * Get the attributes of relationship.
     *
     * @return the relationshipAttributes value
     */
    public Map<String, Object> relationshipAttributes() {
        return this.relationshipAttributes;
    }

    /**
     * Set the attributes of relationship.
     *
     * @param relationshipAttributes the relationshipAttributes value to set
     * @return the JsonAtlasEntity object itself.
     */
    public JsonAtlasEntity withRelationshipAttributes(Map<String, Object> relationshipAttributes) {
        this.relationshipAttributes = relationshipAttributes;
        return this;
    }

    /**
     * Get possible values include: 'ACTIVE', 'DELETED'.
     *
     * @return the status value
     */
    public String status() {
        return this.status;
    }

    /**
     * Set possible values include: 'ACTIVE', 'DELETED'.
     *
     * @param status the status value to set
     * @return the JsonAtlasEntity object itself.
     */
    public JsonAtlasEntity withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the update time of the record.
     *
     * @return the updateTime value
     */
    public Double updateTime() {
        return this.updateTime;
    }

    /**
     * Set the update time of the record.
     *
     * @param updateTime the updateTime value to set
     * @return the JsonAtlasEntity object itself.
     */
    public JsonAtlasEntity withUpdateTime(Double updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * Get the user who updated the record.
     *
     * @return the updatedBy value
     */
    public String updatedBy() {
        return this.updatedBy;
    }

    /**
     * Set the user who updated the record.
     *
     * @param updatedBy the updatedBy value to set
     * @return the JsonAtlasEntity object itself.
     */
    public JsonAtlasEntity withUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    /**
     * Get the version of the entity.
     *
     * @return the version value
     */
    public Double version() {
        return this.version;
    }

    /**
     * Set the version of the entity.
     *
     * @param version the version value to set
     * @return the JsonAtlasEntity object itself.
     */
    public JsonAtlasEntity withVersion(Double version) {
        this.version = version;
        return this;
    }

}
