
package com.example.newsagregate.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "_type",
    "didUMean",
    "totalCount",
    "relatedSearch",
    "value"
})
public class ContextSearchNews {

    @JsonProperty("_type")
    private String type;
    @JsonProperty("didUMean")
    private String didUMean;
    @JsonProperty("totalCount")
    private Integer totalCount;
    @JsonProperty("relatedSearch")
    private List<Object> relatedSearch = null;
    @JsonProperty("value")
    private List<ContextSearchValueNews> contextSearchValueNews = null;


    @Override
    public String toString() {
        return new ToStringBuilder(this).append("type", type).append("didUMean", didUMean).append("totalCount", totalCount).append("relatedSearch", relatedSearch).append("value", contextSearchValueNews).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(didUMean).append(type).append(totalCount).append(contextSearchValueNews).append(relatedSearch).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ContextSearchNews) == false) {
            return false;
        }
        ContextSearchNews rhs = ((ContextSearchNews) other);
        return new EqualsBuilder().append(didUMean, rhs.didUMean).append(type, rhs.type).append(totalCount, rhs.totalCount).append(contextSearchValueNews, rhs.contextSearchValueNews).append(relatedSearch, rhs.relatedSearch).isEquals();
    }

}
