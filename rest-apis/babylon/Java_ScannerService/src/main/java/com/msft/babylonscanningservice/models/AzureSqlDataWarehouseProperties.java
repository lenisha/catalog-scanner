/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.msft.babylonscanningservice.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The AzureSqlDataWarehouseProperties model.
 */
public class AzureSqlDataWarehouseProperties extends AzureDataSourceProperties {
    /**
     * The serverEndpoint property.
     */
    @JsonProperty(value = "serverEndpoint")
    private String serverEndpoint;

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
     * @return the AzureSqlDataWarehouseProperties object itself.
     */
    public AzureSqlDataWarehouseProperties withServerEndpoint(String serverEndpoint) {
        this.serverEndpoint = serverEndpoint;
        return this;
    }

}
