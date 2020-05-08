# ProductPriceApi

All URIs are relative to *https://bean.ie*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addProductPrice**](ProductPriceApi.md#addProductPrice) | **POST** /product_prices | 
[**findProductPriceById**](ProductPriceApi.md#findProductPriceById) | **GET** /product_prices/{id} | Find Product price by ID
[**findProductPrices**](ProductPriceApi.md#findProductPrices) | **GET** /product_prices | All product price


<a name="addProductPrice"></a>
# **addProductPrice**
> ProductPrice addProductPrice(productPrices)



Creates a new product price in the system

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductPriceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ProductPriceApi apiInstance = new ProductPriceApi();
ProductPriceInput productPrices = new ProductPriceInput(); // ProductPriceInput | Product price to add to the system
try {
    ProductPrice result = apiInstance.addProductPrice(productPrices);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductPriceApi#addProductPrice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productPrices** | [**ProductPriceInput**](ProductPriceInput.md)| Product price to add to the system |

### Return type

[**ProductPrice**](ProductPrice.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findProductPriceById"></a>
# **findProductPriceById**
> ProductPrice findProductPriceById(id)

Find Product price by ID

Returns a single product price if the user has access

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductPriceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ProductPriceApi apiInstance = new ProductPriceApi();
Long id = 789L; // Long | ID of product price to fetch
try {
    ProductPrice result = apiInstance.findProductPriceById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductPriceApi#findProductPriceById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of product price to fetch |

### Return type

[**ProductPrice**](ProductPrice.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findProductPrices"></a>
# **findProductPrices**
> List&lt;ProductPrice&gt; findProductPrices(tags, limit)

All product price

Returns all product price from the system that the user has access to

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductPriceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ProductPriceApi apiInstance = new ProductPriceApi();
List<String> tags = Arrays.asList("tags_example"); // List<String> | tags to filter by
Integer limit = 56; // Integer | Maximum number of results to return
try {
    List<ProductPrice> result = apiInstance.findProductPrices(tags, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductPriceApi#findProductPrices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | [**List&lt;String&gt;**](String.md)| tags to filter by | [optional]
 **limit** | **Integer**| Maximum number of results to return | [optional]

### Return type

[**List&lt;ProductPrice&gt;**](ProductPrice.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

