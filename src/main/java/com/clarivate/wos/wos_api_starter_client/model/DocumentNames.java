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
import com.clarivate.wos.wos_api_starter_client.model.AuthorName;
import com.clarivate.wos.wos_api_starter_client.model.OtherName;
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
 * DocumentNames
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-06T14:38:20.941+02:00[Europe/Paris]")
public class DocumentNames {
  public static final String SERIALIZED_NAME_AUTHORS = "authors";
  @SerializedName(SERIALIZED_NAME_AUTHORS)
  private List<AuthorName> authors = null;

  public static final String SERIALIZED_NAME_INVENTORS = "inventors";
  @SerializedName(SERIALIZED_NAME_INVENTORS)
  private List<OtherName> inventors = null;

  public static final String SERIALIZED_NAME_BOOK_CORP = "bookCorp";
  @SerializedName(SERIALIZED_NAME_BOOK_CORP)
  private List<OtherName> bookCorp = null;

  public static final String SERIALIZED_NAME_BOOK_EDITORS = "bookEditors";
  @SerializedName(SERIALIZED_NAME_BOOK_EDITORS)
  private List<OtherName> bookEditors = null;

  public static final String SERIALIZED_NAME_BOOKS = "books";
  @SerializedName(SERIALIZED_NAME_BOOKS)
  private List<OtherName> books = null;

