# ProductionOrderApi

All URIs are relative to *https://bean.ie*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addProductionOrder**](ProductionOrderApi.md#addProductionOrder) | **POST** /production_orders | 
[**findProductionOrderById**](ProductionOrderApi.md#findProductionOrderById) | **GET** /production_orders/{id} | Find Production order by ID
[**findProductionOrders**](ProductionOrderApi.md#findProductionOrders) | **GET** /production_orders | All production order


<a name="addProductionOrder"></a>
# **addProductionOrder**
> ProductionOrder addProductionOrder(productionOrders)



Creates a new production order in the system

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductionOrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ProductionOrderApi apiInstance = new ProductionOrderApi();
ProductionOrderInput productionOrders = new ProductionOrderInput(); // ProductionOrderInput | Production order to add to the system
try {
    ProductionOrder result = apiInstance.addProductionOrder(productionOrders);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductionOrderApi#addProductionOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productionOrders** | [**ProductionOrderInput**](ProductionOrderInput.md)| Production order to add to the system |

### Return type

[**ProductionOrder**](ProductionOrder.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findProductionOrderById"></a>
# **findProductionOrderById**
> ProductionOrder findProductionOrderById(id)

Find Production order by ID

Returns a single production order if the user has access

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductionOrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ProductionOrderApi apiInstance = new ProductionOrderApi();
Long id = 789L; // Long | ID of production order to fetch
try {
    ProductionOrder result = apiInstance.findProductionOrderById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductionOrderApi#findProductionOrderById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of production order to fetch |

### Return type

[**ProductionOrder**](ProductionOrder.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findProductionOrders"></a>
# **findProductionOrders**
> List&lt;ProductionOrder&gt; findProductionOrders(tags, limit)

All production order

Returns all production order from the system that the user has access to

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductionOrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ProductionOrderApi apiInstance = new ProductionOrderApi();
List<String> tags = Arrays.asList("tags_example"); // List<String> | tags to filter by
Integer limit = 56; // Integer | Maximum number of results to return
try {
    List<ProductionOrder> result = apiInstance.findProductionOrders(tags, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductionOrderApi#findProductionOrders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | [**List&lt;String&gt;**](String.md)| tags to filter by | [optional]
 **limit** | **Integer**| Maximum number of results to return | [optional]

### Return type

[**List&lt;ProductionOrder&gt;**](ProductionOrder.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

