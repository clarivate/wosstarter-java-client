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
import com.clarivate.wos.wos_api_starter_client.model.DocumentSourcePages;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Web of Science document source metadata
 */
@ApiModel(description = "Web of Science document source metadata")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-06T14:38:20.941+02:00[Europe/Paris]")
public class DocumentSource {
  public static final String SERIALIZED_NAME_SOURCE_TITLE = "sourceTitle";
  @SerializedName(SERIALIZED_NAME_SOURCE_TITLE)
  private String sourceTitle;

  public static final String SERIALIZED_NAME_PUBLISH_YEAR = "publishYear";
  @SerializedName(SERIALIZED_NAME_PUBLISH_YEAR)
  private Integer publishYear;

  public static final String SERIALIZED_NAME_PUBLISH_MONTH = "publishMonth";
  @SerializedName(SERIALIZED_NAME_PUBLISH_MONTH)
  private String publishMonth;

  public static final String SERIALIZED_NAME_VOLUME = "volume";
  @SerializedName(SERIALIZED_NAME_VOLUME)
  private String volume;

  public static final String SERIALIZED_NAME_ISSUE = "issue";
  @SerializedName(SERIALIZED_NAME_ISSUE)
  private String issue;

  public static final String SERIALIZED_NAME_SUPPLEMENT = "supplement";
  @SerializedName(SERIALIZED_NAME_SUPPLEMENT)
  private String supplement;

  public static final String SERIALIZED_NAME_SPECIAL_ISSUE = "specialIssue";
  @SerializedName(SERIALIZED_NAME_SPECIAL_ISSUE)
  private String specialIssue;

  public static final String SERIALIZED_NAME_ARTICLE_NUMBER = "articleNumber";
  @SerializedName(SERIALIZED_NAME_ARTICLE_NUMBER)
  private String articleNumber;

  public static final String SERIALIZED_NAME_PAGES = "pages";
  @SerializedName(SERIALIZED_NAME_PAGES)
  private DocumentSourcePages pages;

  public DocumentSource() { 
  }

  public DocumentSource sourceTitle(String sourceTitle) {
    
    this.sourceTitle = sourceTitle;
    return this;
  }

   /**
   * Source title
   * @return sourceTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Source title")

  public String getSourceTitle() {
    return sourceTitle;
  }


  public void setSourceTitle(String sourceTitle) {
    this.sourceTitle = sourceTitle;
  }


  public DocumentSource publishYear(Integer publishYear) {
    
    this.publishYear = publishYear;
    return this;
  }

   /**
   * Published Year
   * @return publishYear
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Published Year")

  public Integer getPublishYear() {
    return publishYear;
  }


  public void setPublishYear(Integer publishYear) {
    this.publishYear = publishYear;
  }


  public DocumentSource publishMonth(String publishMonth) {
    
    this.publishMonth = publishMonth;
    return this;
  }

   /**
   * Published Month
   * @return publishMonth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Published Month")

  public String getPublishMonth() {
    return publishMonth;
  }


  public void setPublishMonth(String publishMonth) {
    this.publishMonth = publishMonth;
  }


  public DocumentSource volume(String volume) {
    
    this.volume = volume;
    return this;
  }

   /**
   * Volume
   * @return volume
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Volume")

  public String getVolume() {
    return volume;
  }


  public void setVolume(String volume) {
    this.volume = volume;
  }


  public DocumentSource issue(String issue) {
    
    this.issue = issue;
    return this;
  }

   /**
   * Issue
   * @return issue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Issue")

  public String getIssue() {
    return issue;
  }


  public void setIssue(String issue) {
    this.issue = issue;
  }


  public DocumentSource supplement(String supplement) {
    
    this.supplement = supplement;
    return this;
  }

   /**
   * Journal supplement
   * @return supplement
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Journal supplement")

  public String getSupplement() {
    return supplement;
  }


  public void setSupplement(String supplement) {
    this.supplement = supplement;
  }


  public DocumentSource specialIssue(String specialIssue) {
    
    this.specialIssue = specialIssue;
    return this;
  }

   /**
   * Journal special issue
   * @return specialIssue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Journal special issue")

  public String getSpecialIssue() {
    return specialIssue;
  }


  public void setSpecialIssue(String specialIssue) {
    this.specialIssue = specialIssue;
  }


  public DocumentSource articleNumber(String articleNumber) {
    
    this.articleNumber = articleNumber;
    return this;
  }

   /**
   * Source Article Number
   * @return articleNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Source Article Number")

  public String getArticleNumber() {
    return articleNumber;
  }


  public void setArticleNumber(String articleNumber) {
    this.articleNumber = articleNumber;
  }


  public DocumentSource pages(DocumentSourcePages pages) {
    
    this.pages = pages;
    return this;
  }

   /**
   * Get pages
   * @return pages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DocumentSourcePages getPages() {
    return pages;
  }


  public void setPages(DocumentSourcePages pages) {
    this.pages = pages;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentSource documentSource = (DocumentSource) o;
    return Objects.equals(this.sourceTitle, documentSource.sourceTitle) &&
        Objects.equals(this.publishYear, documentSource.publishYear) &&
        Objects.equals(this.publishMonth, documentSource.publishMonth) &&
        Objects.equals(this.volume, documentSource.volume) &&
        Objects.equals(this.issue, documentSource.issue) &&
        Objects.equals(this.supplement, documentSource.supplement) &&
        Objects.equals(this.specialIssue, documentSource.specialIssue) &&
        Objects.equals(this.articleNumber, documentSource.articleNumber) &&
        Objects.equals(this.pages, documentSource.pages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceTitle, publishYear, publishMonth, volume, issue, supplement, specialIssue, articleNumber, pages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentSource {\n");
    sb.append("    sourceTitle: ").append(toIndentedString(sourceTitle)).append("\n");
    sb.append("    publishYear: ").append(toIndentedString(publishYear)).append("\n");
    sb.append("    publishMonth: ").append(toIndentedString(publishMonth)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    issue: ").append(toIndentedString(issue)).append("\n");
    sb.append("    supplement: ").append(toIndentedString(supplement)).append("\n");
    sb.append("    specialIssue: ").append(toIndentedString(specialIssue)).append("\n");
    sb.append("    articleNumber: ").append(toIndentedString(articleNumber)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
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

