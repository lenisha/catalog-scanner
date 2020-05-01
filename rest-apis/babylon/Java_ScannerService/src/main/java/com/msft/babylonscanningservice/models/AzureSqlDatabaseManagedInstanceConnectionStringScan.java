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
 * The AzureSqlDatabaseManagedInstanceConnectionStringScan model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind", defaultImpl = AzureSqlDatabaseManagedInstanceConnectionStringScan.class)
@JsonTypeName("AzureSqlDatabaseManagedInstanceConnectionString")
@JsonFlatten
public class AzureSqlDatabaseManagedInstanceConnectionStringScan extends Scan {
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
     * The serverEndpoint property.
     */
    @JsonProperty(value = "properties.serverEndpoint")
    private String serverEndpoint;

    /**
     * The databaseName property.
     */
    @JsonProperty(value = "properties.databaseName")
    private String databaseName;

    /**
     * The username property.
     */
    @JsonProperty(value = "properties.username")
    private String username;

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
     * @return the AzureSqlDatabaseManagedInstanceConnectionStringScan object itself.
     */
    public AzureSqlDatabaseManagedInstanceConnectionStringScan withScanRulesetName(String scanRulesetName) {
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
     * @return the AzureSqlDatabaseManagedInstanceConnectionStringScan object itself.
     */
    public AzureSqlDatabaseManagedInstanceConnectionStringScan withWorkers(Integer workers) {
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
     * Get the serverEndpoint value.
     *
     * @return the serverEndpoint value
     */
    public String serverEndpoint() {
        return this.serverEndpoint;
    }

    /**
     * Set the serverEndpoint value.
     *
     * @param serverEndpoint the serverEndpoint value to set
     * @return the AzureSqlDatabaseManagedInstanceConnectionStringScan object itself.
     */
    public AzureSqlDatabaseManagedInstanceConnectionStringScan withServerEndpoint(String serverEndpoint) {
        this.serverEndpoint = serverEndpoint;
        return this;
    }

    /**
     * Get the databaseName value.
     *
     * @return the databaseName value
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Set the databaseName value.
     *
     * @param databaseName the databaseName value to set
     * @return the AzureSqlDatabaseManagedInstanceConnectionStringScan object itself.
     */
    public AzureSqlDatabaseManagedInstanceConnectionStringScan withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * Get the username value.
     *
     * @return the username value
     */
    public String username() {
        return this.username;
    }

    /**
     * Set the username value.
     *
     * @param username the username value to set
     * @return the AzureSqlDatabaseManagedInstanceConnectionStringScan object itself.
     */
    public AzureSqlDatabaseManagedInstanceConnectionStringScan withUsername(String username) {
        this.username = username;
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
     * @return the AzureSqlDatabaseManagedInstanceConnectionStringScan object itself.
     */
    public AzureSqlDatabaseManagedInstanceConnectionStringScan withPassword(String password) {
        this.password = password;
        return this;
    }

}
