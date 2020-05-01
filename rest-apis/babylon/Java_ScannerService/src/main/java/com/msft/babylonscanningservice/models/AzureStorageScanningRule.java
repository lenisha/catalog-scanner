/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.msft.babylonscanningservice.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The AzureStorageScanningRule model.
 */
public class AzureStorageScanningRule {
    /**
     * The fileExtensions property.
     */
    @JsonProperty(value = "fileExtensions")
    private List<String> fileExtensions;

    /**
     * Get the fileExtensions value.
     *
     * @return the fileExtensions value
     */
    public List<String> fileExtensions() {
        return this.fileExtensions;
    }

    /**
     * Set the fileExtensions value.
     *
     * @param fileExtensions the fileExtensions value to set
     * @return the AzureStorageScanningRule object itself.
     */
    public AzureStorageScanningRule withFileExtensions(List<String> fileExtensions) {
        this.fileExtensions = fileExtensions;
        return this;
    }

}