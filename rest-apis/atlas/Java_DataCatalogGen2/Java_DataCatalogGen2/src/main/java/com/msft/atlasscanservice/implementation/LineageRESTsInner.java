/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.msft.atlasscanservice.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;
import rx.functions.Func1;

/**
 * An instance of this class provides access to all the operations defined
 * in LineageRESTs.
 */
public class LineageRESTsInner {
    /** The Retrofit service to perform REST calls. */
    private LineageRESTsService service;
    /** The service client containing this operation class. */
    private DataCatalogClientImpl client;

    /**
     * Initializes an instance of LineageRESTsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public LineageRESTsInner(Retrofit retrofit, DataCatalogClientImpl client) {
        this.service = retrofit.create(LineageRESTsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for LineageRESTs to be
     * used by Retrofit to perform actually REST calls.
     */
    interface LineageRESTsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.msft.atlasscanservice.LineageRESTs getLineageGraph" })
        @GET("v2/lineage/{guid}")
        Observable<Response<ResponseBody>> getLineageGraph(@Path("guid") String guid, @Query("depth") Integer depth, @Query("direction") String direction, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets lineage info about the specified entity by GUID.
     *
     * @param guid The globally unique identifier of the entity.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the JsonAtlasLineageInfoInner object if successful.
     */
    public JsonAtlasLineageInfoInner getLineageGraph(String guid) {
        return getLineageGraphWithServiceResponseAsync(guid).toBlocking().single().body();
    }

    /**
     * Gets lineage info about the specified entity by GUID.
     *
     * @param guid The globally unique identifier of the entity.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<JsonAtlasLineageInfoInner> getLineageGraphAsync(String guid, final ServiceCallback<JsonAtlasLineageInfoInner> serviceCallback) {
        return ServiceFuture.fromResponse(getLineageGraphWithServiceResponseAsync(guid), serviceCallback);
    }

    /**
     * Gets lineage info about the specified entity by GUID.
     *
     * @param guid The globally unique identifier of the entity.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the JsonAtlasLineageInfoInner object
     */
    public Observable<JsonAtlasLineageInfoInner> getLineageGraphAsync(String guid) {
        return getLineageGraphWithServiceResponseAsync(guid).map(new Func1<ServiceResponse<JsonAtlasLineageInfoInner>, JsonAtlasLineageInfoInner>() {
            @Override
            public JsonAtlasLineageInfoInner call(ServiceResponse<JsonAtlasLineageInfoInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets lineage info about the specified entity by GUID.
     *
     * @param guid The globally unique identifier of the entity.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the JsonAtlasLineageInfoInner object
     */
    public Observable<ServiceResponse<JsonAtlasLineageInfoInner>> getLineageGraphWithServiceResponseAsync(String guid) {
        if (guid == null) {
            throw new IllegalArgumentException("Parameter guid is required and cannot be null.");
        }
        if (this.client.direction() == null) {
            throw new IllegalArgumentException("Parameter this.client.direction() is required and cannot be null.");
        }
        return service.getLineageGraph(guid, this.client.depth(), this.client.direction(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<JsonAtlasLineageInfoInner>>>() {
                @Override
                public Observable<ServiceResponse<JsonAtlasLineageInfoInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<JsonAtlasLineageInfoInner> clientResponse = getLineageGraphDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<JsonAtlasLineageInfoInner> getLineageGraphDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<JsonAtlasLineageInfoInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<JsonAtlasLineageInfoInner>() { }.getType())
                .register(400, new TypeToken<Void>() { }.getType())
                .register(404, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
