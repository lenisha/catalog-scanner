/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.msft.babylonscanningservice.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The AzureFileServiceProperties model.
 */
public class AzureFileServiceProperties extends AzureDataSourceProperties {
    /**
     * The endpoint property.
     */
    @JsonProperty(value = "endpoint")
    private String endpoint;

    /**
     * Get the endpoint value.
     *
     * @return the endpoint value
     */
    public String endpoint() {
        return this.endpoint;
    }

    /**
     * Set the endpoint value.
     *
     * @param endpoint the endpoint value to set
     * @return the AzureFileServiceProperties object itself.
     */
    public AzureFileServiceProperties withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

}
