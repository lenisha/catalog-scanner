/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.msft.babylonscanningservice.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ClassificationRuleVersionAction model.
 */
public class ClassificationRuleVersionAction {
    /**
     * The classificationAction property.
     */
    @JsonProperty(value = "classificationAction")
    private String classificationAction;

    /**
     * Get the classificationAction value.
     *
     * @return the classificationAction value
     */
    public String classificationAction() {
        return this.classificationAction;
    }

    /**
     * Set the classificationAction value.
     *
     * @param classificationAction the classificationAction value to set
     * @return the ClassificationRuleVersionAction object itself.
     */
    public ClassificationRuleVersionAction withClassificationAction(String classificationAction) {
        this.classificationAction = classificationAction;
        return this;
    }

}