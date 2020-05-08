# PurchaseOrderApi

All URIs are relative to *https://bean.ie*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addPurchaseOrder**](PurchaseOrderApi.md#addPurchaseOrder) | **POST** /purchase_orders | 
[**findPurchaseOrderById**](PurchaseOrderApi.md#findPurchaseOrderById) | **GET** /purchase_orders/{id} | Find Purchase order by ID
[**findPurchaseOrders**](PurchaseOrderApi.md#findPurchaseOrders) | **GET** /purchase_orders | All purchase order


<a name="addPurchaseOrder"></a>
# **addPurchaseOrder**
> PurchaseOrder addPurchaseOrder(purchaseOrders)



Creates a new purchase order in the system

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PurchaseOrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PurchaseOrderApi apiInstance = new PurchaseOrderApi();
PurchaseOrderInput purchaseOrders = new PurchaseOrderInput(); // PurchaseOrderInput | Purchase order to add to the system
try {
    PurchaseOrder result = apiInstance.addPurchaseOrder(purchaseOrders);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PurchaseOrderApi#addPurchaseOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **purchaseOrders** | [**PurchaseOrderInput**](PurchaseOrderInput.md)| Purchase order to add to the system |

### Return type

[**PurchaseOrder**](PurchaseOrder.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findPurchaseOrderById"></a>
# **findPurchaseOrderById**
> PurchaseOrder findPurchaseOrderById(id)

Find Purchase order by ID

Returns a single purchase order if the user has access

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PurchaseOrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PurchaseOrderApi apiInstance = new PurchaseOrderApi();
Long id = 789L; // Long | ID of purchase order to fetch
try {
    PurchaseOrder result = apiInstance.findPurchaseOrderById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PurchaseOrderApi#findPurchaseOrderById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of purchase order to fetch |

### Return type

[**PurchaseOrder**](PurchaseOrder.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findPurchaseOrders"></a>
# **findPurchaseOrders**
> List&lt;PurchaseOrder&gt; findPurchaseOrders(tags, limit)

All purchase order

Returns all purchase order from the system that the user has access to

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PurchaseOrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PurchaseOrderApi apiInstance = new PurchaseOrderApi();
List<String> tags = Arrays.asList("tags_example"); // List<String> | tags to filter by
Integer limit = 56; // Integer | Maximum number of results to return
try {
    List<PurchaseOrder> result = apiInstance.findPurchaseOrders(tags, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PurchaseOrderApi#findPurchaseOrders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | [**List&lt;String&gt;**](String.md)| tags to filter by | [optional]
 **limit** | **Integer**| Maximum number of results to return | [optional]

### Return type

[**List&lt;PurchaseOrder&gt;**](PurchaseOrder.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

