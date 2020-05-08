# AddressBlockApi

All URIs are relative to *https://bean.ie*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addAddressBlock**](AddressBlockApi.md#addAddressBlock) | **POST** /address_blocks | 
[**findAddressBlockById**](AddressBlockApi.md#findAddressBlockById) | **GET** /address_blocks/{id} | Find Address block by ID
[**findAddressBlocks**](AddressBlockApi.md#findAddressBlocks) | **GET** /address_blocks | All address block


<a name="addAddressBlock"></a>
# **addAddressBlock**
> AddressBlock addAddressBlock(addressBlocks)



Creates a new address block in the system

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AddressBlockApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AddressBlockApi apiInstance = new AddressBlockApi();
AddressBlockInput addressBlocks = new AddressBlockInput(); // AddressBlockInput | Address block to add to the system
try {
    AddressBlock result = apiInstance.addAddressBlock(addressBlocks);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressBlockApi#addAddressBlock");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addressBlocks** | [**AddressBlockInput**](AddressBlockInput.md)| Address block to add to the system |

### Return type

[**AddressBlock**](AddressBlock.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findAddressBlockById"></a>
# **findAddressBlockById**
> AddressBlock findAddressBlockById(id)

Find Address block by ID

Returns a single address block if the user has access

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AddressBlockApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AddressBlockApi apiInstance = new AddressBlockApi();
Long id = 789L; // Long | ID of address block to fetch
try {
    AddressBlock result = apiInstance.findAddressBlockById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressBlockApi#findAddressBlockById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of address block to fetch |

### Return type

[**AddressBlock**](AddressBlock.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findAddressBlocks"></a>
# **findAddressBlocks**
> List&lt;AddressBlock&gt; findAddressBlocks(tags, limit)

All address block

Returns all address block from the system that the user has access to

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AddressBlockApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AddressBlockApi apiInstance = new AddressBlockApi();
List<String> tags = Arrays.asList("tags_example"); // List<String> | tags to filter by
Integer limit = 56; // Integer | Maximum number of results to return
try {
    List<AddressBlock> result = apiInstance.findAddressBlocks(tags, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressBlockApi#findAddressBlocks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | [**List&lt;String&gt;**](String.md)| tags to filter by | [optional]
 **limit** | **Integer**| Maximum number of results to return | [optional]

### Return type

[**List&lt;AddressBlock&gt;**](AddressBlock.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

