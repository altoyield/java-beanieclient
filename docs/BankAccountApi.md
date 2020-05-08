# BankAccountApi

All URIs are relative to *https://bean.ie*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addBankAccount**](BankAccountApi.md#addBankAccount) | **POST** /bank_accounts | 
[**findBankAccountById**](BankAccountApi.md#findBankAccountById) | **GET** /bank_accounts/{id} | Find Bank Account by ID
[**findBankAccounts**](BankAccountApi.md#findBankAccounts) | **GET** /bank_accounts | All bank accounts


<a name="addBankAccount"></a>
# **addBankAccount**
> BankAccount addBankAccount(bankAccount)



Creates a new bank account in the system

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BankAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BankAccountApi apiInstance = new BankAccountApi();
BankAccountInput bankAccount = new BankAccountInput(); // BankAccountInput | Bank account to add to the system
try {
    BankAccount result = apiInstance.addBankAccount(bankAccount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BankAccountApi#addBankAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bankAccount** | [**BankAccountInput**](BankAccountInput.md)| Bank account to add to the system |

### Return type

[**BankAccount**](BankAccount.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findBankAccountById"></a>
# **findBankAccountById**
> BankAccount findBankAccountById(id)

Find Bank Account by ID

Returns a single bank account if the user has access

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BankAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BankAccountApi apiInstance = new BankAccountApi();
Long id = 789L; // Long | ID of bank account to fetch
try {
    BankAccount result = apiInstance.findBankAccountById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BankAccountApi#findBankAccountById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of bank account to fetch |

### Return type

[**BankAccount**](BankAccount.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findBankAccounts"></a>
# **findBankAccounts**
> List&lt;BankAccount&gt; findBankAccounts(tags, limit)

All bank accounts

Returns all bank accounts from the system that the user has access to

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BankAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BankAccountApi apiInstance = new BankAccountApi();
List<String> tags = Arrays.asList("tags_example"); // List<String> | tags to filter by
Integer limit = 56; // Integer | maximum number of results to return
try {
    List<BankAccount> result = apiInstance.findBankAccounts(tags, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BankAccountApi#findBankAccounts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | [**List&lt;String&gt;**](String.md)| tags to filter by | [optional]
 **limit** | **Integer**| maximum number of results to return | [optional]

### Return type

[**List&lt;BankAccount&gt;**](BankAccount.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

