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
 * Context.
 * The context.
 */
public class JsonContext {
    /**
     * The value of the context.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Get the value of the context.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value of the context.
     *
     * @param value the value value to set
     * @return the JsonContext object itself.
     */
    public JsonContext withValue(String value) {
        this.value = value;
        return this;
    }

}