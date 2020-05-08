/*
 * Beanie ERP API
 * An API specification for interacting with the Beanie ERP system
 *
 * OpenAPI spec version: 0.8
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


import io.swagger.client.model.BankAccount;
import io.swagger.client.model.BankAccountInput;
import io.swagger.client.model.ErrorModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankAccountApi {
    private ApiClient apiClient;

    public BankAccountApi() {
        this(Configuration.getDefaultApiClient());
    }

    public BankAccountApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for addBankAccount
     * @param bankAccount Bank account to add to the system (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addBankAccountCall(BankAccountInput bankAccount, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = bankAccount;

        // create path and map variables
        String localVarPath = "/bank_accounts";

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
    private com.squareup.okhttp.Call addBankAccountValidateBeforeCall(BankAccountInput bankAccount, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'bankAccount' is set
        if (bankAccount == null) {
            throw new ApiException("Missing the required parameter 'bankAccount' when calling addBankAccount(Async)");
        }
        

        com.squareup.okhttp.Call call = addBankAccountCall(bankAccount, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * Creates a new bank account in the system
     * @param bankAccount Bank account to add to the system (required)
     * @return BankAccount
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public BankAccount addBankAccount(BankAccountInput bankAccount) throws ApiException {
        ApiResponse<BankAccount> resp = addBankAccountWithHttpInfo(bankAccount);
        return resp.getData();
    }

    /**
     * 
     * Creates a new bank account in the system
     * @param bankAccount Bank account to add to the system (required)
     * @return ApiResponse&lt;BankAccount&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BankAccount> addBankAccountWithHttpInfo(BankAccountInput bankAccount) throws ApiException {
        com.squareup.okhttp.Call call = addBankAccountValidateBeforeCall(bankAccount, null, null);
        Type localVarReturnType = new TypeToken<BankAccount>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Creates a new bank account in the system
     * @param bankAccount Bank account to add to the system (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addBankAccountAsync(BankAccountInput bankAccount, final ApiCallback<BankAccount> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addBankAccountValidateBeforeCall(bankAccount, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<BankAccount>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for findBankAccountById
     * @param id ID of bank account to fetch (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call findBankAccountByIdCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/bank_accounts/{id}"
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
    private com.squareup.okhttp.Call findBankAccountByIdValidateBeforeCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling findBankAccountById(Async)");
        }
        

        com.squareup.okhttp.Call call = findBankAccountByIdCall(id, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Find Bank Account by ID
     * Returns a single bank account if the user has access
     * @param id ID of bank account to fetch (required)
     * @return BankAccount
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public BankAccount findBankAccountById(Long id) throws ApiException {
        ApiResponse<BankAccount> resp = findBankAccountByIdWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Find Bank Account by ID
     * Returns a single bank account if the user has access
     * @param id ID of bank account to fetch (required)
     * @return ApiResponse&lt;BankAccount&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BankAccount> findBankAccountByIdWithHttpInfo(Long id) throws ApiException {
        com.squareup.okhttp.Call call = findBankAccountByIdValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<BankAccount>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Find Bank Account by ID (asynchronously)
     * Returns a single bank account if the user has access
     * @param id ID of bank account to fetch (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call findBankAccountByIdAsync(Long id, final ApiCallback<BankAccount> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = findBankAccountByIdValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<BankAccount>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for findBankAccounts
     * @param tags tags to filter by (optional)
     * @param limit maximum number of results to return (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call findBankAccountsCall(List<String> tags, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/bank_accounts";

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
    private com.squareup.okhttp.Call findBankAccountsValidateBeforeCall(List<String> tags, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = findBankAccountsCall(tags, limit, progressListener, progressRequestListener);
        return call;

    }

    /**
     * All bank accounts
     * Returns all bank accounts from the system that the user has access to
     * @param tags tags to filter by (optional)
     * @param limit maximum number of results to return (optional)
     * @return List&lt;BankAccount&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<BankAccount> findBankAccounts(List<String> tags, Integer limit) throws ApiException {
        ApiResponse<List<BankAccount>> resp = findBankAccountsWithHttpInfo(tags, limit);
        return resp.getData();
    }

    /**
     * All bank accounts
     * Returns all bank accounts from the system that the user has access to
     * @param tags tags to filter by (optional)
     * @param limit maximum number of results to return (optional)
     * @return ApiResponse&lt;List&lt;BankAccount&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<BankAccount>> findBankAccountsWithHttpInfo(List<String> tags, Integer limit) throws ApiException {
        com.squareup.okhttp.Call call = findBankAccountsValidateBeforeCall(tags, limit, null, null);
        Type localVarReturnType = new TypeToken<List<BankAccount>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * All bank accounts (asynchronously)
     * Returns all bank accounts from the system that the user has access to
     * @param tags tags to filter by (optional)
     * @param limit maximum number of results to return (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call findBankAccountsAsync(List<String> tags, Integer limit, final ApiCallback<List<BankAccount>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = findBankAccountsValidateBeforeCall(tags, limit, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<BankAccount>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
