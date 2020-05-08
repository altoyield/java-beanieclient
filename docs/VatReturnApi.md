# VatReturnApi

All URIs are relative to *https://bean.ie*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addVatReturn**](VatReturnApi.md#addVatReturn) | **POST** /vat_returns | 
[**findVatReturnById**](VatReturnApi.md#findVatReturnById) | **GET** /vat_returns/{id} | Find VAT return by ID
[**findVatReturns**](VatReturnApi.md#findVatReturns) | **GET** /vat_returns | All vat return


<a name="addVatReturn"></a>
# **addVatReturn**
> VatReturn addVatReturn(vatReturns)



Creates a new vat return in the system

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.VatReturnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VatReturnApi apiInstance = new VatReturnApi();
VatReturnInput vatReturns = new VatReturnInput(); // VatReturnInput | VAT return to add to the system
try {
    VatReturn result = apiInstance.addVatReturn(vatReturns);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VatReturnApi#addVatReturn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vatReturns** | [**VatReturnInput**](VatReturnInput.md)| VAT return to add to the system |

### Return type

[**VatReturn**](VatReturn.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findVatReturnById"></a>
# **findVatReturnById**
> VatReturn findVatReturnById(id)

Find VAT return by ID

Returns a single vat return if the user has access

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.VatReturnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VatReturnApi apiInstance = new VatReturnApi();
Long id = 789L; // Long | ID of vat return to fetch
try {
    VatReturn result = apiInstance.findVatReturnById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VatReturnApi#findVatReturnById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of vat return to fetch |

### Return type

[**VatReturn**](VatReturn.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findVatReturns"></a>
# **findVatReturns**
> List&lt;VatReturn&gt; findVatReturns(tags, limit)

All vat return

Returns all vat return from the system that the user has access to

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.VatReturnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

VatReturnApi apiInstance = new VatReturnApi();
List<String> tags = Arrays.asList("tags_example"); // List<String> | tags to filter by
Integer limit = 56; // Integer | Maximum number of results to return
try {
    List<VatReturn> result = apiInstance.findVatReturns(tags, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VatReturnApi#findVatReturns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | [**List&lt;String&gt;**](String.md)| tags to filter by | [optional]
 **limit** | **Integer**| Maximum number of results to return | [optional]

### Return type

[**List&lt;VatReturn&gt;**](VatReturn.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

