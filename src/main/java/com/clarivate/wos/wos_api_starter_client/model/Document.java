/*
 * Web of Science™ Starter API
 * The Web of Science™ Starter API provides basic metadata and search functionality for Web of Science™ Documents and Journals. Based on your subscription, this API can return times cited of documents.  ## Resouces This API follows the REST approach to disclose resources in URL format. Only the GET method is currently available to perform requests over HTTP.  The API is available on the [Clarivate Developer Portal](https://developer.clarivate.com/apis/wos-starter). You can find more details about the subscription and the Plans.  ## Content  You can learn more about content at [Web of Science™ Product Page](https://clarivate.com/webofsciencegroup/solutions/web-of-science/) or in the [Web of Science™ Help](https://webofscience.help.clarivate.com/en-us/Content/home.htm). The following attributes are available from in the API. * UID (Unique Identifier) * Title * Issue * Pages * DOI * Volume * Times Cited * ISSN/eISSN * ISBN * PubMed ID * Source * Web of Science URL * Citing Articles Web of Science URL * Publication Date * Authors * Author Keywords * [Document Type](https://webofscience.help.clarivate.com/en-us/Content/document-types.html) * Cited References Web of Science URL * ResearcherID * Book DOI * Related Records Web of Science URL * Journal Citations Reports URL    ## Credentials  All requests require authentication with an API Key authentication flow. For more details, check the [Guide][https://developer.clarivate.com/help/api-access#key_access].  ## Search and field tags for Web of Science documents Web of Science™ offers [advanced search query builder](https://webofscience.help.clarivate.com/en-us/Content/advanced-search.html). This API does not support all field tags for documents. [Web of Science API Expanded](https://developer.clarivate.com/apis/wos) offers all available field tags. The following table lists the field tags that are supported by this API. | Field Tag | Description                                                                                                                                                 | |-----------|-------------------------------------------------------------------------------------------------------------------------------------------------------------| | TI        | Title of document                                                                                                                                           | | IS        | ISSN or ISBN                                                                                                                                                | | SO        | Source title - The result contains all source titles within product database (for example, journal titles and/or book titles if the product includes books) | | VL        | Volume                                                                                                                                                      | | PG        | Page                                                                                                                                                        | | CS        | Issue                                                                                                                                                       | | PY        | Year Published                                                                                                                                              | | AU        | Author                                                                                                                                                      | | AI        | Author Identifier                                                                                                                                                      | | UT        | Accession Number                                                                                                                                            | | DO        | DOI                                                                                                                                                         | | DT        | [Document Type](https://webofscience.help.clarivate.com/en-us/Content/document-types.html)                                                                                                                                                         | | PMID      | PubMed ID                                                                                                                                                   | | OG        | Search for preferred organization names and/or their name variants from the Preferred Organization Index. <p> A search on a preferred organization name returns all records that contain the preferred name and all records that contain its name variants. A search on a name variant returns all records that contain the variant. For example, Cornell Law Sch returns all records that contain Cornell Law Sch in the Addresses field. <p> When searching for organization names that contain a Boolean (AND, NOT, NEAR, and SAME), always enclose the word in quotation marks ( \" \" ). For example: <p>   - OG=(Japan Science \"and\" Technology Agency (JST))      <br>   - OG=(\"Near\" East Univ)         <br> - OG=(\"OR\" Hlth Sci Univ)                           | | TS        | Searches for topic terms in the following fields within a document: <p> - Title <br> - Abstract <br> - Author keywords <br> - Keywords Plus  ## Pagination To ensure fast response time, each search or multiple entity calls (such as `/documents`) retrieve only a certain number of hits/records.  There are two optional request parameters to browse along with the result&#58; _limit_ and _page_.  - limit&#58; Number of returned results, ranging from 0 to 50 (default **10**) - page&#58; Specifying a page to retrieve (default **1**)  Moreover, this information is shown in the response body, in the tag **metadata**&#58;  ```json \"metadata\": {   \"total\": 91,   \"page\": 1,   \"limit\": 10 } ```  ## Errors The WoS Journals API uses conventional HTTP success or failure status codes. For errors, some extra information is included to indicate what went wrong in the JSON response. The list of HTTP codes is listed below.  | Code  | Title  | Description | |---|---|---| | 400  | Bad request  | Request syntax error | | 401  | Unauthorized  | The API key is invalid or missed | | 404  | Not found  | The resource is not found | | 405 | Method not allowed | Method other than GET is not allowed | | 50X  | Server errors  | Technical error with servers| Each error response (except `401 Unauthorized` error) contains the code of the error, the title of the error and detailed description of the error: a misprint in an endpoint, wrong URL parameter, etc. The example of the error message is shown below:  ```json   \"error\": {     \"status\": 404,     \"title\": \"Resource couldn't be found\",     \"details\": \"There is no record found in the Web of Science database. Please check your query.\"   } ``` For the `401 Unauthorized` error the response body is a little bit different: ```json {   \"error_description\": \"The access token is missing\",   \"error\": \"invalid_request\" } 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.clarivate.wos.wos_api_starter_client.model;

import java.util.Objects;
import java.util.Arrays;
import com.clarivate.wos.wos_api_starter_client.model.DocumentCitations;
import com.clarivate.wos.wos_api_starter_client.model.DocumentIdentifiers;
import com.clarivate.wos.wos_api_starter_client.model.DocumentKeywords;
import com.clarivate.wos.wos_api_starter_client.model.DocumentLinks;
import com.clarivate.wos.wos_api_starter_client.model.DocumentNames;
import com.clarivate.wos.wos_api_starter_client.model.DocumentSource;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Document
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-06T14:38:20.941+02:00[Europe/Paris]")
public class Document {
  public static final String SERIALIZED_NAME_UID = "uid";
  @SerializedName(SERIALIZED_NAME_UID)
  private String uid;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_TYPES = "types";
  @SerializedName(SERIALIZED_NAME_TYPES)
  private List<String> types = null;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private DocumentSource source;

  public static final String SERIALIZED_NAME_NAMES = "names";
  @SerializedName(SERIALIZED_NAME_NAMES)
  private DocumentNames names;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private DocumentLinks links;

  public static final String SERIALIZED_NAME_CITATIONS = "citations";
  @SerializedName(SERIALIZED_NAME_CITATIONS)
  private List<DocumentCitations> citations = null;

  public static final String SERIALIZED_NAME_IDENTIFIERS = "identifiers";
  @SerializedName(SERIALIZED_NAME_IDENTIFIERS)
  private DocumentIdentifiers identifiers;

  public static final String SERIALIZED_NAME_KEYWORDS = "keywords";
  @SerializedName(SERIALIZED_NAME_KEYWORDS)
  private DocumentKeywords keywords;

  public Document() { 
  }

  public Document uid(String uid) {
    
    this.uid = uid;
    return this;
  }

   /**
   * Web of Science Unique Identifier
   * @return uid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Web of Science Unique Identifier")

  public String getUid() {
    return uid;
  }


  public void setUid(String uid) {
    this.uid = uid;
  }


  public Document title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Document title
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Document title")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public Document types(List<String> types) {
    
    this.types = types;
    return this;
  }

  public Document addTypesItem(String typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<String>();
    }
    this.types.add(typesItem);
    return this;
  }

   /**
   * Document Types
   * @return types
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Document Types")

  public List<String> getTypes() {
    return types;
  }


  public void setTypes(List<String> types) {
    this.types = types;
  }


  public Document source(DocumentSource source) {
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DocumentSource getSource() {
    return source;
  }


  public void setSource(DocumentSource source) {
    this.source = source;
  }


  public Document names(DocumentNames names) {
    
    this.names = names;
    return this;
  }

   /**
   * Get names
   * @return names
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DocumentNames getNames() {
    return names;
  }


  public void setNames(DocumentNames names) {
    this.names = names;
  }


  public Document links(DocumentLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DocumentLinks getLinks() {
    return links;
  }


  public void setLinks(DocumentLinks links) {
    this.links = links;
  }


  public Document citations(List<DocumentCitations> citations) {
    
    this.citations = citations;
    return this;
  }

  public Document addCitationsItem(DocumentCitations citationsItem) {
    if (this.citations == null) {
      this.citations = new ArrayList<DocumentCitations>();
    }
    this.citations.add(citationsItem);
    return this;
  }

   /**
   * Times Cited
   * @return citations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Times Cited")

  public List<DocumentCitations> getCitations() {
    return citations;
  }


  public void setCitations(List<DocumentCitations> citations) {
    this.citations = citations;
  }


  public Document identifiers(DocumentIdentifiers identifiers) {
    
    this.identifiers = identifiers;
    return this;
  }

   /**
   * Get identifiers
   * @return identifiers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DocumentIdentifiers getIdentifiers() {
    return identifiers;
  }


  public void setIdentifiers(DocumentIdentifiers identifiers) {
    this.identifiers = identifiers;
  }


  public Document keywords(DocumentKeywords keywords) {
    
    this.keywords = keywords;
    return this;
  }

   /**
   * Get keywords
   * @return keywords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DocumentKeywords getKeywords() {
    return keywords;
  }


  public void setKeywords(DocumentKeywords keywords) {
    this.keywords = keywords;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Document document = (Document) o;
    return Objects.equals(this.uid, document.uid) &&
        Objects.equals(this.title, document.title) &&
        Objects.equals(this.types, document.types) &&
        Objects.equals(this.source, document.source) &&
        Objects.equals(this.names, document.names) &&
        Objects.equals(this.links, document.links) &&
        Objects.equals(this.citations, document.citations) &&
        Objects.equals(this.identifiers, document.identifiers) &&
        Objects.equals(this.keywords, document.keywords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uid, title, types, source, names, links, citations, identifiers, keywords);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Document {\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    citations: ").append(toIndentedString(citations)).append("\n");
    sb.append("    identifiers: ").append(toIndentedString(identifiers)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

