# StockSupplierApi

All URIs are relative to *https://bean.ie*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addStockSupplier**](StockSupplierApi.md#addStockSupplier) | **POST** /stock_suppliers | 
[**findStockSupplierById**](StockSupplierApi.md#findStockSupplierById) | **GET** /stock_suppliers/{id} | Find Stock supplier by ID
[**findStockSuppliers**](StockSupplierApi.md#findStockSuppliers) | **GET** /stock_suppliers | All stock supplier


<a name="addStockSupplier"></a>
# **addStockSupplier**
> StockSupplier addStockSupplier(stockSuppliers)



Creates a new stock supplier in the system

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StockSupplierApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

StockSupplierApi apiInstance = new StockSupplierApi();
StockSupplierInput stockSuppliers = new StockSupplierInput(); // StockSupplierInput | Stock supplier to add to the system
try {
    StockSupplier result = apiInstance.addStockSupplier(stockSuppliers);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StockSupplierApi#addStockSupplier");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stockSuppliers** | [**StockSupplierInput**](StockSupplierInput.md)| Stock supplier to add to the system |

### Return type

[**StockSupplier**](StockSupplier.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findStockSupplierById"></a>
# **findStockSupplierById**
> StockSupplier findStockSupplierById(id)

Find Stock supplier by ID

Returns a single stock supplier if the user has access

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StockSupplierApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

StockSupplierApi apiInstance = new StockSupplierApi();
Long id = 789L; // Long | ID of stock supplier to fetch
try {
    StockSupplier result = apiInstance.findStockSupplierById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StockSupplierApi#findStockSupplierById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of stock supplier to fetch |

### Return type

[**StockSupplier**](StockSupplier.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findStockSuppliers"></a>
# **findStockSuppliers**
> List&lt;StockSupplier&gt; findStockSuppliers(tags, limit)

All stock supplier

Returns all stock supplier from the system that the user has access to

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StockSupplierApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

StockSupplierApi apiInstance = new StockSupplierApi();
List<String> tags = Arrays.asList("tags_example"); // List<String> | tags to filter by
Integer limit = 56; // Integer | Maximum number of results to return
try {
    List<StockSupplier> result = apiInstance.findStockSuppliers(tags, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StockSupplierApi#findStockSuppliers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | [**List&lt;String&gt;**](String.md)| tags to filter by | [optional]
 **limit** | **Integer**| Maximum number of results to return | [optional]

### Return type

[**List&lt;StockSupplier&gt;**](StockSupplier.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

