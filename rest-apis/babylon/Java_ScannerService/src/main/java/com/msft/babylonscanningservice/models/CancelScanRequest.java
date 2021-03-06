/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.msft.babylonscanningservice.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The CancelScanRequest model.
 */
public class CancelScanRequest {
    /**
     * The id property.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the CancelScanRequest object itself.
     */
    public CancelScanRequest withId(String id) {
        this.id = id;
        return this;
    }

}
