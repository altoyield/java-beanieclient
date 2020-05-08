# PurchaseInvoiceApi

All URIs are relative to *https://bean.ie*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addPurchaseInvoice**](PurchaseInvoiceApi.md#addPurchaseInvoice) | **POST** /purchase_invoices | 
[**findPurchaseInvoiceById**](PurchaseInvoiceApi.md#findPurchaseInvoiceById) | **GET** /purchase_invoices/{id} | Find Purchase invoice by ID
[**findPurchaseInvoices**](PurchaseInvoiceApi.md#findPurchaseInvoices) | **GET** /purchase_invoices | All purchase invoice


<a name="addPurchaseInvoice"></a>
# **addPurchaseInvoice**
> PurchaseInvoice addPurchaseInvoice(purchaseInvoices)



Creates a new purchase invoice in the system

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PurchaseInvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PurchaseInvoiceApi apiInstance = new PurchaseInvoiceApi();
PurchaseInvoiceInput purchaseInvoices = new PurchaseInvoiceInput(); // PurchaseInvoiceInput | Purchase invoice to add to the system
try {
    PurchaseInvoice result = apiInstance.addPurchaseInvoice(purchaseInvoices);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PurchaseInvoiceApi#addPurchaseInvoice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **purchaseInvoices** | [**PurchaseInvoiceInput**](PurchaseInvoiceInput.md)| Purchase invoice to add to the system |

### Return type

[**PurchaseInvoice**](PurchaseInvoice.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findPurchaseInvoiceById"></a>
# **findPurchaseInvoiceById**
> PurchaseInvoice findPurchaseInvoiceById(id)

Find Purchase invoice by ID

Returns a single purchase invoice if the user has access

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PurchaseInvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PurchaseInvoiceApi apiInstance = new PurchaseInvoiceApi();
Long id = 789L; // Long | ID of purchase invoice to fetch
try {
    PurchaseInvoice result = apiInstance.findPurchaseInvoiceById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PurchaseInvoiceApi#findPurchaseInvoiceById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of purchase invoice to fetch |

### Return type

[**PurchaseInvoice**](PurchaseInvoice.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findPurchaseInvoices"></a>
# **findPurchaseInvoices**
> List&lt;PurchaseInvoice&gt; findPurchaseInvoices(tags, limit)

All purchase invoice

Returns all purchase invoice from the system that the user has access to

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PurchaseInvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PurchaseInvoiceApi apiInstance = new PurchaseInvoiceApi();
List<String> tags = Arrays.asList("tags_example"); // List<String> | tags to filter by
Integer limit = 56; // Integer | Maximum number of results to return
try {
    List<PurchaseInvoice> result = apiInstance.findPurchaseInvoices(tags, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PurchaseInvoiceApi#findPurchaseInvoices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | [**List&lt;String&gt;**](String.md)| tags to filter by | [optional]
 **limit** | **Integer**| Maximum number of results to return | [optional]

### Return type

[**List&lt;PurchaseInvoice&gt;**](PurchaseInvoice.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

