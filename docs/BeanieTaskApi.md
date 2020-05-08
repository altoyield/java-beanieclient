# BeanieTaskApi

All URIs are relative to *https://bean.ie*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addBeanieTask**](BeanieTaskApi.md#addBeanieTask) | **POST** /beanie_tasks | 
[**findBeanieTaskById**](BeanieTaskApi.md#findBeanieTaskById) | **GET** /beanie_tasks/{id} | Find Beanie task by ID
[**findBeanieTasks**](BeanieTaskApi.md#findBeanieTasks) | **GET** /beanie_tasks | All beanie task


<a name="addBeanieTask"></a>
# **addBeanieTask**
> BeanieTask addBeanieTask(beanieTasks)



Creates a new beanie task in the system

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeanieTaskApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeanieTaskApi apiInstance = new BeanieTaskApi();
BeanieTaskInput beanieTasks = new BeanieTaskInput(); // BeanieTaskInput | Beanie task to add to the system
try {
    BeanieTask result = apiInstance.addBeanieTask(beanieTasks);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeanieTaskApi#addBeanieTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **beanieTasks** | [**BeanieTaskInput**](BeanieTaskInput.md)| Beanie task to add to the system |

### Return type

[**BeanieTask**](BeanieTask.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findBeanieTaskById"></a>
# **findBeanieTaskById**
> BeanieTask findBeanieTaskById(id)

Find Beanie task by ID

Returns a single beanie task if the user has access

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeanieTaskApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeanieTaskApi apiInstance = new BeanieTaskApi();
Long id = 789L; // Long | ID of beanie task to fetch
try {
    BeanieTask result = apiInstance.findBeanieTaskById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeanieTaskApi#findBeanieTaskById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of beanie task to fetch |

### Return type

[**BeanieTask**](BeanieTask.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findBeanieTasks"></a>
# **findBeanieTasks**
> List&lt;BeanieTask&gt; findBeanieTasks(tags, limit)

All beanie task

Returns all beanie task from the system that the user has access to

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeanieTaskApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeanieTaskApi apiInstance = new BeanieTaskApi();
List<String> tags = Arrays.asList("tags_example"); // List<String> | tags to filter by
Integer limit = 56; // Integer | Maximum number of results to return
try {
    List<BeanieTask> result = apiInstance.findBeanieTasks(tags, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeanieTaskApi#findBeanieTasks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | [**List&lt;String&gt;**](String.md)| tags to filter by | [optional]
 **limit** | **Integer**| Maximum number of results to return | [optional]

### Return type

[**List&lt;BeanieTask&gt;**](BeanieTask.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

