# VatRecordApi

All URIs are relative to *https://bean.ie*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addVatRecord**](VatRecordApi.md#addVatRecord) | **POST** /vat_records | 
[**findVatRecordById**](VatRecordApi.md#findVatRecordById) | **GET** /vat_records/{id} | Find VAT record by ID
[**findVatRecords**](VatRecordApi.md#findVatRecords) | **GET** /vat_records | All vat record


<a name="addVatRecord"></a>
# **addVatRecord**
> VatRecord addVatRecord(vatRecords)



Creates a new vat record in the system

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.VatRecordApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VatRecordApi apiInstance = new VatRecordApi();
VatRecordInput vatRecords = new VatRecordInput(); // VatRecordInput | VAT record to add to the system
try {
    VatRecord result = apiInstance.addVatRecord(vatRecords);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VatRecordApi#addVatRecord");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vatRecords** | [**VatRecordInput**](VatRecordInput.md)| VAT record to add to the system |

### Return type

[**VatRecord**](VatRecord.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findVatRecordById"></a>
# **findVatRecordById**
> VatRecord findVatRecordById(id)

Find VAT record by ID

Returns a single vat record if the user has access

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.VatRecordApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VatRecordApi apiInstance = new VatRecordApi();
Long id = 789L; // Long | ID of vat record to fetch
try {
    VatRecord result = apiInstance.findVatRecordById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VatRecordApi#findVatRecordById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of vat record to fetch |

### Return type

[**VatRecord**](VatRecord.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findVatRecords"></a>
# **findVatRecords**
> List&lt;VatRecord&gt; findVatRecords(tags, limit)

All vat record

Returns all vat record from the system that the user has access to

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.VatRecordApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VatRecordApi apiInstance = new VatRecordApi();
List<String> tags = Arrays.asList("tags_example"); // List<String> | tags to filter by
Integer limit = 56; // Integer | Maximum number of results to return
try {
    List<VatRecord> result = apiInstance.findVatRecords(tags, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VatRecordApi#findVatRecords");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | [**List&lt;String&gt;**](String.md)| tags to filter by | [optional]
 **limit** | **Integer**| Maximum number of results to return | [optional]

### Return type

[**List&lt;VatRecord&gt;**](VatRecord.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

