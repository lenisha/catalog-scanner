/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.msft.babylonscanningservice.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ErrorResponseModel model.
 */
public class ErrorResponseModel {
    /**
     * The error property.
     */
    @JsonProperty(value = "error")
    private ErrorResponseModelError error;

    /**
     * Get the error value.
     *
     * @return the error value
     */
    public ErrorResponseModelError error() {
        return this.error;
    }

    /**
     * Set the error value.
     *
     * @param error the error value to set
     * @return the ErrorResponseModel object itself.
     */
    public ErrorResponseModel withError(ErrorResponseModelError error) {
        this.error = error;
        return this;
    }

}
