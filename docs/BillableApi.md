# BillableApi

All URIs are relative to *https://bean.ie*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addBillable**](BillableApi.md#addBillable) | **POST** /billables | 
[**findBillableById**](BillableApi.md#findBillableById) | **GET** /billables/{id} | Find Billable record by ID
[**findBillables**](BillableApi.md#findBillables) | **GET** /billables | All billable record


<a name="addBillable"></a>
# **addBillable**
> Billable addBillable(billables)



Creates a new billable record in the system

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BillableApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BillableApi apiInstance = new BillableApi();
BillableInput billables = new BillableInput(); // BillableInput | Billable record to add to the system
try {
    Billable result = apiInstance.addBillable(billables);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillableApi#addBillable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **billables** | [**BillableInput**](BillableInput.md)| Billable record to add to the system |

### Return type

[**Billable**](Billable.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findBillableById"></a>
# **findBillableById**
> Billable findBillableById(id)

Find Billable record by ID

Returns a single billable record if the user has access

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BillableApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BillableApi apiInstance = new BillableApi();
Long id = 789L; // Long | ID of billable record to fetch
try {
    Billable result = apiInstance.findBillableById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillableApi#findBillableById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of billable record to fetch |

### Return type

[**Billable**](Billable.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findBillables"></a>
# **findBillables**
> List&lt;Billable&gt; findBillables(tags, limit)

All billable record

Returns all billable record from the system that the user has access to

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BillableApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BillableApi apiInstance = new BillableApi();
List<String> tags = Arrays.asList("tags_example"); // List<String> | tags to filter by
Integer limit = 56; // Integer | Maximum number of results to return
try {
    List<Billable> result = apiInstance.findBillables(tags, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillableApi#findBillables");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | [**List&lt;String&gt;**](String.md)| tags to filter by | [optional]
 **limit** | **Integer**| Maximum number of results to return | [optional]

### Return type

[**List&lt;Billable&gt;**](Billable.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

