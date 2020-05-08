# SalesOrderApi

All URIs are relative to *https://bean.ie*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addSalesOrder**](SalesOrderApi.md#addSalesOrder) | **POST** /sales_orders | 
[**findSalesOrder**](SalesOrderApi.md#findSalesOrder) | **GET** /sales_orders | All sales order
[**findSalesOrderById**](SalesOrderApi.md#findSalesOrderById) | **GET** /sales_orders/{id} | Find Sales order by ID


<a name="addSalesOrder"></a>
# **addSalesOrder**
> SalesOrder addSalesOrder(salesOrders)



Creates a new sales order in the system

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SalesOrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SalesOrderApi apiInstance = new SalesOrderApi();
SalesOrderInput salesOrders = new SalesOrderInput(); // SalesOrderInput | Sales order to add to the system
try {
    SalesOrder result = apiInstance.addSalesOrder(salesOrders);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SalesOrderApi#addSalesOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **salesOrders** | [**SalesOrderInput**](SalesOrderInput.md)| Sales order to add to the system |

### Return type

[**SalesOrder**](SalesOrder.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findSalesOrder"></a>
# **findSalesOrder**
> List&lt;SalesOrder&gt; findSalesOrder(tags, limit)

All sales order

Returns all sales order from the system that the user has access to

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SalesOrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SalesOrderApi apiInstance = new SalesOrderApi();
List<String> tags = Arrays.asList("tags_example"); // List<String> | tags to filter by
Integer limit = 56; // Integer | Maximum number of results to return
try {
    List<SalesOrder> result = apiInstance.findSalesOrder(tags, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SalesOrderApi#findSalesOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | [**List&lt;String&gt;**](String.md)| tags to filter by | [optional]
 **limit** | **Integer**| Maximum number of results to return | [optional]

### Return type

[**List&lt;SalesOrder&gt;**](SalesOrder.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findSalesOrderById"></a>
# **findSalesOrderById**
> SalesOrder findSalesOrderById(id)

Find Sales order by ID

Returns a single sales order if the user has access

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SalesOrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SalesOrderApi apiInstance = new SalesOrderApi();
Long id = 789L; // Long | ID of sales order to fetch
try {
    SalesOrder result = apiInstance.findSalesOrderById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SalesOrderApi#findSalesOrderById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of sales order to fetch |

### Return type

[**SalesOrder**](SalesOrder.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

