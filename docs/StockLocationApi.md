# StockLocationApi

All URIs are relative to *https://bean.ie*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addStockLocation**](StockLocationApi.md#addStockLocation) | **POST** /stock_locations | 
[**findStockLocationById**](StockLocationApi.md#findStockLocationById) | **GET** /stock_locations/{id} | Find Stock location by ID
[**findStockLocations**](StockLocationApi.md#findStockLocations) | **GET** /stock_locations | All stock location


<a name="addStockLocation"></a>
# **addStockLocation**
> StockLocation addStockLocation(stockLocations)



Creates a new stock location in the system

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StockLocationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

StockLocationApi apiInstance = new StockLocationApi();
StockLocationInput stockLocations = new StockLocationInput(); // StockLocationInput | Stock location to add to the system
try {
    StockLocation result = apiInstance.addStockLocation(stockLocations);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StockLocationApi#addStockLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stockLocations** | [**StockLocationInput**](StockLocationInput.md)| Stock location to add to the system |

### Return type

[**StockLocation**](StockLocation.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findStockLocationById"></a>
# **findStockLocationById**
> StockLocation findStockLocationById(id)

Find Stock location by ID

Returns a single stock location if the user has access

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StockLocationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

StockLocationApi apiInstance = new StockLocationApi();
Long id = 789L; // Long | ID of stock location to fetch
try {
    StockLocation result = apiInstance.findStockLocationById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StockLocationApi#findStockLocationById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of stock location to fetch |

### Return type

[**StockLocation**](StockLocation.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findStockLocations"></a>
# **findStockLocations**
> List&lt;StockLocation&gt; findStockLocations(tags, limit)

All stock location

Returns all stock location from the system that the user has access to

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StockLocationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

StockLocationApi apiInstance = new StockLocationApi();
List<String> tags = Arrays.asList("tags_example"); // List<String> | tags to filter by
Integer limit = 56; // Integer | Maximum number of results to return
try {
    List<StockLocation> result = apiInstance.findStockLocations(tags, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StockLocationApi#findStockLocations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | [**List&lt;String&gt;**](String.md)| tags to filter by | [optional]
 **limit** | **Integer**| Maximum number of results to return | [optional]

### Return type

[**List&lt;StockLocation&gt;**](StockLocation.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

