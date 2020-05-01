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
 * The Scan model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind", defaultImpl = Scan.class)
@JsonTypeName("Scan")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "AdlsGen1Msi", value = AdlsGen1MsiScan.class),
    @JsonSubTypes.Type(name = "AdlsGen1ServicePrincipal", value = AdlsGen1ServicePrincipalScan.class),
    @JsonSubTypes.Type(name = "AdlsGen2AccessKey", value = AdlsGen2AccessKeyScan.class),
    @JsonSubTypes.Type(name = "AdlsGen2Msi", value = AdlsGen2MsiScan.class),
    @JsonSubTypes.Type(name = "AdlsGen2ServicePrincipal", value = AdlsGen2ServicePrincipalScan.class),
    @JsonSubTypes.Type(name = "AmazonS3RoleARN", value = AmazonS3RoleARNScan.class),
    @JsonSubTypes.Type(name = "AmazonS3AccessKey", value = AmazonS3AccessKeyScan.class),
    @JsonSubTypes.Type(name = "AzureCosmosDbAccessKey", value = AzureCosmosDbAccessKeyScan.class),
    @JsonSubTypes.Type(name = "AzureFileServiceAccessKey", value = AzureFileServiceAccessKeyScan.class),
    @JsonSubTypes.Type(name = "AzureSqlDatabaseConnectionString", value = AzureSqlDatabaseConnectionStringScan.class),
    @JsonSubTypes.Type(name = "AzureSqlDatabaseMsi", value = AzureSqlDatabaseMsiScan.class),
    @JsonSubTypes.Type(name = "AzureSqlDatabaseServicePrincipal", value = AzureSqlDatabaseServicePrincipalScan.class),
    @JsonSubTypes.Type(name = "AzureSqlDatabaseManagedInstanceConnectionString", value = AzureSqlDatabaseManagedInstanceConnectionStringScan.class),
    @JsonSubTypes.Type(name = "AzureSqlDatabaseManagedInstanceMsi", value = AzureSqlDatabaseManagedInstanceMsiScan.class),
    @JsonSubTypes.Type(name = "AzureSqlDatabaseManagedInstanceServicePrincipal", value = AzureSqlDatabaseManagedInstanceServicePrincipalScan.class),
    @JsonSubTypes.Type(name = "AzureSqlDataWarehouseConnectionString", value = AzureSqlDataWarehouseConnectionStringScan.class),
    @JsonSubTypes.Type(name = "AzureSqlDataWarehouseMsi", value = AzureSqlDataWarehouseMsiScan.class),
    @JsonSubTypes.Type(name = "AzureSqlDataWarehouseServicePrincipal", value = AzureSqlDataWarehouseServicePrincipalScan.class),
    @JsonSubTypes.Type(name = "AzureStorageAccessKey", value = AzureStorageAccessKeyScan.class),
    @JsonSubTypes.Type(name = "AzureStorageMsi", value = AzureStorageMsiScan.class),
    @JsonSubTypes.Type(name = "AzureStorageSas", value = AzureStorageSasScan.class),
    @JsonSubTypes.Type(name = "AzureStorageServicePrincipal", value = AzureStorageServicePrincipalScan.class),
    @JsonSubTypes.Type(name = "PowerBIDelegated", value = PowerBIDelegatedScan.class),
    @JsonSubTypes.Type(name = "PowerBIMsi", value = PowerBIMsiScan.class)
})
public class Scan extends ProxyResource {
}
