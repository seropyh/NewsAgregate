package com.example.newsagregate.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
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
    public class Module {

        @JsonProperty("id")
        private String id;
        @JsonProperty("title")
        private String title;
        @JsonProperty("type")
        private String type;
        @JsonProperty("stories")
        private List <Story> stories = null;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        /**
         * No args constructor for use in serialization
         *
         */


        /**
         *
         * @param stories
         * @param id
         * @param title
         * @param type
         */
        public Module(String id, String title, String type, List<Story> stories) {
            super();
            this.id = id;
            this.title = title;
            this.type = type;
            this.stories = stories;
        }

        @Override
        public String toString() {
            return new ToStringBuilder(this).append("id", id).append("title", title).append("type", type).append("stories", stories).append("additionalProperties", additionalProperties).toString();
        }

        @Override
        public int hashCode() {
            return new HashCodeBuilder().append(id).append(stories).append(additionalProperties).append(title).append(type).toHashCode();
        }

        @Override
        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if ((other instanceof com.example.newsagregate.model.Module) == false) {
                return false;
            }
            com.example.newsagregate.model.Module rhs = ((com.example.newsagregate.model.Module) other);
            return new EqualsBuilder().append(id, rhs.id).append(stories, rhs.stories).append(additionalProperties, rhs.additionalProperties).append(title, rhs.title).append(type, rhs.type).isEquals();
        }

    }


