/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.msft.babylonscanningservice.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The AdlsGen2ScanRulesetProperties model.
 */
public class AdlsGen2ScanRulesetProperties extends ScanRulesetProperties {
    /**
     * The scanningRule property.
     */
    @JsonProperty(value = "scanningRule")
    private AdlsGen2ScanRulesetPropertiesScanningRule scanningRule;

    /**
     * Get the scanningRule value.
     *
     * @return the scanningRule value
     */
    public AdlsGen2ScanRulesetPropertiesScanningRule scanningRule() {
        return this.scanningRule;
    }

    /**
     * Set the scanningRule value.
     *
     * @param scanningRule the scanningRule value to set
     * @return the AdlsGen2ScanRulesetProperties object itself.
     */
    public AdlsGen2ScanRulesetProperties withScanningRule(AdlsGen2ScanRulesetPropertiesScanningRule scanningRule) {
        this.scanningRule = scanningRule;
        return this;
    }

}