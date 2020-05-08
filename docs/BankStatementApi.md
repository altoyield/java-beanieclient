# BankStatementApi

All URIs are relative to *https://bean.ie*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addBankStatement**](BankStatementApi.md#addBankStatement) | **POST** /bank_statements | 
[**findBankStatementById**](BankStatementApi.md#findBankStatementById) | **GET** /bank_statements/{id} | Find Bank statement by ID
[**findBankStatements**](BankStatementApi.md#findBankStatements) | **GET** /bank_statements | All bank statement


<a name="addBankStatement"></a>
# **addBankStatement**
> BankStatement addBankStatement(bankStatements)



Creates a new bank statement in the system

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BankStatementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BankStatementApi apiInstance = new BankStatementApi();
BankStatementInput bankStatements = new BankStatementInput(); // BankStatementInput | Bank statement to add to the system
try {
    BankStatement result = apiInstance.addBankStatement(bankStatements);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BankStatementApi#addBankStatement");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bankStatements** | [**BankStatementInput**](BankStatementInput.md)| Bank statement to add to the system |

### Return type

[**BankStatement**](BankStatement.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findBankStatementById"></a>
# **findBankStatementById**
> BankStatement findBankStatementById(id)

Find Bank statement by ID

Returns a single bank statement if the user has access

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BankStatementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BankStatementApi apiInstance = new BankStatementApi();
Long id = 789L; // Long | ID of bank statement to fetch
try {
    BankStatement result = apiInstance.findBankStatementById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BankStatementApi#findBankStatementById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of bank statement to fetch |

### Return type

[**BankStatement**](BankStatement.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findBankStatements"></a>
# **findBankStatements**
> List&lt;BankStatement&gt; findBankStatements(tags, limit)

All bank statement

Returns all bank statement from the system that the user has access to

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BankStatementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BankStatementApi apiInstance = new BankStatementApi();
List<String> tags = Arrays.asList("tags_example"); // List<String> | tags to filter by
Integer limit = 56; // Integer | Maximum number of results to return
try {
    List<BankStatement> result = apiInstance.findBankStatements(tags, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BankStatementApi#findBankStatements");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | [**List&lt;String&gt;**](String.md)| tags to filter by | [optional]
 **limit** | **Integer**| Maximum number of results to return | [optional]

### Return type

[**List&lt;BankStatement&gt;**](BankStatement.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

