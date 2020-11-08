package com.example.newsagregate.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "url",
    "height",
    "width",
    "thumbnail",
    "thumbnailHeight",
    "thumbnailWidth",
    "base64Encoding",
    "name",
    "title",
    "provider",
    "imageWebSearchUrl",
    "webpageUrl"
})
public class ContextSearchImageNews {

    @JsonProperty("url")
    private String url;
    @JsonProperty("height")
    private Integer height;
    @JsonProperty("width")
    private Integer width;
    @JsonProperty("thumbnail")
    private String thumbnail;
    @JsonProperty("thumbnailHeight")
    private Integer thumbnailHeight;
    @JsonProperty("thumbnailWidth")
    private Integer thumbnailWidth;
    @JsonProperty("base64Encoding")
    private String base64Encoding;
    @JsonProperty("name")
    private Object name;
    @JsonProperty("title")
    private Object title;
    @JsonProperty("provider")
    private ContextSearchProvider1News provider;
    @JsonProperty("imageWebSearchUrl")
    private Object imageWebSearchUrl;
    @JsonProperty("webpageUrl")
    private String webpageUrl;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ContextSearchImageNews() {
    }

    /**
     * 
     * @param base64Encoding
     * @param imageWebSearchUrl
     * @param thumbnail
     * @param provider
     * @param width
     * @param name
     * @param thumbnailWidth
     * @param title
     * @param thumbnailHeight
     * @param webpageUrl
     * @param url
     * @param height
     */
    public ContextSearchImageNews(String url, Integer height, Integer width, String thumbnail, Integer thumbnailHeight, Integer thumbnailWidth, String base64Encoding, Object name, Object title, ContextSearchProvider1News provider, Object imageWebSearchUrl, String webpageUrl) {
        super();
        this.url = url;
        this.height = height;
        this.width = width;
        this.thumbnail = thumbnail;
        this.thumbnailHeight = thumbnailHeight;
        this.thumbnailWidth = thumbnailWidth;
        this.base64Encoding = base64Encoding;
        this.name = name;
        this.title = title;
        this.provider = provider;
        this.imageWebSearchUrl = imageWebSearchUrl;
        this.webpageUrl = webpageUrl;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("height")
    public Integer getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(Integer height) {
        this.height = height;
    }

    @JsonProperty("width")
    public Integer getWidth() {
        return width;
    }

    @JsonProperty("width")
    public void setWidth(Integer width) {
        this.width = width;
    }

    @JsonProperty("thumbnail")
    public String getThumbnail() {
        return thumbnail;
    }

    @JsonProperty("thumbnail")
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    @JsonProperty("thumbnailHeight")
    public Integer getThumbnailHeight() {
        return thumbnailHeight;
    }

    @JsonProperty("thumbnailHeight")
    public void setThumbnailHeight(Integer thumbnailHeight) {
        this.thumbnailHeight = thumbnailHeight;
    }

    @JsonProperty("thumbnailWidth")
    public Integer getThumbnailWidth() {
        return thumbnailWidth;
    }

    @JsonProperty("thumbnailWidth")
    public void setThumbnailWidth(Integer thumbnailWidth) {
        this.thumbnailWidth = thumbnailWidth;
    }

    @JsonProperty("base64Encoding")
    public String getBase64Encoding() {
        return base64Encoding;
    }

    @JsonProperty("base64Encoding")
    public void setBase64Encoding(String base64Encoding) {
        this.base64Encoding = base64Encoding;
    }

    @JsonProperty("name")
    public Object getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(Object name) {
        this.name = name;
    }

    @JsonProperty("title")
    public Object getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(Object title) {
        this.title = title;
    }

    @JsonProperty("provider")
    public ContextSearchProvider1News getProvider() {
        return provider;
    }

    @JsonProperty("provider")
    public void setProvider(ContextSearchProvider1News provider) {
        this.provider = provider;
    }

    @JsonProperty("imageWebSearchUrl")
    public Object getImageWebSearchUrl() {
        return imageWebSearchUrl;
    }

    @JsonProperty("imageWebSearchUrl")
    public void setImageWebSearchUrl(Object imageWebSearchUrl) {
        this.imageWebSearchUrl = imageWebSearchUrl;
    }

    @JsonProperty("webpageUrl")
    public String getWebpageUrl() {
        return webpageUrl;
    }

    @JsonProperty("webpageUrl")
    public void setWebpageUrl(String webpageUrl) {
        this.webpageUrl = webpageUrl;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("url", url).append("height", height).append("width", width).append("thumbnail", thumbnail).append("thumbnailHeight", thumbnailHeight).append("thumbnailWidth", thumbnailWidth).append("base64Encoding", base64Encoding).append("name", name).append("title", title).append("provider", provider).append("imageWebSearchUrl", imageWebSearchUrl).append("webpageUrl", webpageUrl).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(thumbnail).append(thumbnailWidth).append(title).append(url).append(base64Encoding).append(imageWebSearchUrl).append(provider).append(width).append(name).append(thumbnailHeight).append(webpageUrl).append(height).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ContextSearchImageNews) == false) {
            return false;
        }
        ContextSearchImageNews rhs = ((ContextSearchImageNews) other);
        return new EqualsBuilder().append(thumbnail, rhs.thumbnail).append(thumbnailWidth, rhs.thumbnailWidth).append(title, rhs.title).append(url, rhs.url).append(base64Encoding, rhs.base64Encoding).append(imageWebSearchUrl, rhs.imageWebSearchUrl).append(provider, rhs.provider).append(width, rhs.width).append(name, rhs.name).append(thumbnailHeight, rhs.thumbnailHeight).append(webpageUrl, rhs.webpageUrl).append(height, rhs.height).isEquals();
    }

}
