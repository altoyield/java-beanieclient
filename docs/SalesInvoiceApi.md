# SalesInvoiceApi

All URIs are relative to *https://bean.ie*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addSalesInvoice**](SalesInvoiceApi.md#addSalesInvoice) | **POST** /sales_invoices | 
[**findSalesInvoiceById**](SalesInvoiceApi.md#findSalesInvoiceById) | **GET** /sales_invoices/{id} | Find Sales invoice by ID
[**findSalesInvoices**](SalesInvoiceApi.md#findSalesInvoices) | **GET** /sales_invoices | All sales invoice


<a name="addSalesInvoice"></a>
# **addSalesInvoice**
> SalesInvoice addSalesInvoice(salesInvoices)



Creates a new sales invoice in the system

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SalesInvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SalesInvoiceApi apiInstance = new SalesInvoiceApi();
SalesInvoiceInput salesInvoices = new SalesInvoiceInput(); // SalesInvoiceInput | Sales invoice to add to the system
try {
    SalesInvoice result = apiInstance.addSalesInvoice(salesInvoices);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SalesInvoiceApi#addSalesInvoice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **salesInvoices** | [**SalesInvoiceInput**](SalesInvoiceInput.md)| Sales invoice to add to the system |

### Return type

[**SalesInvoice**](SalesInvoice.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findSalesInvoiceById"></a>
# **findSalesInvoiceById**
> SalesInvoice findSalesInvoiceById(id)

Find Sales invoice by ID

Returns a single sales invoice if the user has access

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SalesInvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SalesInvoiceApi apiInstance = new SalesInvoiceApi();
Long id = 789L; // Long | ID of sales invoice to fetch
try {
    SalesInvoice result = apiInstance.findSalesInvoiceById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SalesInvoiceApi#findSalesInvoiceById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of sales invoice to fetch |

### Return type

[**SalesInvoice**](SalesInvoice.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findSalesInvoices"></a>
# **findSalesInvoices**
> List&lt;SalesInvoice&gt; findSalesInvoices(tags, limit)

All sales invoice

Returns all sales invoice from the system that the user has access to

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SalesInvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SalesInvoiceApi apiInstance = new SalesInvoiceApi();
List<String> tags = Arrays.asList("tags_example"); // List<String> | tags to filter by
Integer limit = 56; // Integer | Maximum number of results to return
try {
    List<SalesInvoice> result = apiInstance.findSalesInvoices(tags, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SalesInvoiceApi#findSalesInvoices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | [**List&lt;String&gt;**](String.md)| tags to filter by | [optional]
 **limit** | **Integer**| Maximum number of results to return | [optional]

### Return type

[**List&lt;SalesInvoice&gt;**](SalesInvoice.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

