package com.example.newsagregate.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @JsonPropertyOrder({
            "url",
            "voice",
            "durationMs"
    })
    public class Reading {

        @JsonProperty("url")
        private String url;
        @JsonProperty("voice")
        private String voice;
        @JsonProperty("durationMs")
        private Integer durationMs;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        /**
         * No args constructor for use in serialization
         *
         */
        public Reading() {
        }

        /**
         *
         * @param voice
         * @param durationMs
         * @param url
         */
        public Reading(String url, String voice, Integer durationMs) {
            super();
            this.url = url;
            this.voice = voice;
            this.durationMs = durationMs;
        }

        @JsonProperty("url")
        public String getUrl() {
            return url;
        }

        @JsonProperty("url")
        public void setUrl(String url) {
            this.url = url;
        }

        @JsonProperty("voice")
        public String getVoice() {
            return voice;
        }

        @JsonProperty("voice")
        public void setVoice(String voice) {
            this.voice = voice;
        }

        @JsonProperty("durationMs")
        public Integer getDurationMs() {
            return durationMs;
        }

        @JsonProperty("durationMs")
        public void setDurationMs(Integer durationMs) {
            this.durationMs = durationMs;
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
            return new ToStringBuilder(this).append("url", url).append("voice", voice).append("durationMs", durationMs).append("additionalProperties", additionalProperties).toString();
        }

        @Override
        public int hashCode() {
            return new HashCodeBuilder().append(voice).append(additionalProperties).append(durationMs).append(url).toHashCode();
        }

        @Override
        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if ((other instanceof com.example.newsagregate.model.Reading) == false) {
                return false;
            }
            com.example.newsagregate.model.Reading rhs = ((com.example.newsagregate.model.Reading) other);
            return new EqualsBuilder().append(voice, rhs.voice).append(additionalProperties, rhs.additionalProperties).append(durationMs, rhs.durationMs).append(url, rhs.url).isEquals();
        }

    }


