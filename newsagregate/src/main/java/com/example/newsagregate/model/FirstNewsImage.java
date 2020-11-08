
package com.example;

import java.util.HashMap;
import java.util.List;
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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "_type",
    "url",
    "provider"
})
public class FirstNewsImage {

    @JsonProperty("_type")
    private String type;
    @JsonProperty("url")
    private String url;
    @JsonProperty("provider")
    private List<com.example.FirstNewsProvider> firstNewsProvider = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public FirstNewsImage() {
    }

    /**
     * 
     * @param firstNewsProvider
     * @param type
     * @param url
     */
    public FirstNewsImage(String type, String url, List<com.example.FirstNewsProvider> firstNewsProvider) {
        super();
        this.type = type;
        this.url = url;
        this.firstNewsProvider = firstNewsProvider;
    }

    @JsonProperty("_type")
    public String getType() {
        return type;
    }

    @JsonProperty("_type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("provider")
    public List<com.example.FirstNewsProvider> getProvider() {
        return firstNewsProvider;
    }

    @JsonProperty("provider")
    public void setProvider(List<com.example.FirstNewsProvider> firstNewsProvider) {
        this.firstNewsProvider = firstNewsProvider;
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
        return new ToStringBuilder(this).append("type", type).append("url", url).append("provider", firstNewsProvider).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(type).append(firstNewsProvider).append(url).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FirstNewsImage) == false) {
            return false;
        }
        FirstNewsImage rhs = ((FirstNewsImage) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(type, rhs.type).append(firstNewsProvider, rhs.firstNewsProvider).append(url, rhs.url).isEquals();
    }

}
