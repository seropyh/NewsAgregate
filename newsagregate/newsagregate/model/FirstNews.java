
package com.example.newsagregate.model;

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
import lombok.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "_type",
    "value"
})

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class FirstNews {

    @JsonProperty("_type")
    private String type;
    @JsonProperty("value")
    private List<FirstNewsValue> firstNewsValue = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("type", type).append("value", firstNewsValue).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(type).append(firstNewsValue).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FirstNews) == false) {
            return false;
        }
        FirstNews rhs = ((FirstNews) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(type, rhs.type).append(firstNewsValue, rhs.firstNewsValue).isEquals();
    }

    public List<FirstNewsValue> getFirstNewsValue() {
        return firstNewsValue;
    }
}
