# ProductApi

All URIs are relative to *https://bean.ie*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addProduct**](ProductApi.md#addProduct) | **POST** /products | 
[**findProductById**](ProductApi.md#findProductById) | **GET** /products/{id} | Find Product by ID
[**findProducts**](ProductApi.md#findProducts) | **GET** /products | All product


<a name="addProduct"></a>
# **addProduct**
> Product addProduct(products)



Creates a new product in the system

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ProductApi apiInstance = new ProductApi();
ProductInput products = new ProductInput(); // ProductInput | Product to add to the system
try {
    Product result = apiInstance.addProduct(products);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#addProduct");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **products** | [**ProductInput**](ProductInput.md)| Product to add to the system |

### Return type

[**Product**](Product.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findProductById"></a>
# **findProductById**
> Product findProductById(id)

Find Product by ID

Returns a single product if the user has access

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ProductApi apiInstance = new ProductApi();
Long id = 789L; // Long | ID of product to fetch
try {
    Product result = apiInstance.findProductById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#findProductById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of product to fetch |

### Return type

[**Product**](Product.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findProducts"></a>
# **findProducts**
> List&lt;Product&gt; findProducts(tags, limit)

All product

Returns all product from the system that the user has access to

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ProductApi apiInstance = new ProductApi();
List<String> tags = Arrays.asList("tags_example"); // List<String> | tags to filter by
Integer limit = 56; // Integer | Maximum number of results to return
try {
    List<Product> result = apiInstance.findProducts(tags, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#findProducts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | [**List&lt;String&gt;**](String.md)| tags to filter by | [optional]
 **limit** | **Integer**| Maximum number of results to return | [optional]

### Return type

[**List&lt;Product&gt;**](Product.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

