
package com.example.newsagregate.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import javax.management.Query;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "_type",
    "webSearchUrl",
    "name",
    "image",
    "isBreakingNews",
    "query",
    "newsSearchUrl"
})
public class FirstNewsValue {

    @JsonProperty("_type")
    private String type;
    @JsonProperty("webSearchUrl")
    private String webSearchUrl;
    @JsonProperty("name")
    private String name;
    @JsonProperty("image")
    private com.example.FirstNewsImage firstNewsImage;
    @JsonProperty("isBreakingNews")
    private Boolean isBreakingNews;
    @JsonProperty("query")
    private Query query;
    @JsonProperty("newsSearchUrl")
    private String newsSearchUrl;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public FirstNewsValue() {
    }

    /**
     * 
     * @param firstNewsImage
     * @param isBreakingNews
     * @param query
     * @param name
     * @param webSearchUrl
     * @param newsSearchUrl
     * @param type
     */
    public FirstNewsValue(String type, String webSearchUrl, String name, com.example.FirstNewsImage firstNewsImage, Boolean isBreakingNews, Query query, String newsSearchUrl) {
        super();
        this.type = type;
        this.webSearchUrl = webSearchUrl;
        this.name = name;
        this.firstNewsImage = firstNewsImage;
        this.isBreakingNews = isBreakingNews;
        this.query = query;
        this.newsSearchUrl = newsSearchUrl;
    }

    @JsonProperty("_type")
    public String getType() {
        return type;
    }

    @JsonProperty("_type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("webSearchUrl")
    public String getWebSearchUrl() {
        return webSearchUrl;
    }

    @JsonProperty("webSearchUrl")
    public void setWebSearchUrl(String webSearchUrl) {
        this.webSearchUrl = webSearchUrl;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("image")
    public com.example.FirstNewsImage getImage() {
        return firstNewsImage;
    }

    @JsonProperty("image")
    public void setImage(com.example.FirstNewsImage firstNewsImage) {
        this.firstNewsImage = firstNewsImage;
    }

    @JsonProperty("isBreakingNews")
    public Boolean getIsBreakingNews() {
        return isBreakingNews;
    }

    @JsonProperty("isBreakingNews")
    public void setIsBreakingNews(Boolean isBreakingNews) {
        this.isBreakingNews = isBreakingNews;
    }

    @JsonProperty("query")
    public Query getQuery() {
        return query;
    }

    @JsonProperty("query")
    public void setQuery(Query query) {
        this.query = query;
    }

    @JsonProperty("newsSearchUrl")
    public String getNewsSearchUrl() {
        return newsSearchUrl;
    }

    @JsonProperty("newsSearchUrl")
    public void setNewsSearchUrl(String newsSearchUrl) {
        this.newsSearchUrl = newsSearchUrl;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("type", type).append("webSearchUrl", webSearchUrl).append("name", name).append("image", firstNewsImage).append("isBreakingNews", isBreakingNews).append("query", query).append("newsSearchUrl", newsSearchUrl).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(firstNewsImage).append(isBreakingNews).append(query).append(name).append(webSearchUrl).append(newsSearchUrl).append(additionalProperties).append(type).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FirstNewsValue) == false) {
            return false;
        }
        FirstNewsValue rhs = ((FirstNewsValue) other);
        return new EqualsBuilder().append(firstNewsImage, rhs.firstNewsImage).append(isBreakingNews, rhs.isBreakingNews).append(query, rhs.query).append(name, rhs.name).append(webSearchUrl, rhs.webSearchUrl).append(newsSearchUrl, rhs.newsSearchUrl).append(additionalProperties, rhs.additionalProperties).append(type, rhs.type).isEquals();
    }

}
