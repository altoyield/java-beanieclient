# FixedAssetApi

All URIs are relative to *https://bean.ie*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addFixedAsset**](FixedAssetApi.md#addFixedAsset) | **POST** /fixed_assets | 
[**findFixedAssetById**](FixedAssetApi.md#findFixedAssetById) | **GET** /fixed_assets/{id} | Find Fixed asset by ID
[**findFixedAssets**](FixedAssetApi.md#findFixedAssets) | **GET** /fixed_assets | All fixed asset


<a name="addFixedAsset"></a>
# **addFixedAsset**
> FixedAsset addFixedAsset(fixedAssets)



Creates a new fixed asset in the system

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FixedAssetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FixedAssetApi apiInstance = new FixedAssetApi();
FixedAssetInput fixedAssets = new FixedAssetInput(); // FixedAssetInput | Fixed asset to add to the system
try {
    FixedAsset result = apiInstance.addFixedAsset(fixedAssets);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FixedAssetApi#addFixedAsset");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fixedAssets** | [**FixedAssetInput**](FixedAssetInput.md)| Fixed asset to add to the system |

### Return type

[**FixedAsset**](FixedAsset.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findFixedAssetById"></a>
# **findFixedAssetById**
> FixedAsset findFixedAssetById(id)

Find Fixed asset by ID

Returns a single fixed asset if the user has access

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FixedAssetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FixedAssetApi apiInstance = new FixedAssetApi();
Long id = 789L; // Long | ID of fixed asset to fetch
try {
    FixedAsset result = apiInstance.findFixedAssetById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FixedAssetApi#findFixedAssetById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of fixed asset to fetch |

### Return type

[**FixedAsset**](FixedAsset.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findFixedAssets"></a>
# **findFixedAssets**
> List&lt;FixedAsset&gt; findFixedAssets(tags, limit)

All fixed asset

Returns all fixed asset from the system that the user has access to

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FixedAssetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FixedAssetApi apiInstance = new FixedAssetApi();
List<String> tags = Arrays.asList("tags_example"); // List<String> | tags to filter by
Integer limit = 56; // Integer | Maximum number of results to return
try {
    List<FixedAsset> result = apiInstance.findFixedAssets(tags, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FixedAssetApi#findFixedAssets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | [**List&lt;String&gt;**](String.md)| tags to filter by | [optional]
 **limit** | **Integer**| Maximum number of results to return | [optional]

### Return type

[**List&lt;FixedAsset&gt;**](FixedAsset.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

