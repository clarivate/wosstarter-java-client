# wos-api-starter-client

Web of Science™ Starter API
- API version: 1.0.0
  - Build date: 2022-04-06T14:38:20.941+02:00[Europe/Paris]

The Web of Science™ Starter API provides basic metadata and search functionality for Web of Science™ Documents and Journals. Based on your subscription, this API can return times cited of documents.

## Resouces
This API follows the REST approach to disclose resources in URL format. Only the GET method is currently available to perform requests over HTTP.

The API is available on the [Clarivate Developer Portal](https://developer.clarivate.com/apis/wos-starter). You can find more details about the subscription and the Plans.

## Content

You can learn more about content at [Web of Science™ Product Page](https://clarivate.com/webofsciencegroup/solutions/web-of-science/) or in the [Web of Science™ Help](https://webofscience.help.clarivate.com/en-us/Content/home.htm).
The following attributes are available from in the API.
* UID (Unique Identifier)
* Title
* Issue
* Pages
* DOI
* Volume
* Times Cited
* ISSN/eISSN
* ISBN
* PubMed ID
* Source
* Web of Science URL
* Citing Articles Web of Science URL
* Publication Date
* Authors
* Author Keywords
* [Document Type](https://webofscience.help.clarivate.com/en-us/Content/document-types.html)
* Cited References Web of Science URL
* ResearcherID
* Book DOI
* Related Records Web of Science URL
* Journal Citations Reports URL



## Credentials

All requests require authentication with an API Key authentication flow. For more details, check the [Guide][https://developer.clarivate.com/help/api-access#key_access].

## Search and field tags for Web of Science documents
Web of Science™ offers [advanced search query builder](https://webofscience.help.clarivate.com/en-us/Content/advanced-search.html). This API does not support all field tags for documents. [Web of Science API Expanded](https://developer.clarivate.com/apis/wos) offers all available field tags. The following table lists the field tags that are supported by this API.
| Field Tag | Description                                                                                                                                                 |
|-----------|-------------------------------------------------------------------------------------------------------------------------------------------------------------|
| TI        | Title of document                                                                                                                                           |
| IS        | ISSN or ISBN                                                                                                                                                |
| SO        | Source title - The result contains all source titles within product database (for example, journal titles and/or book titles if the product includes books) |
| VL        | Volume                                                                                                                                                      |
| PG        | Page                                                                                                                                                        |
| CS        | Issue                                                                                                                                                       |
| PY        | Year Published                                                                                                                                              |
| AU        | Author                                                                                                                                                      |
| AI        | Author Identifier                                                                                                                                                      |
| UT        | Accession Number                                                                                                                                            |
| DO        | DOI                                                                                                                                                         |
| DT        | [Document Type](https://webofscience.help.clarivate.com/en-us/Content/document-types.html)                                                                                                                                                         |
| PMID      | PubMed ID                                                                                                                                                   |
| OG        | Search for preferred organization names and/or their name variants from the Preferred Organization Index. <p> A search on a preferred organization name returns all records that contain the preferred name and all records that contain its name variants. A search on a name variant returns all records that contain the variant. For example, Cornell Law Sch returns all records that contain Cornell Law Sch in the Addresses field. <p> When searching for organization names that contain a Boolean (AND, NOT, NEAR, and SAME), always enclose the word in quotation marks ( \" \" ). For example: <p>   - OG=(Japan Science \"and\" Technology Agency (JST))      <br>   - OG=(\"Near\" East Univ)         <br> - OG=(\"OR\" Hlth Sci Univ)                           |
| TS        | Searches for topic terms in the following fields within a document: <p> - Title <br> - Abstract <br> - Author keywords <br> - Keywords Plus

## Pagination
To ensure fast response time, each search or multiple entity calls (such as `/documents`) retrieve only a certain number of hits/records.

There are two optional request parameters to browse along with the result&#58; _limit_ and _page_.

- limit&#58; Number of returned results, ranging from 0 to 50 (default **10**)
- page&#58; Specifying a page to retrieve (default **1**)

Moreover, this information is shown in the response body, in the tag **metadata**&#58;

```json
\"metadata\": {
  \"total\": 91,
  \"page\": 1,
  \"limit\": 10
}
```

## Errors
The WoS Journals API uses conventional HTTP success or failure status codes. For errors, some extra information is included to indicate what went wrong in the JSON response. The list of HTTP codes is listed below.

| Code  | Title  | Description |
|---|---|---|
| 400  | Bad request  | Request syntax error |
| 401  | Unauthorized  | The API key is invalid or missed |
| 404  | Not found  | The resource is not found |
| 405 | Method not allowed | Method other than GET is not allowed |
| 50X  | Server errors  | Technical error with servers|
Each error response (except `401 Unauthorized` error) contains the code of the error, the title of the error and detailed description of the error: a misprint in an endpoint, wrong URL parameter, etc. The example of the error message is shown below:

```json
  \"error\": {
    \"status\": 404,
    \"title\": \"Resource couldn't be found\",
    \"details\": \"There is no record found in the Web of Science database. Please check your query.\"
  }
```
For the `401 Unauthorized` error the response body is a little bit different:
```json
{
  \"error_description\": \"The access token is missing\",
  \"error\": \"invalid_request\"
}



*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.clarivate.wos</groupId>
  <artifactId>wos-api-starter-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'wos-api-starter-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'wos-api-starter-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "com.clarivate.wos:wos-api-starter-client:1.0.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/wos-api-starter-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import com.clarivate.wos.wos_api_starter_client.invoker.ApiClient;
import com.clarivate.wos.wos_api_starter_client.invoker.ApiException;
import com.clarivate.wos.wos_api_starter_client.invoker.Configuration;
import com.clarivate.wos.wos_api_starter_client.invoker.models.*;
import com.clarivate.wos.wos_api_starter_client.DocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.clarivate.com/apis/wos-starter");

    DocumentsApi apiInstance = new DocumentsApi(defaultClient);
    String q = "PY=2020"; // String | Web of Science advanced [advanced search query builder](https://webofscience.help.clarivate.com/en-us/Content/advanced-search.html). The supported field tags are listed in description.
    String db = "BCI"; // String | Web of Science Database abbreviation * WOS - Web of Science Core collection * BIOABS - Biological Abstracts * BCI - BIOSIS Citation Index * BIOSIS - BIOSIS Previews * CCC - Current Contents Connect * DIIDW - Derwent Innovations Index * DRCI - Data Citation Index * MEDLINE - MEDLINE The U.S. National Library of Medicine® (NLM®) premier life sciences database. * ZOOREC - Zoological Records * WOK - All databases 
    Integer limit = 10; // Integer | set the limit of records on the page (1-50)
    Integer page = 1; // Integer | set the result page
    String sortField = "sortField_example"; // String | Order by field(s). Field name and order by clause separated by '+', use A for ASC and D for DESC, ex: PY+D. Multiple values are separated by comma. Supported fields:  * **LD** - Load Date * **PY** - Publication Year * **RS** - Relevance * **TS** - Times Cited 
    try {
      DocumentsList result = apiInstance.documentsGet(q, db, limit, page, sortField);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#documentsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://api.clarivate.com/apis/wos-starter*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DocumentsApi* | [**documentsGet**](docs/DocumentsApi.md#documentsGet) | **GET** /documents | Query Web of Science documents 
*DocumentsApi* | [**documentsUidGet**](docs/DocumentsApi.md#documentsUidGet) | **GET** /documents/{uid} | Get Web of Science document by Accesssion Number (UID)
*JournalsApi* | [**journalsGet**](docs/JournalsApi.md#journalsGet) | **GET** /journals | Query Journals by ISSN
*JournalsApi* | [**journalsIdGet**](docs/JournalsApi.md#journalsIdGet) | **GET** /journals/{id} | Get Journal by ID


## Documentation for Models

 - [AuthorName](docs/AuthorName.md)
 - [Document](docs/Document.md)
 - [DocumentCitations](docs/DocumentCitations.md)
 - [DocumentIdentifiers](docs/DocumentIdentifiers.md)
 - [DocumentKeywords](docs/DocumentKeywords.md)
 - [DocumentLinks](docs/DocumentLinks.md)
 - [DocumentNames](docs/DocumentNames.md)
 - [DocumentSource](docs/DocumentSource.md)
 - [DocumentSourcePages](docs/DocumentSourcePages.md)
 - [DocumentsList](docs/DocumentsList.md)
 - [Journal](docs/Journal.md)
 - [JournalLinks](docs/JournalLinks.md)
 - [JournalsList](docs/JournalsList.md)
 - [Metadata](docs/Metadata.md)
 - [OtherName](docs/OtherName.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



