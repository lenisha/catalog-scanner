/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.msft.babylonscanningservice.models;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The PowerBIDelegatedScan model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind", defaultImpl = PowerBIDelegatedScan.class)
@JsonTypeName("PowerBIDelegated")
@JsonFlatten
public class PowerBIDelegatedScan extends Scan {
    /**
     * The scanRulesetName property.
     */
    @JsonProperty(value = "properties.scanRulesetName")
    private String scanRulesetName;

    /**
     * The workers property.
     */
    @JsonProperty(value = "properties.workers")
    private Integer workers;

    /**
     * The createdAt property.
     */
    @JsonProperty(value = "properties.createdAt", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime createdAt;

    /**
     * The lastModifiedAt property.
     */
    @JsonProperty(value = "properties.lastModifiedAt", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastModifiedAt;

    /**
     * The tenant property.
     */
    @JsonProperty(value = "properties.tenant")
    private String tenant;

    /**
     * The authenticationType property.
     */
    @JsonProperty(value = "properties.authenticationType")
    private String authenticationType;

    /**
     * The clientId property.
     */
    @JsonProperty(value = "properties.clientId")
    private String clientId;

    /**
     * The userName property.
     */
    @JsonProperty(value = "properties.userName")
    private String userName;

    /**
     * The password property.
     */
    @JsonProperty(value = "properties.password")
    private String password;

    /**
     * Get the scanRulesetName value.
     *
     * @return the scanRulesetName value
     */
    public String scanRulesetName() {
        return this.scanRulesetName;
    }

    /**
     * Set the scanRulesetName value.
     *
     * @param scanRulesetName the scanRulesetName value to set
     * @return the PowerBIDelegatedScan object itself.
     */
    public PowerBIDelegatedScan withScanRulesetName(String scanRulesetName) {
        this.scanRulesetName = scanRulesetName;
        return this;
    }

    /**
     * Get the workers value.
     *
     * @return the workers value
     */
    public Integer workers() {
        return this.workers;
    }

    /**
     * Set the workers value.
     *
     * @param workers the workers value to set
     * @return the PowerBIDelegatedScan object itself.
     */
    public PowerBIDelegatedScan withWorkers(Integer workers) {
        this.workers = workers;
        return this;
    }

    /**
     * Get the createdAt value.
     *
     * @return the createdAt value
     */
    public DateTime createdAt() {
        return this.createdAt;
    }

    /**
     * Get the lastModifiedAt value.
     *
     * @return the lastModifiedAt value
     */
    public DateTime lastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     * Get the tenant value.
     *
     * @return the tenant value
     */
    public String tenant() {
        return this.tenant;
    }

    /**
     * Set the tenant value.
     *
     * @param tenant the tenant value to set
     * @return the PowerBIDelegatedScan object itself.
     */
    public PowerBIDelegatedScan withTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }

    /**
     * Get the authenticationType value.
     *
     * @return the authenticationType value
     */
    public String authenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authenticationType value.
     *
     * @param authenticationType the authenticationType value to set
     * @return the PowerBIDelegatedScan object itself.
     */
    public PowerBIDelegatedScan withAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the clientId value.
     *
     * @return the clientId value
     */
    public String clientId() {
        return this.clientId;
    }

    /**
     * Set the clientId value.
     *
     * @param clientId the clientId value to set
     * @return the PowerBIDelegatedScan object itself.
     */
    public PowerBIDelegatedScan withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get the userName value.
     *
     * @return the userName value
     */
    public String userName() {
        return this.userName;
    }

    /**
     * Set the userName value.
     *
     * @param userName the userName value to set
     * @return the PowerBIDelegatedScan object itself.
     */
    public PowerBIDelegatedScan withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * Get the password value.
     *
     * @return the password value
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password value.
     *
     * @param password the password value to set
     * @return the PowerBIDelegatedScan object itself.
     */
    public PowerBIDelegatedScan withPassword(String password) {
        this.password = password;
        return this;
    }

}
