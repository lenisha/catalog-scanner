/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.msft.atlasscanservice;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TimeBoundary.
 * Captures time-boundary details.
 */
public class JsonTimeBoundary {
    /**
     * The end of the time boundary.
     */
    @JsonProperty(value = "endTime")
    private String endTime;

    /**
     * The start of the time boundary.
     */
    @JsonProperty(value = "startTime")
    private String startTime;

    /**
     * The timezone of the time boundary.
     */
    @JsonProperty(value = "timeZone")
    private String timeZone;

    /**
     * Get the end of the time boundary.
     *
     * @return the endTime value
     */
    public String endTime() {
        return this.endTime;
    }

    /**
     * Set the end of the time boundary.
     *
     * @param endTime the endTime value to set
     * @return the JsonTimeBoundary object itself.
     */
    public JsonTimeBoundary withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the start of the time boundary.
     *
     * @return the startTime value
     */
    public String startTime() {
        return this.startTime;
    }

    /**
     * Set the start of the time boundary.
     *
     * @param startTime the startTime value to set
     * @return the JsonTimeBoundary object itself.
     */
    public JsonTimeBoundary withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the timezone of the time boundary.
     *
     * @return the timeZone value
     */
    public String timeZone() {
        return this.timeZone;
    }

    /**
     * Set the timezone of the time boundary.
     *
     * @param timeZone the timeZone value to set
     * @return the JsonTimeBoundary object itself.
     */
    public JsonTimeBoundary withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

}
