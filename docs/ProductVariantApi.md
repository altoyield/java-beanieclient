# ProductVariantApi

All URIs are relative to *https://bean.ie*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addProductVariant**](ProductVariantApi.md#addProductVariant) | **POST** /product_variants | 
[**findProductVariantById**](ProductVariantApi.md#findProductVariantById) | **GET** /product_variants/{id} | Find Product variant by ID
[**findProductVariants**](ProductVariantApi.md#findProductVariants) | **GET** /product_variants | All product variant


<a name="addProductVariant"></a>
# **addProductVariant**
> ProductVariant addProductVariant(productVariants)



Creates a new product variant in the system

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductVariantApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ProductVariantApi apiInstance = new ProductVariantApi();
ProductVariantInput productVariants = new ProductVariantInput(); // ProductVariantInput | Product variant to add to the system
try {
    ProductVariant result = apiInstance.addProductVariant(productVariants);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductVariantApi#addProductVariant");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productVariants** | [**ProductVariantInput**](ProductVariantInput.md)| Product variant to add to the system |

### Return type

[**ProductVariant**](ProductVariant.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findProductVariantById"></a>
# **findProductVariantById**
> ProductVariant findProductVariantById(id)

Find Product variant by ID

Returns a single product variant if the user has access

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductVariantApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ProductVariantApi apiInstance = new ProductVariantApi();
Long id = 789L; // Long | ID of product variant to fetch
try {
    ProductVariant result = apiInstance.findProductVariantById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductVariantApi#findProductVariantById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of product variant to fetch |

### Return type

[**ProductVariant**](ProductVariant.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findProductVariants"></a>
# **findProductVariants**
> List&lt;ProductVariant&gt; findProductVariants(tags, limit)

All product variant

Returns all product variant from the system that the user has access to

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductVariantApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ProductVariantApi apiInstance = new ProductVariantApi();
List<String> tags = Arrays.asList("tags_example"); // List<String> | tags to filter by
Integer limit = 56; // Integer | Maximum number of results to return
try {
    List<ProductVariant> result = apiInstance.findProductVariants(tags, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductVariantApi#findProductVariants");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | [**List&lt;String&gt;**](String.md)| tags to filter by | [optional]
 **limit** | **Integer**| Maximum number of results to return | [optional]

### Return type

[**List&lt;ProductVariant&gt;**](ProductVariant.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

