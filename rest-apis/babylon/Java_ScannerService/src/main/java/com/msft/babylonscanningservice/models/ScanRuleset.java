/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.msft.babylonscanningservice.models;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * The ScanRuleset model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind", defaultImpl = ScanRuleset.class)
@JsonTypeName("ScanRuleset")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "AdlsGen1", value = AdlsGen1ScanRuleset.class),
    @JsonSubTypes.Type(name = "AdlsGen2", value = AdlsGen2ScanRuleset.class),
    @JsonSubTypes.Type(name = "AmazonS3", value = AmazonS3ScanRuleset.class),
    @JsonSubTypes.Type(name = "AzureCosmosDb", value = AzureCosmosDbScanRuleset.class),
    @JsonSubTypes.Type(name = "AzureFileService", value = AzureFileServiceScanRuleset.class),
    @JsonSubTypes.Type(name = "AzureSqlDatabase", value = AzureSqlDatabaseScanRuleset.class),
    @JsonSubTypes.Type(name = "AzureSqlDatabaseManagedInstance", value = AzureSqlDatabaseManagedInstanceScanRuleset.class),
    @JsonSubTypes.Type(name = "AzureSqlDataWarehouse", value = AzureSqlDataWarehouseScanRuleset.class),
    @JsonSubTypes.Type(name = "AzureStorage", value = AzureStorageScanRuleset.class),
    @JsonSubTypes.Type(name = "PowerBI", value = PowerBIScanRuleset.class)
})
public class ScanRuleset extends ProxyResource {
}