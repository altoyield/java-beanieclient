# WorkCentreGroupApi

All URIs are relative to *https://bean.ie*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findWorkCentreGroupById**](WorkCentreGroupApi.md#findWorkCentreGroupById) | **GET** /work_centre_groups/{id} | Find Work centre group by ID
[**findWorkCentreGroups**](WorkCentreGroupApi.md#findWorkCentreGroups) | **GET** /work_centre_groups | All work centre group


<a name="findWorkCentreGroupById"></a>
# **findWorkCentreGroupById**
> WorkCentreGroup findWorkCentreGroupById(id)

Find Work centre group by ID

Returns a single work centre group if the user has access

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WorkCentreGroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WorkCentreGroupApi apiInstance = new WorkCentreGroupApi();
Long id = 789L; // Long | ID of work centre group to fetch
try {
    WorkCentreGroup result = apiInstance.findWorkCentreGroupById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkCentreGroupApi#findWorkCentreGroupById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of work centre group to fetch |

### Return type

[**WorkCentreGroup**](WorkCentreGroup.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findWorkCentreGroups"></a>
# **findWorkCentreGroups**
> List&lt;WorkCentreGroup&gt; findWorkCentreGroups(tags, limit)

All work centre group

Returns all work centre group from the system that the user has access to

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WorkCentreGroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WorkCentreGroupApi apiInstance = new WorkCentreGroupApi();
List<String> tags = Arrays.asList("tags_example"); // List<String> | tags to filter by
Integer limit = 56; // Integer | Maximum number of results to return
try {
    List<WorkCentreGroup> result = apiInstance.findWorkCentreGroups(tags, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkCentreGroupApi#findWorkCentreGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | [**List&lt;String&gt;**](String.md)| tags to filter by | [optional]
 **limit** | **Integer**| Maximum number of results to return | [optional]

### Return type

[**List&lt;WorkCentreGroup&gt;**](WorkCentreGroup.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

