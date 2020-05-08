# StockItemApi

All URIs are relative to *https://bean.ie*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addStockItem**](StockItemApi.md#addStockItem) | **POST** /stock_items | 
[**findStockItemById**](StockItemApi.md#findStockItemById) | **GET** /stock_items/{id} | Find Stock item by ID
[**findStockItems**](StockItemApi.md#findStockItems) | **GET** /stock_items | All stock item


<a name="addStockItem"></a>
# **addStockItem**
> StockItem addStockItem(stockItems)



Creates a new stock item in the system

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StockItemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

StockItemApi apiInstance = new StockItemApi();
StockItemInput stockItems = new StockItemInput(); // StockItemInput | Stock item to add to the system
try {
    StockItem result = apiInstance.addStockItem(stockItems);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StockItemApi#addStockItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stockItems** | [**StockItemInput**](StockItemInput.md)| Stock item to add to the system |

### Return type

[**StockItem**](StockItem.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findStockItemById"></a>
# **findStockItemById**
> StockItem findStockItemById(id)

Find Stock item by ID

Returns a single stock item if the user has access

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StockItemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

StockItemApi apiInstance = new StockItemApi();
Long id = 789L; // Long | ID of stock item to fetch
try {
    StockItem result = apiInstance.findStockItemById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StockItemApi#findStockItemById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of stock item to fetch |

### Return type

[**StockItem**](StockItem.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findStockItems"></a>
# **findStockItems**
> List&lt;StockItem&gt; findStockItems(tags, limit)

All stock item

Returns all stock item from the system that the user has access to

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StockItemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

StockItemApi apiInstance = new StockItemApi();
List<String> tags = Arrays.asList("tags_example"); // List<String> | tags to filter by
Integer limit = 56; // Integer | Maximum number of results to return
try {
    List<StockItem> result = apiInstance.findStockItems(tags, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StockItemApi#findStockItems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | [**List&lt;String&gt;**](String.md)| tags to filter by | [optional]
 **limit** | **Integer**| Maximum number of results to return | [optional]

### Return type

[**List&lt;StockItem&gt;**](StockItem.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

