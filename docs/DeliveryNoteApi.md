# DeliveryNoteApi

All URIs are relative to *https://bean.ie*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addDeliveryNote**](DeliveryNoteApi.md#addDeliveryNote) | **POST** /delivery_notes | 
[**findDeliveryNoteById**](DeliveryNoteApi.md#findDeliveryNoteById) | **GET** /delivery_notes/{id} | Find Delivery note by ID
[**findDeliveryNotes**](DeliveryNoteApi.md#findDeliveryNotes) | **GET** /delivery_notes | All delivery note


<a name="addDeliveryNote"></a>
# **addDeliveryNote**
> DeliveryNote addDeliveryNote(deliveryNotes)



Creates a new delivery note in the system

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeliveryNoteApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DeliveryNoteApi apiInstance = new DeliveryNoteApi();
DeliveryNoteInput deliveryNotes = new DeliveryNoteInput(); // DeliveryNoteInput | Delivery note to add to the system
try {
    DeliveryNote result = apiInstance.addDeliveryNote(deliveryNotes);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryNoteApi#addDeliveryNote");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deliveryNotes** | [**DeliveryNoteInput**](DeliveryNoteInput.md)| Delivery note to add to the system |

### Return type

[**DeliveryNote**](DeliveryNote.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findDeliveryNoteById"></a>
# **findDeliveryNoteById**
> DeliveryNote findDeliveryNoteById(id)

Find Delivery note by ID

Returns a single delivery note if the user has access

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeliveryNoteApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DeliveryNoteApi apiInstance = new DeliveryNoteApi();
Long id = 789L; // Long | ID of delivery note to fetch
try {
    DeliveryNote result = apiInstance.findDeliveryNoteById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryNoteApi#findDeliveryNoteById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of delivery note to fetch |

### Return type

[**DeliveryNote**](DeliveryNote.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findDeliveryNotes"></a>
# **findDeliveryNotes**
> List&lt;DeliveryNote&gt; findDeliveryNotes(tags, limit)

All delivery note

Returns all delivery note from the system that the user has access to

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeliveryNoteApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DeliveryNoteApi apiInstance = new DeliveryNoteApi();
List<String> tags = Arrays.asList("tags_example"); // List<String> | tags to filter by
Integer limit = 56; // Integer | Maximum number of results to return
try {
    List<DeliveryNote> result = apiInstance.findDeliveryNotes(tags, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryNoteApi#findDeliveryNotes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | [**List&lt;String&gt;**](String.md)| tags to filter by | [optional]
 **limit** | **Integer**| Maximum number of results to return | [optional]

### Return type

[**List&lt;DeliveryNote&gt;**](DeliveryNote.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

