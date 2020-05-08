# ProductCategoryApi

All URIs are relative to *https://bean.ie*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addProductCategory**](ProductCategoryApi.md#addProductCategory) | **POST** /product_categories | 
[**findProductCategories**](ProductCategoryApi.md#findProductCategories) | **GET** /product_categories | All product category
[**findProductCategoryById**](ProductCategoryApi.md#findProductCategoryById) | **GET** /product_categories/{id} | Find Product category by ID


<a name="addProductCategory"></a>
# **addProductCategory**
> ProductCategory addProductCategory(productCategories)



Creates a new product category in the system

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductCategoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ProductCategoryApi apiInstance = new ProductCategoryApi();
ProductCategoryInput productCategories = new ProductCategoryInput(); // ProductCategoryInput | Product category to add to the system
try {
    ProductCategory result = apiInstance.addProductCategory(productCategories);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductCategoryApi#addProductCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productCategories** | [**ProductCategoryInput**](ProductCategoryInput.md)| Product category to add to the system |

### Return type

[**ProductCategory**](ProductCategory.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findProductCategories"></a>
# **findProductCategories**
> List&lt;ProductCategory&gt; findProductCategories(tags, limit)

All product category

Returns all product category from the system that the user has access to

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductCategoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ProductCategoryApi apiInstance = new ProductCategoryApi();
List<String> tags = Arrays.asList("tags_example"); // List<String> | tags to filter by
Integer limit = 56; // Integer | Maximum number of results to return
try {
    List<ProductCategory> result = apiInstance.findProductCategories(tags, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductCategoryApi#findProductCategories");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | [**List&lt;String&gt;**](String.md)| tags to filter by | [optional]
 **limit** | **Integer**| Maximum number of results to return | [optional]

### Return type

[**List&lt;ProductCategory&gt;**](ProductCategory.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findProductCategoryById"></a>
# **findProductCategoryById**
> ProductCategory findProductCategoryById(id)

Find Product category by ID

Returns a single product category if the user has access

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductCategoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ProductCategoryApi apiInstance = new ProductCategoryApi();
Long id = 789L; // Long | ID of product category to fetch
try {
    ProductCategory result = apiInstance.findProductCategoryById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductCategoryApi#findProductCategoryById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of product category to fetch |

### Return type

[**ProductCategory**](ProductCategory.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

