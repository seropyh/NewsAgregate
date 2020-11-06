package com.example.newsagregate.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.platform.commons.util.ToStringBuilder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Setter


    public class BloombergNews {

        @JsonProperty("title")
        private String title;
        @JsonProperty("modules")
        private List <Module> modules = null;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();


        @Override
        public String toString() {
            return new ToStringBuilder(this).append("title", title).append("modules", modules).append("additionalProperties", additionalProperties).toString();
        }

        @Override
        public int hashCode() {
            return new HashCodeBuilder().append(additionalProperties).append(title).append(modules).toHashCode();
        }

        @Override
        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if ((other instanceof com.example.newsagregate.model.BloombergNews) == false) {
                return false;
            }
            com.example.newsagregate.model.BloombergNews rhs = ((com.example.newsagregate.model.BloombergNews) other);
            return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(title, rhs.title).append(modules, rhs.modules).isEquals();
        }

    }


