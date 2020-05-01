/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.msft.babylonscanningservice.implementation;

import retrofit2.Retrofit;
import com.msft.babylonscanningservice.DataSources;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import com.msft.babylonscanningservice.models.DataSource;
import com.msft.babylonscanningservice.models.DataSourceList;
import com.msft.babylonscanningservice.models.ErrorResponseModelException;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;
import rx.functions.Func1;

/**
 * An instance of this class provides access to all the operations defined
 * in DataSources.
 */
public class DataSourcesImpl implements DataSources {
    /** The Retrofit service to perform REST calls. */
    private DataSourcesService service;
    /** The service client containing this operation class. */
    private MicrosoftScanningClientImpl client;

    /**
     * Initializes an instance of DataSources.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public DataSourcesImpl(Retrofit retrofit, MicrosoftScanningClientImpl client) {
        this.service = retrofit.create(DataSourcesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for DataSources to be
     * used by Retrofit to perform actually REST calls.
     */
    interface DataSourcesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.msft.babylonscanningservice.DataSources createOrUpdate" })
        @PUT("datasources/{dataSourceName}")
        Observable<Response<ResponseBody>> createOrUpdate(@Path("dataSourceName") String dataSourceName, @Header("x-ms-account-id") String accountId, @Header("x-ms-account-name") String accountName, @Query("api-version") String apiVersion, @Body DataSource body);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.msft.babylonscanningservice.DataSources get" })
        @GET("datasources/{dataSourceName}")
        Observable<Response<ResponseBody>> get(@Path("dataSourceName") String dataSourceName, @Header("x-ms-account-id") String accountId, @Header("x-ms-account-name") String accountName, @Query("api-version") String apiVersion);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.msft.babylonscanningservice.DataSources delete" })
        @HTTP(path = "datasources/{dataSourceName}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("dataSourceName") String dataSourceName, @Header("x-ms-account-id") String accountId, @Header("x-ms-account-name") String accountName, @Query("api-version") String apiVersion);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.msft.babylonscanningservice.DataSources listByAccount" })
        @GET("datasources")
        Observable<Response<ResponseBody>> listByAccount(@Query("$skipToken") String skipToken, @Header("x-ms-account-id") String accountId, @Header("x-ms-account-name") String accountName, @Query("api-version") String apiVersion);

    }

    /**
     * Creates or Updates a data source.
     *
     * @param dataSourceName the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseModelException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DataSource object if successful.
     */
    public DataSource createOrUpdate(String dataSourceName) {
        return createOrUpdateWithServiceResponseAsync(dataSourceName).toBlocking().single().body();
    }

    /**
     * Creates or Updates a data source.
     *
     * @param dataSourceName the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DataSource> createOrUpdateAsync(String dataSourceName, final ServiceCallback<DataSource> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(dataSourceName), serviceCallback);
    }

    /**
     * Creates or Updates a data source.
     *
     * @param dataSourceName the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DataSource object
     */
    public Observable<DataSource> createOrUpdateAsync(String dataSourceName) {
        return createOrUpdateWithServiceResponseAsync(dataSourceName).map(new Func1<ServiceResponse<DataSource>, DataSource>() {
            @Override
            public DataSource call(ServiceResponse<DataSource> response) {
                return response.body();
            }
        });
    }

    /**
     * Creates or Updates a data source.
     *
     * @param dataSourceName the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DataSource object
     */
    public Observable<ServiceResponse<DataSource>> createOrUpdateWithServiceResponseAsync(String dataSourceName) {
        if (dataSourceName == null) {
            throw new IllegalArgumentException("Parameter dataSourceName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final DataSource body = null;
        return service.createOrUpdate(dataSourceName, this.client.accountId(), this.client.accountName(), this.client.apiVersion(), body)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DataSource>>>() {
                @Override
                public Observable<ServiceResponse<DataSource>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DataSource> clientResponse = createOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

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
    public DataSource createOrUpdate(String dataSourceName, DataSource body) {
        return createOrUpdateWithServiceResponseAsync(dataSourceName, body).toBlocking().single().body();
    }

    /**
     * Creates or Updates a data source.
     *
     * @param dataSourceName the String value
     * @param body the DataSource value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DataSource> createOrUpdateAsync(String dataSourceName, DataSource body, final ServiceCallback<DataSource> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(dataSourceName, body), serviceCallback);
    }

    /**
     * Creates or Updates a data source.
     *
     * @param dataSourceName the String value
     * @param body the DataSource value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DataSource object
     */
    public Observable<DataSource> createOrUpdateAsync(String dataSourceName, DataSource body) {
        return createOrUpdateWithServiceResponseAsync(dataSourceName, body).map(new Func1<ServiceResponse<DataSource>, DataSource>() {
            @Override
            public DataSource call(ServiceResponse<DataSource> response) {
                return response.body();
            }
        });
    }

    /**
     * Creates or Updates a data source.
     *
     * @param dataSourceName the String value
     * @param body the DataSource value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DataSource object
     */
    public Observable<ServiceResponse<DataSource>> createOrUpdateWithServiceResponseAsync(String dataSourceName, DataSource body) {
        if (dataSourceName == null) {
            throw new IllegalArgumentException("Parameter dataSourceName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        Validator.validate(body);
        return service.createOrUpdate(dataSourceName, this.client.accountId(), this.client.accountName(), this.client.apiVersion(), body)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DataSource>>>() {
                @Override
                public Observable<ServiceResponse<DataSource>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DataSource> clientResponse = createOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DataSource> createOrUpdateDelegate(Response<ResponseBody> response) throws ErrorResponseModelException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<DataSource, ErrorResponseModelException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<DataSource>() { }.getType())
                .register(201, new TypeToken<DataSource>() { }.getType())
                .registerError(ErrorResponseModelException.class)
                .build(response);
    }

    /**
     * Get a data source.
     *
     * @param dataSourceName the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseModelException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DataSource object if successful.
     */
    public DataSource get(String dataSourceName) {
        return getWithServiceResponseAsync(dataSourceName).toBlocking().single().body();
    }

    /**
     * Get a data source.
     *
     * @param dataSourceName the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DataSource> getAsync(String dataSourceName, final ServiceCallback<DataSource> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(dataSourceName), serviceCallback);
    }

    /**
     * Get a data source.
     *
     * @param dataSourceName the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DataSource object
     */
    public Observable<DataSource> getAsync(String dataSourceName) {
        return getWithServiceResponseAsync(dataSourceName).map(new Func1<ServiceResponse<DataSource>, DataSource>() {
            @Override
            public DataSource call(ServiceResponse<DataSource> response) {
                return response.body();
            }
        });
    }

    /**
     * Get a data source.
     *
     * @param dataSourceName the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DataSource object
     */
    public Observable<ServiceResponse<DataSource>> getWithServiceResponseAsync(String dataSourceName) {
        if (dataSourceName == null) {
            throw new IllegalArgumentException("Parameter dataSourceName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(dataSourceName, this.client.accountId(), this.client.accountName(), this.client.apiVersion())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DataSource>>>() {
                @Override
                public Observable<ServiceResponse<DataSource>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DataSource> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DataSource> getDelegate(Response<ResponseBody> response) throws ErrorResponseModelException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<DataSource, ErrorResponseModelException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<DataSource>() { }.getType())
                .registerError(ErrorResponseModelException.class)
                .build(response);
    }

    /**
     * Deletes a data source.
     *
     * @param dataSourceName the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseModelException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void delete(String dataSourceName) {
        deleteWithServiceResponseAsync(dataSourceName).toBlocking().single().body();
    }

    /**
     * Deletes a data source.
     *
     * @param dataSourceName the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> deleteAsync(String dataSourceName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(dataSourceName), serviceCallback);
    }

    /**
     * Deletes a data source.
     *
     * @param dataSourceName the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> deleteAsync(String dataSourceName) {
        return deleteWithServiceResponseAsync(dataSourceName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Deletes a data source.
     *
     * @param dataSourceName the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String dataSourceName) {
        if (dataSourceName == null) {
            throw new IllegalArgumentException("Parameter dataSourceName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.delete(dataSourceName, this.client.accountId(), this.client.accountName(), this.client.apiVersion())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> deleteDelegate(Response<ResponseBody> response) throws ErrorResponseModelException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, ErrorResponseModelException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .register(202, new TypeToken<Void>() { }.getType())
                .register(204, new TypeToken<Void>() { }.getType())
                .registerError(ErrorResponseModelException.class)
                .build(response);
    }

    /**
     * List data sources in Data catalog.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseModelException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DataSourceList object if successful.
     */
    public DataSourceList listByAccount() {
        return listByAccountWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * List data sources in Data catalog.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DataSourceList> listByAccountAsync(final ServiceCallback<DataSourceList> serviceCallback) {
        return ServiceFuture.fromResponse(listByAccountWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * List data sources in Data catalog.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DataSourceList object
     */
    public Observable<DataSourceList> listByAccountAsync() {
        return listByAccountWithServiceResponseAsync().map(new Func1<ServiceResponse<DataSourceList>, DataSourceList>() {
            @Override
            public DataSourceList call(ServiceResponse<DataSourceList> response) {
                return response.body();
            }
        });
    }

    /**
     * List data sources in Data catalog.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DataSourceList object
     */
    public Observable<ServiceResponse<DataSourceList>> listByAccountWithServiceResponseAsync() {
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String skipToken = null;
        return service.listByAccount(skipToken, this.client.accountId(), this.client.accountName(), this.client.apiVersion())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DataSourceList>>>() {
                @Override
                public Observable<ServiceResponse<DataSourceList>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DataSourceList> clientResponse = listByAccountDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * List data sources in Data catalog.
     *
     * @param skipToken the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseModelException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DataSourceList object if successful.
     */
    public DataSourceList listByAccount(String skipToken) {
        return listByAccountWithServiceResponseAsync(skipToken).toBlocking().single().body();
    }

    /**
     * List data sources in Data catalog.
     *
     * @param skipToken the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DataSourceList> listByAccountAsync(String skipToken, final ServiceCallback<DataSourceList> serviceCallback) {
        return ServiceFuture.fromResponse(listByAccountWithServiceResponseAsync(skipToken), serviceCallback);
    }

    /**
     * List data sources in Data catalog.
     *
     * @param skipToken the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DataSourceList object
     */
    public Observable<DataSourceList> listByAccountAsync(String skipToken) {
        return listByAccountWithServiceResponseAsync(skipToken).map(new Func1<ServiceResponse<DataSourceList>, DataSourceList>() {
            @Override
            public DataSourceList call(ServiceResponse<DataSourceList> response) {
                return response.body();
            }
        });
    }

    /**
     * List data sources in Data catalog.
     *
     * @param skipToken the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DataSourceList object
     */
    public Observable<ServiceResponse<DataSourceList>> listByAccountWithServiceResponseAsync(String skipToken) {
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listByAccount(skipToken, this.client.accountId(), this.client.accountName(), this.client.apiVersion())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DataSourceList>>>() {
                @Override
                public Observable<ServiceResponse<DataSourceList>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DataSourceList> clientResponse = listByAccountDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DataSourceList> listByAccountDelegate(Response<ResponseBody> response) throws ErrorResponseModelException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<DataSourceList, ErrorResponseModelException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<DataSourceList>() { }.getType())
                .registerError(ErrorResponseModelException.class)
                .build(response);
    }

}