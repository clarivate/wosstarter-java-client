# JournalsApi

All URIs are relative to *http://api.clarivate.com/apis/wos-starter*

Method | HTTP request | Description
------------- | ------------- | -------------
[**journalsGet**](JournalsApi.md#journalsGet) | **GET** /journals | Query Journals by ISSN
[**journalsIdGet**](JournalsApi.md#journalsIdGet) | **GET** /journals/{id} | Get Journal by ID


<a name="journalsGet"></a>
# **journalsGet**
> JournalsList journalsGet(issn)

Query Journals by ISSN

### Example
```java
// Import classes:
import com.clarivate.wos.wos_api_starter_client.invoker.ApiClient;
import com.clarivate.wos.wos_api_starter_client.invoker.ApiException;
import com.clarivate.wos.wos_api_starter_client.invoker.Configuration;
import com.clarivate.wos.wos_api_starter_client.invoker.models.*;
import com.clarivate.wos.wos_api_starter_client.JournalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.clarivate.com/apis/wos-starter");

    JournalsApi apiInstance = new JournalsApi(defaultClient);
    String issn = "issn_example"; // String | Query Journal by ISSN
    try {
      JournalsList result = apiInstance.journalsGet(issn);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JournalsApi#journalsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issn** | **String**| Query Journal by ISSN | [optional]

### Return type

[**JournalsList**](JournalsList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="journalsIdGet"></a>
# **journalsIdGet**
> Journal journalsIdGet(id)

Get Journal by ID

### Example
```java
// Import classes:
import com.clarivate.wos.wos_api_starter_client.invoker.ApiClient;
import com.clarivate.wos.wos_api_starter_client.invoker.ApiException;
import com.clarivate.wos.wos_api_starter_client.invoker.Configuration;
import com.clarivate.wos.wos_api_starter_client.invoker.models.*;
import com.clarivate.wos.wos_api_starter_client.JournalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.clarivate.com/apis/wos-starter");

    JournalsApi apiInstance = new JournalsApi(defaultClient);
    String id = "ANAT_REC_PART_A"; // String | 
    try {
      Journal result = apiInstance.journalsIdGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JournalsApi#journalsIdGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**Journal**](Journal.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

