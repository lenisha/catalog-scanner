/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.msft.babylonscanningservice.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ScanRulesetList model.
 */
public class ScanRulesetList {
    /**
     * The value property.
     */
    @JsonProperty(value = "value")
    private List<ScanRuleset> value;

    /**
     * The nextLink property.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * The count property.
     */
    @JsonProperty(value = "count")
    private Long count;

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public List<ScanRuleset> value() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set
     * @return the ScanRulesetList object itself.
     */
    public ScanRulesetList withValue(List<ScanRuleset> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink value.
     *
     * @return the nextLink value
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink value.
     *
     * @param nextLink the nextLink value to set
     * @return the ScanRulesetList object itself.
     */
    public ScanRulesetList withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Get the count value.
     *
     * @return the count value
     */
    public Long count() {
        return this.count;
    }

    /**
     * Set the count value.
     *
     * @param count the count value to set
     * @return the ScanRulesetList object itself.
     */
    public ScanRulesetList withCount(Long count) {
        this.count = count;
        return this;
    }

}
