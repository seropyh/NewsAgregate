package com.example.newsagregate.model;


import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
//import org.codehaus.jackson.annotate.JsonIgnore;
//import org.codehaus.jackson.annotate.JsonProperty;
//import org.codehaus.jackson.annotate.JsonPropertyOrder;
//import org.codehaus.jackson.map.annotate.JsonSerialize;

    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @JsonPropertyOrder({
            "id",
            "type"
    })
    public class ContentTag {

        @JsonProperty("id")
        private String id;
        @JsonProperty("type")
        private String type;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        /**
         * No args constructor for use in serialization
         *
         */
        public ContentTag() {
        }

        /**
         *
         * @param id
         * @param type
         */
        public ContentTag(String id, String type) {
            super();
            this.id = id;
            this.type = type;
        }

        @JsonProperty("id")
        public String getId() {
            return id;
        }

        @JsonProperty("id")
        public void setId(String id) {
            this.id = id;
        }

        @JsonProperty("type")
        public String getType() {
            return type;
        }

        @JsonProperty("type")
        public void setType(String type) {
            this.type = type;
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
            return new ToStringBuilder(this).append("id", id).append("type", type).append("additionalProperties", additionalProperties).toString();
        }

        @Override
        public int hashCode() {
            return new HashCodeBuilder().append(id).append(additionalProperties).append(type).toHashCode();
        }

        @Override
        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if ((other instanceof com.example.newsagregate.model.ContentTag) == false) {
                return false;
            }
            com.example.newsagregate.model.ContentTag rhs = ((com.example.newsagregate.model.ContentTag) other);
            return new EqualsBuilder().append(id, rhs.id).append(additionalProperties, rhs.additionalProperties).append(type, rhs.type).isEquals();
        }

    }


