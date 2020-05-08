# BillOfMaterialsApi

All URIs are relative to *https://bean.ie*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addBillOfMaterial**](BillOfMaterialsApi.md#addBillOfMaterial) | **POST** /bill_of_materials | 
[**findBillOfMaterialById**](BillOfMaterialsApi.md#findBillOfMaterialById) | **GET** /bill_of_materials/{id} | Find Bill of Materials by ID
[**findBillOfMaterials**](BillOfMaterialsApi.md#findBillOfMaterials) | **GET** /bill_of_materials | All bill of materials


<a name="addBillOfMaterial"></a>
# **addBillOfMaterial**
> BillOfMaterial addBillOfMaterial(billOfMaterials)



Creates a new bill of materials in the system

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BillOfMaterialsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BillOfMaterialsApi apiInstance = new BillOfMaterialsApi();
BillOfMaterialInput billOfMaterials = new BillOfMaterialInput(); // BillOfMaterialInput | Bill of Materials to add to the system
try {
    BillOfMaterial result = apiInstance.addBillOfMaterial(billOfMaterials);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillOfMaterialsApi#addBillOfMaterial");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **billOfMaterials** | [**BillOfMaterialInput**](BillOfMaterialInput.md)| Bill of Materials to add to the system |

### Return type

[**BillOfMaterial**](BillOfMaterial.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findBillOfMaterialById"></a>
# **findBillOfMaterialById**
> BillOfMaterial findBillOfMaterialById(id)

Find Bill of Materials by ID

Returns a single bill of materials if the user has access

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BillOfMaterialsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BillOfMaterialsApi apiInstance = new BillOfMaterialsApi();
Long id = 789L; // Long | ID of bill of materials to fetch
try {
    BillOfMaterial result = apiInstance.findBillOfMaterialById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillOfMaterialsApi#findBillOfMaterialById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of bill of materials to fetch |

### Return type

[**BillOfMaterial**](BillOfMaterial.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findBillOfMaterials"></a>
# **findBillOfMaterials**
> List&lt;BillOfMaterial&gt; findBillOfMaterials(tags, limit)

All bill of materials

Returns all bill of materials from the system that the user has access to

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BillOfMaterialsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BillOfMaterialsApi apiInstance = new BillOfMaterialsApi();
List<String> tags = Arrays.asList("tags_example"); // List<String> | tags to filter by
Integer limit = 56; // Integer | Maximum number of results to return
try {
    List<BillOfMaterial> result = apiInstance.findBillOfMaterials(tags, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillOfMaterialsApi#findBillOfMaterials");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | [**List&lt;String&gt;**](String.md)| tags to filter by | [optional]
 **limit** | **Integer**| Maximum number of results to return | [optional]

### Return type

[**List&lt;BillOfMaterial&gt;**](BillOfMaterial.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

