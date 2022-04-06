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
import com.clarivate.wos.wos_api_starter_client.model.JournalLinks;
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
 * Journal
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-06T14:38:20.941+02:00[Europe/Paris]")
public class Journal {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_JCR_TITLE = "jcrTitle";
  @SerializedName(SERIALIZED_NAME_JCR_TITLE)
  private String jcrTitle;

  public static final String SERIALIZED_NAME_ISO_TITLE = "isoTitle";
  @SerializedName(SERIALIZED_NAME_ISO_TITLE)
  private String isoTitle;

  public static final String SERIALIZED_NAME_ISSN = "issn";
  @SerializedName(SERIALIZED_NAME_ISSN)
  private String issn;

  public static final String SERIALIZED_NAME_PREVIOUS_ISSN = "previousIssn";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_ISSN)
  private List<String> previousIssn = null;

  public static final String SERIALIZED_NAME_E_ISSN = "eIssn";
  @SerializedName(SERIALIZED_NAME_E_ISSN)
  private String eIssn;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<JournalLinks> links = null;

  public Journal() { 
  }

  public Journal id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Journal unique identifier
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Journal unique identifier")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Journal name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Journal full name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Journal full name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Journal jcrTitle(String jcrTitle) {
    
    this.jcrTitle = jcrTitle;
    return this;
  }

   /**
   * Journal JCR abbreviation
   * @return jcrTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Journal JCR abbreviation")

  public String getJcrTitle() {
    return jcrTitle;
  }


  public void setJcrTitle(String jcrTitle) {
    this.jcrTitle = jcrTitle;
  }


  public Journal isoTitle(String isoTitle) {
    
    this.isoTitle = isoTitle;
    return this;
  }

   /**
   * Journal title in (ISO format)
   * @return isoTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Journal title in (ISO format)")

  public String getIsoTitle() {
    return isoTitle;
  }


  public void setIsoTitle(String isoTitle) {
    this.isoTitle = isoTitle;
  }


  public Journal issn(String issn) {
    
    this.issn = issn;
    return this;
  }

   /**
   * Journal ISSN
   * @return issn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Journal ISSN")

  public String getIssn() {
    return issn;
  }


  public void setIssn(String issn) {
    this.issn = issn;
  }


  public Journal previousIssn(List<String> previousIssn) {
    
    this.previousIssn = previousIssn;
    return this;
  }

  public Journal addPreviousIssnItem(String previousIssnItem) {
    if (this.previousIssn == null) {
      this.previousIssn = new ArrayList<String>();
    }
    this.previousIssn.add(previousIssnItem);
    return this;
  }

   /**
   * Previous ISSNs of the Journal (can be empty)
   * @return previousIssn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Previous ISSNs of the Journal (can be empty)")

  public List<String> getPreviousIssn() {
    return previousIssn;
  }


  public void setPreviousIssn(List<String> previousIssn) {
    this.previousIssn = previousIssn;
  }


  public Journal eIssn(String eIssn) {
    
    this.eIssn = eIssn;
    return this;
  }

   /**
   * Journal eISSN
   * @return eIssn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Journal eISSN")

  public String geteIssn() {
    return eIssn;
  }


  public void seteIssn(String eIssn) {
    this.eIssn = eIssn;
  }


  public Journal links(List<JournalLinks> links) {
    
    this.links = links;
    return this;
  }

  public Journal addLinksItem(JournalLinks linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<JournalLinks>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * URL to the Web of Science Products
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL to the Web of Science Products")

  public List<JournalLinks> getLinks() {
    return links;
  }


  public void setLinks(List<JournalLinks> links) {
    this.links = links;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Journal journal = (Journal) o;
    return Objects.equals(this.id, journal.id) &&
        Objects.equals(this.name, journal.name) &&
        Objects.equals(this.jcrTitle, journal.jcrTitle) &&
        Objects.equals(this.isoTitle, journal.isoTitle) &&
        Objects.equals(this.issn, journal.issn) &&
        Objects.equals(this.previousIssn, journal.previousIssn) &&
        Objects.equals(this.eIssn, journal.eIssn) &&
        Objects.equals(this.links, journal.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, jcrTitle, isoTitle, issn, previousIssn, eIssn, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Journal {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    jcrTitle: ").append(toIndentedString(jcrTitle)).append("\n");
    sb.append("    isoTitle: ").append(toIndentedString(isoTitle)).append("\n");
    sb.append("    issn: ").append(toIndentedString(issn)).append("\n");
    sb.append("    previousIssn: ").append(toIndentedString(previousIssn)).append("\n");
    sb.append("    eIssn: ").append(toIndentedString(eIssn)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

