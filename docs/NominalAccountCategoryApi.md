# NominalAccountCategoryApi

All URIs are relative to *https://bean.ie*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addNominalAccountCategory**](NominalAccountCategoryApi.md#addNominalAccountCategory) | **POST** /nominal_account_categories | 
[**findNominalAccountCategories**](NominalAccountCategoryApi.md#findNominalAccountCategories) | **GET** /nominal_account_categories | All nominal account category
[**findNominalAccountCategoryById**](NominalAccountCategoryApi.md#findNominalAccountCategoryById) | **GET** /nominal_account_categories/{id} | Find Nominal account category by ID


<a name="addNominalAccountCategory"></a>
# **addNominalAccountCategory**
> NominalAccountCategory addNominalAccountCategory(nominalAccountCategories)



Creates a new nominal account category in the system

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NominalAccountCategoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

NominalAccountCategoryApi apiInstance = new NominalAccountCategoryApi();
NominalAccountCategoryInput nominalAccountCategories = new NominalAccountCategoryInput(); // NominalAccountCategoryInput | Nominal account category to add to the system
try {
    NominalAccountCategory result = apiInstance.addNominalAccountCategory(nominalAccountCategories);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NominalAccountCategoryApi#addNominalAccountCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nominalAccountCategories** | [**NominalAccountCategoryInput**](NominalAccountCategoryInput.md)| Nominal account category to add to the system |

### Return type

[**NominalAccountCategory**](NominalAccountCategory.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findNominalAccountCategories"></a>
# **findNominalAccountCategories**
> List&lt;NominalAccountCategory&gt; findNominalAccountCategories(tags, limit)

All nominal account category

Returns all nominal account category from the system that the user has access to

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NominalAccountCategoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

NominalAccountCategoryApi apiInstance = new NominalAccountCategoryApi();
List<String> tags = Arrays.asList("tags_example"); // List<String> | tags to filter by
Integer limit = 56; // Integer | Maximum number of results to return
try {
    List<NominalAccountCategory> result = apiInstance.findNominalAccountCategories(tags, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NominalAccountCategoryApi#findNominalAccountCategories");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | [**List&lt;String&gt;**](String.md)| tags to filter by | [optional]
 **limit** | **Integer**| Maximum number of results to return | [optional]

### Return type

[**List&lt;NominalAccountCategory&gt;**](NominalAccountCategory.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findNominalAccountCategoryById"></a>
# **findNominalAccountCategoryById**
> NominalAccountCategory findNominalAccountCategoryById(id)

Find Nominal account category by ID

Returns a single nominal account category if the user has access

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NominalAccountCategoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

NominalAccountCategoryApi apiInstance = new NominalAccountCategoryApi();
Long id = 789L; // Long | ID of nominal account category to fetch
try {
    NominalAccountCategory result = apiInstance.findNominalAccountCategoryById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NominalAccountCategoryApi#findNominalAccountCategoryById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of nominal account category to fetch |

### Return type

[**NominalAccountCategory**](NominalAccountCategory.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