  public static final String SERIALIZED_NAME_ADDITIONAL_AUTHORS = "additionalAuthors";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_AUTHORS)
  private List<OtherName> additionalAuthors = null;

  public static final String SERIALIZED_NAME_ANONYMOUS = "anonymous";
  @SerializedName(SERIALIZED_NAME_ANONYMOUS)
  private List<OtherName> anonymous = null;

  public static final String SERIALIZED_NAME_ASSIGNEES = "assignees";
  @SerializedName(SERIALIZED_NAME_ASSIGNEES)
  private List<OtherName> assignees = null;

  public static final String SERIALIZED_NAME_CORP = "corp";
  @SerializedName(SERIALIZED_NAME_CORP)
  private List<OtherName> corp = null;

  public static final String SERIALIZED_NAME_EDITORS = "editors";
  @SerializedName(SERIALIZED_NAME_EDITORS)
  private List<OtherName> editors = null;

  public static final String SERIALIZED_NAME_INVESTIGATORS = "investigators";
  @SerializedName(SERIALIZED_NAME_INVESTIGATORS)
  private List<OtherName> investigators = null;

  public static final String SERIALIZED_NAME_SPONSORS = "sponsors";
  @SerializedName(SERIALIZED_NAME_SPONSORS)
  private List<OtherName> sponsors = null;

  public static final String SERIALIZED_NAME_ISSUING_ORGANIZATIONS = "issuingOrganizations";
  @SerializedName(SERIALIZED_NAME_ISSUING_ORGANIZATIONS)
  private List<OtherName> issuingOrganizations = null;

  public DocumentNames() { 
  }

  public DocumentNames authors(List<AuthorName> authors) {
    
    this.authors = authors;
    return this;
  }

  public DocumentNames addAuthorsItem(AuthorName authorsItem) {
    if (this.authors == null) {
      this.authors = new ArrayList<AuthorName>();
    }
    this.authors.add(authorsItem);
    return this;
  }

   /**
   * Authors of document
   * @return authors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Authors of document")

  public List<AuthorName> getAuthors() {
    return authors;
  }


  public void setAuthors(List<AuthorName> authors) {
    this.authors = authors;
  }


  public DocumentNames inventors(List<OtherName> inventors) {
    
    this.inventors = inventors;
    return this;
  }

  public DocumentNames addInventorsItem(OtherName inventorsItem) {
    if (this.inventors == null) {
      this.inventors = new ArrayList<OtherName>();
    }
    this.inventors.add(inventorsItem);
    return this;
  }

   /**
   * Get inventors
   * @return inventors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<OtherName> getInventors() {
    return inventors;
  }


  public void setInventors(List<OtherName> inventors) {
    this.inventors = inventors;
  }


  public DocumentNames bookCorp(List<OtherName> bookCorp) {
    
    this.bookCorp = bookCorp;
    return this;
  }

  public DocumentNames addBookCorpItem(OtherName bookCorpItem) {
    if (this.bookCorp == null) {
      this.bookCorp = new ArrayList<OtherName>();
    }
    this.bookCorp.add(bookCorpItem);
    return this;
  }

   /**
   * Get bookCorp
   * @return bookCorp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<OtherName> getBookCorp() {
    return bookCorp;
  }


  public void setBookCorp(List<OtherName> bookCorp) {
    this.bookCorp = bookCorp;
  }


  public DocumentNames bookEditors(List<OtherName> bookEditors) {
    
    this.bookEditors = bookEditors;
    return this;
  }

  public DocumentNames addBookEditorsItem(OtherName bookEditorsItem) {
    if (this.bookEditors == null) {
      this.bookEditors = new ArrayList<OtherName>();
    }
    this.bookEditors.add(bookEditorsItem);
    return this;
  }

   /**
   * Get bookEditors
   * @return bookEditors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<OtherName> getBookEditors() {
    return bookEditors;
  }


  public void setBookEditors(List<OtherName> bookEditors) {
    this.bookEditors = bookEditors;
  }


  public DocumentNames books(List<OtherName> books) {
    
    this.books = books;
    return this;
  }

  public DocumentNames addBooksItem(OtherName booksItem) {
    if (this.books == null) {
      this.books = new ArrayList<OtherName>();
    }
    this.books.add(booksItem);
    return this;
  }

   /**
   * Get books
   * @return books
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<OtherName> getBooks() {
    return books;
  }


  public void setBooks(List<OtherName> books) {
    this.books = books;
  }


  public DocumentNames additionalAuthors(List<OtherName> additionalAuthors) {
    
    this.additionalAuthors = additionalAuthors;
    return this;
  }

  public DocumentNames addAdditionalAuthorsItem(OtherName additionalAuthorsItem) {
    if (this.additionalAuthors == null) {
      this.additionalAuthors = new ArrayList<OtherName>();
    }
    this.additionalAuthors.add(additionalAuthorsItem);
    return this;
  }

   /**
   * Get additionalAuthors
   * @return additionalAuthors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<OtherName> getAdditionalAuthors() {
    return additionalAuthors;
  }


  public void setAdditionalAuthors(List<OtherName> additionalAuthors) {
    this.additionalAuthors = additionalAuthors;
  }


  public DocumentNames anonymous(List<OtherName> anonymous) {
    
    this.anonymous = anonymous;
    return this;
  }

  public DocumentNames addAnonymousItem(OtherName anonymousItem) {
    if (this.anonymous == null) {
      this.anonymous = new ArrayList<OtherName>();
    }
    this.anonymous.add(anonymousItem);
    return this;
  }

   /**
   * Get anonymous
   * @return anonymous
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<OtherName> getAnonymous() {
    return anonymous;
  }


  public void setAnonymous(List<OtherName> anonymous) {
    this.anonymous = anonymous;
  }


  public DocumentNames assignees(List<OtherName> assignees) {
    
    this.assignees = assignees;
    return this;
  }

  public DocumentNames addAssigneesItem(OtherName assigneesItem) {
    if (this.assignees == null) {
      this.assignees = new ArrayList<OtherName>();
    }
    this.assignees.add(assigneesItem);
    return this;
  }

   /**
   * Get assignees
   * @return assignees
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<OtherName> getAssignees() {
    return assignees;
  }


  public void setAssignees(List<OtherName> assignees) {
    this.assignees = assignees;
  }


  public DocumentNames corp(List<OtherName> corp) {
    
    this.corp = corp;
    return this;
  }

  public DocumentNames addCorpItem(OtherName corpItem) {
    if (this.corp == null) {
      this.corp = new ArrayList<OtherName>();
    }
    this.corp.add(corpItem);
    return this;
  }

   /**
   * Get corp
   * @return corp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<OtherName> getCorp() {
    return corp;
  }


  public void setCorp(List<OtherName> corp) {
    this.corp = corp;
  }


  public DocumentNames editors(List<OtherName> editors) {
    
    this.editors = editors;
    return this;
  }

  public DocumentNames addEditorsItem(OtherName editorsItem) {
    if (this.editors == null) {
      this.editors = new ArrayList<OtherName>();
    }
    this.editors.add(editorsItem);
    return this;
  }

   /**
   * Get editors
   * @return editors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<OtherName> getEditors() {
    return editors;
  }


  public void setEditors(List<OtherName> editors) {
    this.editors = editors;
  }


  public DocumentNames investigators(List<OtherName> investigators) {
    
    this.investigators = investigators;
    return this;
  }

  public DocumentNames addInvestigatorsItem(OtherName investigatorsItem) {
    if (this.investigators == null) {
      this.investigators = new ArrayList<OtherName>();
    }
    this.investigators.add(investigatorsItem);
    return this;
  }

   /**
   * Get investigators
   * @return investigators
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<OtherName> getInvestigators() {
    return investigators;
  }


  public void setInvestigators(List<OtherName> investigators) {
    this.investigators = investigators;
  }


  public DocumentNames sponsors(List<OtherName> sponsors) {
    
    this.sponsors = sponsors;
    return this;
  }

  public DocumentNames addSponsorsItem(OtherName sponsorsItem) {
    if (this.sponsors == null) {
      this.sponsors = new ArrayList<OtherName>();
    }
    this.sponsors.add(sponsorsItem);
    return this;
  }

   /**
   * Get sponsors
   * @return sponsors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<OtherName> getSponsors() {
    return sponsors;
  }


  public void setSponsors(List<OtherName> sponsors) {
    this.sponsors = sponsors;
  }


  public DocumentNames issuingOrganizations(List<OtherName> issuingOrganizations) {
    
    this.issuingOrganizations = issuingOrganizations;
    return this;
  }

  public DocumentNames addIssuingOrganizationsItem(OtherName issuingOrganizationsItem) {
    if (this.issuingOrganizations == null) {
      this.issuingOrganizations = new ArrayList<OtherName>();
    }
    this.issuingOrganizations.add(issuingOrganizationsItem);
    return this;
  }

   /**
   * Get issuingOrganizations
   * @return issuingOrganizations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<OtherName> getIssuingOrganizations() {
    return issuingOrganizations;
  }


  public void setIssuingOrganizations(List<OtherName> issuingOrganizations) {
    this.issuingOrganizations = issuingOrganizations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentNames documentNames = (DocumentNames) o;
    return Objects.equals(this.authors, documentNames.authors) &&
        Objects.equals(this.inventors, documentNames.inventors) &&
        Objects.equals(this.bookCorp, documentNames.bookCorp) &&
        Objects.equals(this.bookEditors, documentNames.bookEditors) &&
        Objects.equals(this.books, documentNames.books) &&
        Objects.equals(this.additionalAuthors, documentNames.additionalAuthors) &&
        Objects.equals(this.anonymous, documentNames.anonymous) &&
        Objects.equals(this.assignees, documentNames.assignees) &&
        Objects.equals(this.corp, documentNames.corp) &&
        Objects.equals(this.editors, documentNames.editors) &&
        Objects.equals(this.investigators, documentNames.investigators) &&
        Objects.equals(this.sponsors, documentNames.sponsors) &&
        Objects.equals(this.issuingOrganizations, documentNames.issuingOrganizations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authors, inventors, bookCorp, bookEditors, books, additionalAuthors, anonymous, assignees, corp, editors, investigators, sponsors, issuingOrganizations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentNames {\n");
    sb.append("    authors: ").append(toIndentedString(authors)).append("\n");
    sb.append("    inventors: ").append(toIndentedString(inventors)).append("\n");
    sb.append("    bookCorp: ").append(toIndentedString(bookCorp)).append("\n");
    sb.append("    bookEditors: ").append(toIndentedString(bookEditors)).append("\n");
    sb.append("    books: ").append(toIndentedString(books)).append("\n");
    sb.append("    additionalAuthors: ").append(toIndentedString(additionalAuthors)).append("\n");
    sb.append("    anonymous: ").append(toIndentedString(anonymous)).append("\n");
    sb.append("    assignees: ").append(toIndentedString(assignees)).append("\n");
    sb.append("    corp: ").append(toIndentedString(corp)).append("\n");
    sb.append("    editors: ").append(toIndentedString(editors)).append("\n");
    sb.append("    investigators: ").append(toIndentedString(investigators)).append("\n");
    sb.append("    sponsors: ").append(toIndentedString(sponsors)).append("\n");
    sb.append("    issuingOrganizations: ").append(toIndentedString(issuingOrganizations)).append("\n");
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

