# ImageApi

All URIs are relative to *https://bean.ie*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addImage**](ImageApi.md#addImage) | **POST** /images | 
[**findImageById**](ImageApi.md#findImageById) | **GET** /images/{id} | Find Image by ID
[**findImages**](ImageApi.md#findImages) | **GET** /images | All image


<a name="addImage"></a>
# **addImage**
> Image addImage(images)



Creates a new image in the system

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ImageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ImageApi apiInstance = new ImageApi();
ImageInput images = new ImageInput(); // ImageInput | Image to add to the system
try {
    Image result = apiInstance.addImage(images);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ImageApi#addImage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **images** | [**ImageInput**](ImageInput.md)| Image to add to the system |

### Return type

[**Image**](Image.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findImageById"></a>
# **findImageById**
> Image findImageById(id)

Find Image by ID

Returns a single image if the user has access

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ImageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ImageApi apiInstance = new ImageApi();
Long id = 789L; // Long | ID of image to fetch
try {
    Image result = apiInstance.findImageById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ImageApi#findImageById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of image to fetch |

### Return type

[**Image**](Image.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findImages"></a>
# **findImages**
> List&lt;Image&gt; findImages(tags, limit)

All image

Returns all image from the system that the user has access to

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ImageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ImageApi apiInstance = new ImageApi();
List<String> tags = Arrays.asList("tags_example"); // List<String> | tags to filter by
Integer limit = 56; // Integer | Maximum number of results to return
try {
    List<Image> result = apiInstance.findImages(tags, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ImageApi#findImages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | [**List&lt;String&gt;**](String.md)| tags to filter by | [optional]
 **limit** | **Integer**| Maximum number of results to return | [optional]

### Return type

[**List&lt;Image&gt;**](Image.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

