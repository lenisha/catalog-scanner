/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.msft.babylonscanningservice.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The AzureCosmosDbProperties model.
 */
public class AzureCosmosDbProperties extends AzureDataSourceProperties {
    /**
     * The accountUri property.
     */
    @JsonProperty(value = "accountUri")
    private String accountUri;

    /**
     * Get the accountUri value.
     *
     * @return the accountUri value
     */
    public String accountUri() {
        return this.accountUri;
    }

    /**
     * Set the accountUri value.
     *
     * @param accountUri the accountUri value to set
     * @return the AzureCosmosDbProperties object itself.
     */
    public AzureCosmosDbProperties withAccountUri(String accountUri) {
        this.accountUri = accountUri;
        return this;
    }

}
