# ShippingCentreApi

All URIs are relative to *https://bean.ie*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addShippingCentre**](ShippingCentreApi.md#addShippingCentre) | **POST** /shipping_centres | 
[**findShippingCentreById**](ShippingCentreApi.md#findShippingCentreById) | **GET** /shipping_centres/{id} | Find Shipping centre by ID
[**findShippingCentres**](ShippingCentreApi.md#findShippingCentres) | **GET** /shipping_centres | All shipping centre


<a name="addShippingCentre"></a>
# **addShippingCentre**
> ShippingCentre addShippingCentre(shippingCentres)



Creates a new shipping centre in the system

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ShippingCentreApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ShippingCentreApi apiInstance = new ShippingCentreApi();
ShippingCentreInput shippingCentres = new ShippingCentreInput(); // ShippingCentreInput | Shipping centre to add to the system
try {
    ShippingCentre result = apiInstance.addShippingCentre(shippingCentres);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShippingCentreApi#addShippingCentre");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shippingCentres** | [**ShippingCentreInput**](ShippingCentreInput.md)| Shipping centre to add to the system |

### Return type

[**ShippingCentre**](ShippingCentre.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findShippingCentreById"></a>
# **findShippingCentreById**
> ShippingCentre findShippingCentreById(id)

Find Shipping centre by ID

Returns a single shipping centre if the user has access

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ShippingCentreApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ShippingCentreApi apiInstance = new ShippingCentreApi();
Long id = 789L; // Long | ID of shipping centre to fetch
try {
    ShippingCentre result = apiInstance.findShippingCentreById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShippingCentreApi#findShippingCentreById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of shipping centre to fetch |

### Return type

[**ShippingCentre**](ShippingCentre.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findShippingCentres"></a>
# **findShippingCentres**
> List&lt;ShippingCentre&gt; findShippingCentres(tags, limit)

All shipping centre

Returns all shipping centre from the system that the user has access to

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ShippingCentreApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ShippingCentreApi apiInstance = new ShippingCentreApi();
List<String> tags = Arrays.asList("tags_example"); // List<String> | tags to filter by
Integer limit = 56; // Integer | Maximum number of results to return
try {
    List<ShippingCentre> result = apiInstance.findShippingCentres(tags, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShippingCentreApi#findShippingCentres");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | [**List&lt;String&gt;**](String.md)| tags to filter by | [optional]
 **limit** | **Integer**| Maximum number of results to return | [optional]

### Return type

[**List&lt;ShippingCentre&gt;**](ShippingCentre.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

