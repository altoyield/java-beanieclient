# StockAdjustmentApi

All URIs are relative to *https://bean.ie*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addStockAdjustment**](StockAdjustmentApi.md#addStockAdjustment) | **POST** /stock_adjustments | 
[**findStockAdjustmentById**](StockAdjustmentApi.md#findStockAdjustmentById) | **GET** /stock_adjustments/{id} | Find Stock adjustment by ID
[**findStockAdjustments**](StockAdjustmentApi.md#findStockAdjustments) | **GET** /stock_adjustments | All stock adjustment


<a name="addStockAdjustment"></a>
# **addStockAdjustment**
> StockAdjustment addStockAdjustment(stockAdjustments)



Creates a new stock adjustment in the system

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StockAdjustmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

StockAdjustmentApi apiInstance = new StockAdjustmentApi();
StockAdjustmentInput stockAdjustments = new StockAdjustmentInput(); // StockAdjustmentInput | Stock adjustment to add to the system
try {
    StockAdjustment result = apiInstance.addStockAdjustment(stockAdjustments);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StockAdjustmentApi#addStockAdjustment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stockAdjustments** | [**StockAdjustmentInput**](StockAdjustmentInput.md)| Stock adjustment to add to the system |

### Return type

[**StockAdjustment**](StockAdjustment.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findStockAdjustmentById"></a>
# **findStockAdjustmentById**
> StockAdjustment findStockAdjustmentById(id)

Find Stock adjustment by ID

Returns a single stock adjustment if the user has access

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StockAdjustmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

StockAdjustmentApi apiInstance = new StockAdjustmentApi();
Long id = 789L; // Long | ID of stock adjustment to fetch
try {
    StockAdjustment result = apiInstance.findStockAdjustmentById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StockAdjustmentApi#findStockAdjustmentById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of stock adjustment to fetch |

### Return type

[**StockAdjustment**](StockAdjustment.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findStockAdjustments"></a>
# **findStockAdjustments**
> List&lt;StockAdjustment&gt; findStockAdjustments(tags, limit)

All stock adjustment

Returns all stock adjustment from the system that the user has access to

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StockAdjustmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

StockAdjustmentApi apiInstance = new StockAdjustmentApi();
List<String> tags = Arrays.asList("tags_example"); // List<String> | tags to filter by
Integer limit = 56; // Integer | Maximum number of results to return
try {
    List<StockAdjustment> result = apiInstance.findStockAdjustments(tags, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StockAdjustmentApi#findStockAdjustments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | [**List&lt;String&gt;**](String.md)| tags to filter by | [optional]
 **limit** | **Integer**| Maximum number of results to return | [optional]

### Return type

[**List&lt;StockAdjustment&gt;**](StockAdjustment.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

