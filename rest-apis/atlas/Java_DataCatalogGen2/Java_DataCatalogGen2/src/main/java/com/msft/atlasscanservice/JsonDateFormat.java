/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.msft.atlasscanservice;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DateFormat.
 * The date format.
 */
public class JsonDateFormat {
    /**
     * An array of available locales.
     */
    @JsonProperty(value = "availableLocales")
    private List<String> availableLocales;

    /**
     * The calendar property.
     */
    @JsonProperty(value = "calendar")
    private Double calendar;

    /**
     * The dateInstance property.
     */
    @JsonProperty(value = "dateInstance")
    private JsonDateFormat dateInstance;

    /**
     * The dateTimeInstance property.
     */
    @JsonProperty(value = "dateTimeInstance")
    private JsonDateFormat dateTimeInstance;

    /**
     * The instance property.
     */
    @JsonProperty(value = "instance")
    private JsonDateFormat instance;

    /**
     * Determines the leniency of the date format.
     */
    @JsonProperty(value = "lenient")
    private Boolean lenient;

    /**
     * The numberFormat property.
     */
    @JsonProperty(value = "numberFormat")
    private JsonNumberFormat numberFormat;

    /**
     * The timeInstance property.
     */
    @JsonProperty(value = "timeInstance")
    private JsonDateFormat timeInstance;

    /**
     * The timeZone property.
     */
    @JsonProperty(value = "timeZone")
    private JsonTimeZone timeZone;

    /**
     * Get an array of available locales.
     *
     * @return the availableLocales value
     */
    public List<String> availableLocales() {
        return this.availableLocales;
    }

    /**
     * Set an array of available locales.
     *
     * @param availableLocales the availableLocales value to set
     * @return the JsonDateFormat object itself.
     */
    public JsonDateFormat withAvailableLocales(List<String> availableLocales) {
        this.availableLocales = availableLocales;
        return this;
    }

    /**
     * Get the calendar value.
     *
     * @return the calendar value
     */
    public Double calendar() {
        return this.calendar;
    }

    /**
     * Set the calendar value.
     *
     * @param calendar the calendar value to set
     * @return the JsonDateFormat object itself.
     */
    public JsonDateFormat withCalendar(Double calendar) {
        this.calendar = calendar;
        return this;
    }

    /**
     * Get the dateInstance value.
     *
     * @return the dateInstance value
     */
    public JsonDateFormat dateInstance() {
        return this.dateInstance;
    }

    /**
     * Set the dateInstance value.
     *
     * @param dateInstance the dateInstance value to set
     * @return the JsonDateFormat object itself.
     */
    public JsonDateFormat withDateInstance(JsonDateFormat dateInstance) {
        this.dateInstance = dateInstance;
        return this;
    }

    /**
     * Get the dateTimeInstance value.
     *
     * @return the dateTimeInstance value
     */
    public JsonDateFormat dateTimeInstance() {
        return this.dateTimeInstance;
    }

    /**
     * Set the dateTimeInstance value.
     *
     * @param dateTimeInstance the dateTimeInstance value to set
     * @return the JsonDateFormat object itself.
     */
    public JsonDateFormat withDateTimeInstance(JsonDateFormat dateTimeInstance) {
        this.dateTimeInstance = dateTimeInstance;
        return this;
    }

    /**
     * Get the instance value.
     *
     * @return the instance value
     */
    public JsonDateFormat instance() {
        return this.instance;
    }

    /**
     * Set the instance value.
     *
     * @param instance the instance value to set
     * @return the JsonDateFormat object itself.
     */
    public JsonDateFormat withInstance(JsonDateFormat instance) {
        this.instance = instance;
        return this;
    }

    /**
     * Get determines the leniency of the date format.
     *
     * @return the lenient value
     */
    public Boolean lenient() {
        return this.lenient;
    }

    /**
     * Set determines the leniency of the date format.
     *
     * @param lenient the lenient value to set
     * @return the JsonDateFormat object itself.
     */
    public JsonDateFormat withLenient(Boolean lenient) {
        this.lenient = lenient;
        return this;
    }

    /**
     * Get the numberFormat value.
     *
     * @return the numberFormat value
     */
    public JsonNumberFormat numberFormat() {
        return this.numberFormat;
    }

    /**
     * Set the numberFormat value.
     *
     * @param numberFormat the numberFormat value to set
     * @return the JsonDateFormat object itself.
     */
    public JsonDateFormat withNumberFormat(JsonNumberFormat numberFormat) {
        this.numberFormat = numberFormat;
        return this;
    }

    /**
     * Get the timeInstance value.
     *
     * @return the timeInstance value
     */
    public JsonDateFormat timeInstance() {
        return this.timeInstance;
    }

    /**
     * Set the timeInstance value.
     *
     * @param timeInstance the timeInstance value to set
     * @return the JsonDateFormat object itself.
     */
    public JsonDateFormat withTimeInstance(JsonDateFormat timeInstance) {
        this.timeInstance = timeInstance;
        return this;
    }

    /**
     * Get the timeZone value.
     *
     * @return the timeZone value
     */
    public JsonTimeZone timeZone() {
        return this.timeZone;
    }

    /**
     * Set the timeZone value.
     *
     * @param timeZone the timeZone value to set
     * @return the JsonDateFormat object itself.
     */
    public JsonDateFormat withTimeZone(JsonTimeZone timeZone) {
        this.timeZone = timeZone;
        return this;
    }

}
