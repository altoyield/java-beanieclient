# PartnerApi

All URIs are relative to *https://bean.ie*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addPartner**](PartnerApi.md#addPartner) | **POST** /partners | 
[**findPartnerById**](PartnerApi.md#findPartnerById) | **GET** /partners/{id} | Find Partner by ID
[**findPartners**](PartnerApi.md#findPartners) | **GET** /partners | All partners


<a name="addPartner"></a>
# **addPartner**
> Partner addPartner(partners)



Creates a new partner in the system

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PartnerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PartnerApi apiInstance = new PartnerApi();
PartnerInput partners = new PartnerInput(); // PartnerInput | Partner to add to the system
try {
    Partner result = apiInstance.addPartner(partners);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerApi#addPartner");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **partners** | [**PartnerInput**](PartnerInput.md)| Partner to add to the system |

### Return type

[**Partner**](Partner.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findPartnerById"></a>
# **findPartnerById**
> Customer findPartnerById(id)

Find Partner by ID

Returns a single partner if the user has access

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PartnerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PartnerApi apiInstance = new PartnerApi();
Long id = 789L; // Long | ID of partner to fetch
try {
    Customer result = apiInstance.findPartnerById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerApi#findPartnerById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of partner to fetch |

### Return type

[**Customer**](Customer.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findPartners"></a>
# **findPartners**
> List&lt;Partner&gt; findPartners(tags, limit)

All partners

Returns all partners from the system that the user has access to

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PartnerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PartnerApi apiInstance = new PartnerApi();
List<String> tags = Arrays.asList("tags_example"); // List<String> | tags to filter by
Integer limit = 56; // Integer | Maximum number of results to return
try {
    List<Partner> result = apiInstance.findPartners(tags, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerApi#findPartners");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | [**List&lt;String&gt;**](String.md)| tags to filter by | [optional]
 **limit** | **Integer**| Maximum number of results to return | [optional]

### Return type

[**List&lt;Partner&gt;**](Partner.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

