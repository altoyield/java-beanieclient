# DocumentApi

All URIs are relative to *https://bean.ie*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addDocument**](DocumentApi.md#addDocument) | **POST** /documents | 
[**findDocumentById**](DocumentApi.md#findDocumentById) | **GET** /documents/{id} | Find Document by ID
[**findDocuments**](DocumentApi.md#findDocuments) | **GET** /documents | All document


<a name="addDocument"></a>
# **addDocument**
> Document addDocument(documents)



Creates a new document in the system

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DocumentApi apiInstance = new DocumentApi();
DocumentInput documents = new DocumentInput(); // DocumentInput | Document to add to the system
try {
    Document result = apiInstance.addDocument(documents);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumentApi#addDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **documents** | [**DocumentInput**](DocumentInput.md)| Document to add to the system |

### Return type

[**Document**](Document.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findDocumentById"></a>
# **findDocumentById**
> Document findDocumentById(id)

Find Document by ID

Returns a single document if the user has access

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DocumentApi apiInstance = new DocumentApi();
Long id = 789L; // Long | ID of document to fetch
try {
    Document result = apiInstance.findDocumentById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumentApi#findDocumentById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of document to fetch |

### Return type

[**Document**](Document.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findDocuments"></a>
# **findDocuments**
> List&lt;Document&gt; findDocuments(tags, limit)

All document

Returns all document from the system that the user has access to

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DocumentApi apiInstance = new DocumentApi();
List<String> tags = Arrays.asList("tags_example"); // List<String> | tags to filter by
Integer limit = 56; // Integer | Maximum number of results to return
try {
    List<Document> result = apiInstance.findDocuments(tags, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumentApi#findDocuments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | [**List&lt;String&gt;**](String.md)| tags to filter by | [optional]
 **limit** | **Integer**| Maximum number of results to return | [optional]

### Return type

[**List&lt;Document&gt;**](Document.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

