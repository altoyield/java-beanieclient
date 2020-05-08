# StockCategoryApi

All URIs are relative to *https://bean.ie*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addStockCategory**](StockCategoryApi.md#addStockCategory) | **POST** /stock_categories | 
[**findStockCategories**](StockCategoryApi.md#findStockCategories) | **GET** /stock_categories | All stock category
[**findStockCategoryById**](StockCategoryApi.md#findStockCategoryById) | **GET** /stock_categories/{id} | Find Stock category by ID


<a name="addStockCategory"></a>
# **addStockCategory**
> StockCategory addStockCategory(stockCategories)



Creates a new stock category in the system

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StockCategoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

StockCategoryApi apiInstance = new StockCategoryApi();
StockCategoryInput stockCategories = new StockCategoryInput(); // StockCategoryInput | Stock category to add to the system
try {
    StockCategory result = apiInstance.addStockCategory(stockCategories);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StockCategoryApi#addStockCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stockCategories** | [**StockCategoryInput**](StockCategoryInput.md)| Stock category to add to the system |

### Return type

[**StockCategory**](StockCategory.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findStockCategories"></a>
# **findStockCategories**
> List&lt;StockCategory&gt; findStockCategories(tags, limit)

All stock category

Returns all stock category from the system that the user has access to

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StockCategoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

StockCategoryApi apiInstance = new StockCategoryApi();
List<String> tags = Arrays.asList("tags_example"); // List<String> | tags to filter by
Integer limit = 56; // Integer | Maximum number of results to return
try {
    List<StockCategory> result = apiInstance.findStockCategories(tags, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StockCategoryApi#findStockCategories");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | [**List&lt;String&gt;**](String.md)| tags to filter by | [optional]
 **limit** | **Integer**| Maximum number of results to return | [optional]

### Return type

[**List&lt;StockCategory&gt;**](StockCategory.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findStockCategoryById"></a>
# **findStockCategoryById**
> StockCategory findStockCategoryById(id)

Find Stock category by ID

Returns a single stock category if the user has access

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StockCategoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

StockCategoryApi apiInstance = new StockCategoryApi();
Long id = 789L; // Long | ID of stock category to fetch
try {
    StockCategory result = apiInstance.findStockCategoryById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StockCategoryApi#findStockCategoryById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of stock category to fetch |

### Return type

[**StockCategory**](StockCategory.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

