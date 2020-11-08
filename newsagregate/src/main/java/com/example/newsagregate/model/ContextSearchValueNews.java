
package com.example.newsagregate.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import javax.xml.ws.Provider;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "title",
    "url",
    "description",
    "body",
    "keywords",
    "language",
    "isSafe",
    "datePublished",
    "provider",
    "image"
})
public class ContextSearchValueNews {

    @JsonProperty("id")
    private String id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("url")
    private String url;
    @JsonProperty("description")
    private String description;
    @JsonProperty("body")
    private String body;
    @JsonProperty("keywords")
    private String keywords;
    @JsonProperty("language")
    private String language;
    @JsonProperty("isSafe")
    private Boolean isSafe;
    @JsonProperty("datePublished")
    private String datePublished;
 //   @JsonProperty("provider")
 //   private Provider provider;
    @JsonProperty("image")
    private ContextSearchImageNews contextSearchImageNews;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ContextSearchValueNews() {
    }

    /**
     * 
     * @param datePublished
     * @param contextSearchImageNews
     * @param keywords
     * @param provider
     * @param description
     * @param language
     * @param id
     * @param title
     * @param body
     * @param url
     * @param isSafe
     */
    public ContextSearchValueNews(String id, String title, String url, String description, String body, String keywords, String language, Boolean isSafe, String datePublished, /*Provider provider, */ContextSearchImageNews contextSearchImageNews) {
        super();
        this.id = id;
        this.title = title;
        this.url = url;
        this.description = description;
        this.body = body;
        this.keywords = keywords;
        this.language = language;
        this.isSafe = isSafe;
        this.datePublished = datePublished;
  //      this.provider = provider;
        this.contextSearchImageNews = contextSearchImageNews;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("body")
    public String getBody() {
        return body;
    }

    @JsonProperty("body")
    public void setBody(String body) {
        this.body = body;
    }

    @JsonProperty("keywords")
    public String getKeywords() {
        return keywords;
    }

    @JsonProperty("keywords")
    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    @JsonProperty("isSafe")
    public Boolean getIsSafe() {
        return isSafe;
    }

    @JsonProperty("isSafe")
    public void setIsSafe(Boolean isSafe) {
        this.isSafe = isSafe;
    }

    @JsonProperty("datePublished")
    public String getDatePublished() {
        return datePublished;
    }

    @JsonProperty("datePublished")
    public void setDatePublished(String datePublished) {
        this.datePublished = datePublished;
    }
/*
    @JsonProperty("provider")
    public Provider getProvider() {
        return provider;
    }

    @JsonProperty("provider")
    public void setProvider(Provider provider) {
        this.provider = provider;
    }
*/
    @JsonProperty("image")
    public ContextSearchImageNews getImage() {
        return contextSearchImageNews;
    }

    @JsonProperty("image")
    public void setImage(ContextSearchImageNews contextSearchImageNews) {
        this.contextSearchImageNews = contextSearchImageNews;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("title", title).append("url", url).append("description", description).append("body", body).append("keywords", keywords).append("language", language).append("isSafe", isSafe).append("datePublished", datePublished)/*.append("provider", provider)*/.append("image", contextSearchImageNews).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(datePublished).append(contextSearchImageNews).append(keywords)./*append(provider).*/append(description).append(language).append(id).append(title).append(body).append(url).append(isSafe).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ContextSearchValueNews) == false) {
            return false;
        }
        ContextSearchValueNews rhs = ((ContextSearchValueNews) other);
        return new EqualsBuilder().append(datePublished, rhs.datePublished).append(contextSearchImageNews, rhs.contextSearchImageNews).append(keywords, rhs.keywords)./*append(provider, rhs.provider). */append(description, rhs.description).append(language, rhs.language).append(id, rhs.id).append(title, rhs.title).append(body, rhs.body).append(url, rhs.url).append(isSafe, rhs.isSafe).isEquals();
    }

}
