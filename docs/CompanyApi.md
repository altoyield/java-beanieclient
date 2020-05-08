# CompanyApi

All URIs are relative to *https://bean.ie*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findCompanyById**](CompanyApi.md#findCompanyById) | **GET** /companies/{id} | Find Company details by ID


<a name="findCompanyById"></a>
# **findCompanyById**
> Company findCompanyById(id)

Find Company details by ID

Returns a single company details if the user has access

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CompanyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CompanyApi apiInstance = new CompanyApi();
Long id = 789L; // Long | ID of company details to fetch
try {
    Company result = apiInstance.findCompanyById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#findCompanyById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of company details to fetch |

### Return type

[**Company**](Company.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

