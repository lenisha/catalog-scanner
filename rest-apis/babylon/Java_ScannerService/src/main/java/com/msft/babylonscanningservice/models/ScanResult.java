/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.msft.babylonscanningservice.models;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ScanResult model.
 */
public class ScanResult {
    /**
     * The id property.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * The status property.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private String status;

    /**
     * The assetsDiscovered property.
     */
    @JsonProperty(value = "assetsDiscovered", access = JsonProperty.Access.WRITE_ONLY)
    private Long assetsDiscovered;

    /**
     * The assetsClassified property.
     */
    @JsonProperty(value = "assetsClassified", access = JsonProperty.Access.WRITE_ONLY)
    private Long assetsClassified;

    /**
     * The startTime property.
     */
    @JsonProperty(value = "startTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime startTime;

    /**
     * The endTime property.
     */
    @JsonProperty(value = "endTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime endTime;

    /**
     * The errorMessage property.
     */
    @JsonProperty(value = "errorMessage", access = JsonProperty.Access.WRITE_ONLY)
    private String errorMessage;

    /**
     * The error property.
     */
    @JsonProperty(value = "error", access = JsonProperty.Access.WRITE_ONLY)
    private ScanResultError error;

    /**
     * The runType property.
     */
    @JsonProperty(value = "runType", access = JsonProperty.Access.WRITE_ONLY)
    private String runType;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the status value.
     *
     * @return the status value
     */
    public String status() {
        return this.status;
    }

    /**
     * Get the assetsDiscovered value.
     *
     * @return the assetsDiscovered value
     */
    public Long assetsDiscovered() {
        return this.assetsDiscovered;
    }

    /**
     * Get the assetsClassified value.
     *
     * @return the assetsClassified value
     */
    public Long assetsClassified() {
        return this.assetsClassified;
    }

    /**
     * Get the startTime value.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Get the endTime value.
     *
     * @return the endTime value
     */
    public DateTime endTime() {
        return this.endTime;
    }

    /**
     * Get the errorMessage value.
     *
     * @return the errorMessage value
     */
    public String errorMessage() {
        return this.errorMessage;
    }

    /**
     * Get the error value.
     *
     * @return the error value
     */
    public ScanResultError error() {
        return this.error;
    }

    /**
     * Get the runType value.
     *
     * @return the runType value
     */
    public String runType() {
        return this.runType;
    }

}
