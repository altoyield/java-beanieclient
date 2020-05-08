# PartnerAddressApi

All URIs are relative to *https://bean.ie*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addPartnerAddress**](PartnerAddressApi.md#addPartnerAddress) | **POST** /partner_addresses | 
[**findPartnerAddressById**](PartnerAddressApi.md#findPartnerAddressById) | **GET** /partner_addresses/{id} | Find Partner address by ID
[**findPartnerAddresses**](PartnerAddressApi.md#findPartnerAddresses) | **GET** /partner_addresses | All partner address


<a name="addPartnerAddress"></a>
# **addPartnerAddress**
> PartnerAddress addPartnerAddress(partnerAddresses)



Creates a new partner address in the system

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PartnerAddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PartnerAddressApi apiInstance = new PartnerAddressApi();
PartnerAddressInput partnerAddresses = new PartnerAddressInput(); // PartnerAddressInput | Partner address to add to the system
try {
    PartnerAddress result = apiInstance.addPartnerAddress(partnerAddresses);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerAddressApi#addPartnerAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **partnerAddresses** | [**PartnerAddressInput**](PartnerAddressInput.md)| Partner address to add to the system |

### Return type

[**PartnerAddress**](PartnerAddress.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findPartnerAddressById"></a>
# **findPartnerAddressById**
> PartnerAddress findPartnerAddressById(id)

Find Partner address by ID

Returns a single partner address if the user has access

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PartnerAddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PartnerAddressApi apiInstance = new PartnerAddressApi();
Long id = 789L; // Long | ID of partner address to fetch
try {
    PartnerAddress result = apiInstance.findPartnerAddressById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerAddressApi#findPartnerAddressById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of partner address to fetch |

### Return type

[**PartnerAddress**](PartnerAddress.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findPartnerAddresses"></a>
# **findPartnerAddresses**
> List&lt;PartnerAddress&gt; findPartnerAddresses(tags, limit)

All partner address

Returns all partner address from the system that the user has access to

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PartnerAddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PartnerAddressApi apiInstance = new PartnerAddressApi();
List<String> tags = Arrays.asList("tags_example"); // List<String> | tags to filter by
Integer limit = 56; // Integer | Maximum number of results to return
try {
    List<PartnerAddress> result = apiInstance.findPartnerAddresses(tags, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerAddressApi#findPartnerAddresses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | [**List&lt;String&gt;**](String.md)| tags to filter by | [optional]
 **limit** | **Integer**| Maximum number of results to return | [optional]

### Return type

[**List&lt;PartnerAddress&gt;**](PartnerAddress.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

