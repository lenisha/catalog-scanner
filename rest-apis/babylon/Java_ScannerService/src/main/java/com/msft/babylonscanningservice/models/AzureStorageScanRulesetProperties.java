/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.msft.babylonscanningservice.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The AzureStorageScanRulesetProperties model.
 */
public class AzureStorageScanRulesetProperties extends ScanRulesetProperties {
    /**
     * The scanningRule property.
     */
    @JsonProperty(value = "scanningRule")
    private AzureStorageScanRulesetPropertiesScanningRule scanningRule;

    /**
     * Get the scanningRule value.
     *
     * @return the scanningRule value
     */
    public AzureStorageScanRulesetPropertiesScanningRule scanningRule() {
        return this.scanningRule;
    }

    /**
     * Set the scanningRule value.
     *
     * @param scanningRule the scanningRule value to set
     * @return the AzureStorageScanRulesetProperties object itself.
     */
    public AzureStorageScanRulesetProperties withScanningRule(AzureStorageScanRulesetPropertiesScanningRule scanningRule) {
        this.scanningRule = scanningRule;
        return this;
    }

}