/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.msft.babylonscanningservice;

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.msft.babylonscanningservice.models.DataSource;
import com.msft.babylonscanningservice.models.DataSourceList;
import com.msft.babylonscanningservice.models.ErrorResponseModelException;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in DataSources.
 */
public interface DataSources {
    /**
     * Creates or Updates a data source.
     *
     * @param dataSourceName the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseModelException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DataSource object if successful.
     */
    DataSource createOrUpdate(String dataSourceName);

    /**
     * Creates or Updates a data source.
     *
     * @param dataSourceName the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<DataSource> createOrUpdateAsync(String dataSourceName, final ServiceCallback<DataSource> serviceCallback);

    /**
     * Creates or Updates a data source.
     *
     * @param dataSourceName the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DataSource object
     */
    Observable<DataSource> createOrUpdateAsync(String dataSourceName);

    /**
     * Creates or Updates a data source.
     *
     * @param dataSourceName the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DataSource object
     */
    Observable<ServiceResponse<DataSource>> createOrUpdateWithServiceResponseAsync(String dataSourceName);
    /**
     * Creates or Updates a data source.
     *
     * @param dataSourceName the String value
     * @param body the DataSource value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseModelException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DataSource object if successful.
     */
    DataSource createOrUpdate(String dataSourceName, DataSource body);

    /**
     * Creates or Updates a data source.
     *
     * @param dataSourceName the String value
     * @param body the DataSource value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<DataSource> createOrUpdateAsync(String dataSourceName, DataSource body, final ServiceCallback<DataSource> serviceCallback);

    /**
     * Creates or Updates a data source.
     *
     * @param dataSourceName the String value
     * @param body the DataSource value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DataSource object
     */
    Observable<DataSource> createOrUpdateAsync(String dataSourceName, DataSource body);

    /**
     * Creates or Updates a data source.
     *
     * @param dataSourceName the String value
     * @param body the DataSource value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DataSource object
     */
    Observable<ServiceResponse<DataSource>> createOrUpdateWithServiceResponseAsync(String dataSourceName, DataSource body);

    /**
     * Get a data source.
     *
     * @param dataSourceName the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseModelException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DataSource object if successful.
     */
    DataSource get(String dataSourceName);

    /**
     * Get a data source.
     *
     * @param dataSourceName the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<DataSource> getAsync(String dataSourceName, final ServiceCallback<DataSource> serviceCallback);

    /**
     * Get a data source.
     *
     * @param dataSourceName the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DataSource object
     */
    Observable<DataSource> getAsync(String dataSourceName);

    /**
     * Get a data source.
     *
     * @param dataSourceName the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DataSource object
     */
    Observable<ServiceResponse<DataSource>> getWithServiceResponseAsync(String dataSourceName);

    /**
     * Deletes a data source.
     *
     * @param dataSourceName the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseModelException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void delete(String dataSourceName);

    /**
     * Deletes a data source.
     *
     * @param dataSourceName the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> deleteAsync(String dataSourceName, final ServiceCallback<Void> serviceCallback);

    /**
     * Deletes a data source.
     *
     * @param dataSourceName the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> deleteAsync(String dataSourceName);

    /**
     * Deletes a data source.
     *
     * @param dataSourceName the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String dataSourceName);

    /**
     * List data sources in Data catalog.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseModelException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DataSourceList object if successful.
     */
    DataSourceList listByAccount();

    /**
     * List data sources in Data catalog.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<DataSourceList> listByAccountAsync(final ServiceCallback<DataSourceList> serviceCallback);

    /**
     * List data sources in Data catalog.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DataSourceList object
     */
    Observable<DataSourceList> listByAccountAsync();

    /**
     * List data sources in Data catalog.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DataSourceList object
     */
    Observable<ServiceResponse<DataSourceList>> listByAccountWithServiceResponseAsync();
    /**
     * List data sources in Data catalog.
     *
     * @param skipToken the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseModelException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DataSourceList object if successful.
     */
    DataSourceList listByAccount(String skipToken);

    /**
     * List data sources in Data catalog.
     *
     * @param skipToken the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<DataSourceList> listByAccountAsync(String skipToken, final ServiceCallback<DataSourceList> serviceCallback);

    /**
     * List data sources in Data catalog.
     *
     * @param skipToken the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DataSourceList object
     */
    Observable<DataSourceList> listByAccountAsync(String skipToken);

    /**
     * List data sources in Data catalog.
     *
     * @param skipToken the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DataSourceList object
     */
    Observable<ServiceResponse<DataSourceList>> listByAccountWithServiceResponseAsync(String skipToken);

}
