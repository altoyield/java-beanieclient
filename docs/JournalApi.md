# JournalApi

All URIs are relative to *https://bean.ie*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addJournal**](JournalApi.md#addJournal) | **POST** /journals | 
[**findJournalById**](JournalApi.md#findJournalById) | **GET** /journals/{id} | Find Journal by ID
[**findJournals**](JournalApi.md#findJournals) | **GET** /journals | All journal


<a name="addJournal"></a>
# **addJournal**
> Journal addJournal(journals)



Creates a new journal in the system

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.JournalApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JournalApi apiInstance = new JournalApi();
JournalInput journals = new JournalInput(); // JournalInput | Journal to add to the system
try {
    Journal result = apiInstance.addJournal(journals);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JournalApi#addJournal");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **journals** | [**JournalInput**](JournalInput.md)| Journal to add to the system |

### Return type

[**Journal**](Journal.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findJournalById"></a>
# **findJournalById**
> Journal findJournalById(id)

Find Journal by ID

Returns a single journal if the user has access

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.JournalApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JournalApi apiInstance = new JournalApi();
Long id = 789L; // Long | ID of journal to fetch
try {
    Journal result = apiInstance.findJournalById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JournalApi#findJournalById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of journal to fetch |

### Return type

[**Journal**](Journal.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findJournals"></a>
# **findJournals**
> List&lt;Journal&gt; findJournals(tags, limit)

All journal

Returns all journal from the system that the user has access to

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.JournalApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JournalApi apiInstance = new JournalApi();
List<String> tags = Arrays.asList("tags_example"); // List<String> | tags to filter by
Integer limit = 56; // Integer | Maximum number of results to return
try {
    List<Journal> result = apiInstance.findJournals(tags, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JournalApi#findJournals");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | [**List&lt;String&gt;**](String.md)| tags to filter by | [optional]
 **limit** | **Integer**| Maximum number of results to return | [optional]

### Return type

[**List&lt;Journal&gt;**](Journal.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

