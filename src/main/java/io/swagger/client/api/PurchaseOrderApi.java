/*
 * Beanie ERP API
 * An API specification for interacting with the Beanie ERP system
 *
 * OpenAPI spec version: 0.2
 * Contact: dev@bean.ie
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.ErrorModel;
import io.swagger.client.model.PurchaseOrder;
import io.swagger.client.model.PurchaseOrderInput;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PurchaseOrderApi {
    private ApiClient apiClient;

    public PurchaseOrderApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PurchaseOrderApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for addPurchaseOrder
     * @param purchaseOrders Purchase order to add to the system (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addPurchaseOrderCall(PurchaseOrderInput purchaseOrders, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = purchaseOrders;

        // create path and map variables
        String localVarPath = "/purchase_orders";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "api_key" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call addPurchaseOrderValidateBeforeCall(PurchaseOrderInput purchaseOrders, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'purchaseOrders' is set
        if (purchaseOrders == null) {
            throw new ApiException("Missing the required parameter 'purchaseOrders' when calling addPurchaseOrder(Async)");
        }
        

        com.squareup.okhttp.Call call = addPurchaseOrderCall(purchaseOrders, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * Creates a new purchase order in the system
     * @param purchaseOrders Purchase order to add to the system (required)
     * @return PurchaseOrder
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PurchaseOrder addPurchaseOrder(PurchaseOrderInput purchaseOrders) throws ApiException {
        ApiResponse<PurchaseOrder> resp = addPurchaseOrderWithHttpInfo(purchaseOrders);
        return resp.getData();
    }

    /**
     * 
     * Creates a new purchase order in the system
     * @param purchaseOrders Purchase order to add to the system (required)
     * @return ApiResponse&lt;PurchaseOrder&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PurchaseOrder> addPurchaseOrderWithHttpInfo(PurchaseOrderInput purchaseOrders) throws ApiException {
        com.squareup.okhttp.Call call = addPurchaseOrderValidateBeforeCall(purchaseOrders, null, null);
        Type localVarReturnType = new TypeToken<PurchaseOrder>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Creates a new purchase order in the system
     * @param purchaseOrders Purchase order to add to the system (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addPurchaseOrderAsync(PurchaseOrderInput purchaseOrders, final ApiCallback<PurchaseOrder> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = addPurchaseOrderValidateBeforeCall(purchaseOrders, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PurchaseOrder>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for findPurchaseOrderById
     * @param id ID of purchase order to fetch (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call findPurchaseOrderByIdCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/purchase_orders/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "api_key" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call findPurchaseOrderByIdValidateBeforeCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling findPurchaseOrderById(Async)");
        }
        

        com.squareup.okhttp.Call call = findPurchaseOrderByIdCall(id, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Find Purchase order by ID
     * Returns a single purchase order if the user has access
     * @param id ID of purchase order to fetch (required)
     * @return PurchaseOrder
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PurchaseOrder findPurchaseOrderById(Long id) throws ApiException {
        ApiResponse<PurchaseOrder> resp = findPurchaseOrderByIdWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Find Purchase order by ID
     * Returns a single purchase order if the user has access
     * @param id ID of purchase order to fetch (required)
     * @return ApiResponse&lt;PurchaseOrder&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PurchaseOrder> findPurchaseOrderByIdWithHttpInfo(Long id) throws ApiException {
        com.squareup.okhttp.Call call = findPurchaseOrderByIdValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<PurchaseOrder>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Find Purchase order by ID (asynchronously)
     * Returns a single purchase order if the user has access
     * @param id ID of purchase order to fetch (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call findPurchaseOrderByIdAsync(Long id, final ApiCallback<PurchaseOrder> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = findPurchaseOrderByIdValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PurchaseOrder>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for findPurchaseOrders
     * @param tags tags to filter by (optional)
     * @param limit Maximum number of results to return (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call findPurchaseOrdersCall(List<String> tags, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/purchase_orders";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (tags != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("csv", "tags", tags));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "api_key" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call findPurchaseOrdersValidateBeforeCall(List<String> tags, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = findPurchaseOrdersCall(tags, limit, progressListener, progressRequestListener);
        return call;

    }

    /**
     * All purchase order
     * Returns all purchase order from the system that the user has access to
     * @param tags tags to filter by (optional)
     * @param limit Maximum number of results to return (optional)
     * @return List&lt;PurchaseOrder&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<PurchaseOrder> findPurchaseOrders(List<String> tags, Integer limit) throws ApiException {
        ApiResponse<List<PurchaseOrder>> resp = findPurchaseOrdersWithHttpInfo(tags, limit);
        return resp.getData();
    }

    /**
     * All purchase order
     * Returns all purchase order from the system that the user has access to
     * @param tags tags to filter by (optional)
     * @param limit Maximum number of results to return (optional)
     * @return ApiResponse&lt;List&lt;PurchaseOrder&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<PurchaseOrder>> findPurchaseOrdersWithHttpInfo(List<String> tags, Integer limit) throws ApiException {
        com.squareup.okhttp.Call call = findPurchaseOrdersValidateBeforeCall(tags, limit, null, null);
        Type localVarReturnType = new TypeToken<List<PurchaseOrder>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * All purchase order (asynchronously)
     * Returns all purchase order from the system that the user has access to
     * @param tags tags to filter by (optional)
     * @param limit Maximum number of results to return (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call findPurchaseOrdersAsync(List<String> tags, Integer limit, final ApiCallback<List<PurchaseOrder>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = findPurchaseOrdersValidateBeforeCall(tags, limit, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<PurchaseOrder>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}