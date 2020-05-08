# WorkCentreApi

All URIs are relative to *https://bean.ie*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findWorkCentreById**](WorkCentreApi.md#findWorkCentreById) | **GET** /work_centres/{id} | Find Work centre by ID
[**findWorkCentres**](WorkCentreApi.md#findWorkCentres) | **GET** /work_centre_groups/{work_centre_group_id}/work_centres | All work centre


<a name="findWorkCentreById"></a>
# **findWorkCentreById**
> WorkCentre findWorkCentreById(id)

Find Work centre by ID

Returns a single work centre if the user has access

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WorkCentreApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WorkCentreApi apiInstance = new WorkCentreApi();
Long id = 789L; // Long | ID of work centre to fetch
try {
    WorkCentre result = apiInstance.findWorkCentreById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkCentreApi#findWorkCentreById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of work centre to fetch |

### Return type

[**WorkCentre**](WorkCentre.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findWorkCentres"></a>
# **findWorkCentres**
> List&lt;WorkCentre&gt; findWorkCentres(workCentreGroupId, tags, limit)

All work centre

Returns all work centre from the system that the user has access to

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WorkCentreApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WorkCentreApi apiInstance = new WorkCentreApi();
Long workCentreGroupId = 789L; // Long | ID of Work Centre Group for list of Work Centres
List<String> tags = Arrays.asList("tags_example"); // List<String> | tags to filter by
Integer limit = 56; // Integer | Maximum number of results to return
try {
    List<WorkCentre> result = apiInstance.findWorkCentres(workCentreGroupId, tags, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkCentreApi#findWorkCentres");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workCentreGroupId** | **Long**| ID of Work Centre Group for list of Work Centres |
 **tags** | [**List&lt;String&gt;**](String.md)| tags to filter by | [optional]
 **limit** | **Integer**| Maximum number of results to return | [optional]

### Return type

[**List&lt;WorkCentre&gt;**](WorkCentre.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

