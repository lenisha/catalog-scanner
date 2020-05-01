/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.msft.babylonscanningservice.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The AmazonS3Properties model.
 */
public class AmazonS3Properties extends DataSourceProperties {
    /**
     * The serviceUrl property.
     */
    @JsonProperty(value = "serviceUrl")
    private String serviceUrl;

    /**
     * The roleARN property.
     */
    @JsonProperty(value = "roleARN")
    private String roleARN;

    /**
     * Get the serviceUrl value.
     *
     * @return the serviceUrl value
     */
    public String serviceUrl() {
        return this.serviceUrl;
    }

    /**
     * Set the serviceUrl value.
     *
     * @param serviceUrl the serviceUrl value to set
     * @return the AmazonS3Properties object itself.
     */
    public AmazonS3Properties withServiceUrl(String serviceUrl) {
        this.serviceUrl = serviceUrl;
        return this;
    }

    /**
     * Get the roleARN value.
     *
     * @return the roleARN value
     */
    public String roleARN() {
        return this.roleARN;
    }

    /**
     * Set the roleARN value.
     *
     * @param roleARN the roleARN value to set
     * @return the AmazonS3Properties object itself.
     */
    public AmazonS3Properties withRoleARN(String roleARN) {
        this.roleARN = roleARN;
        return this;
    }

}
