/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.msft.babylonscanningservice.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The AdlsGen1Properties model.
 */
public class AdlsGen1Properties extends AzureDataSourceProperties {
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
     * @return the AdlsGen1Properties object itself.
     */
    public AdlsGen1Properties withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

}
