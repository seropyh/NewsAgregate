package com.example.newsagregate.model;

    import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Setter
    @ToString
    public class BloomNews {

        @JsonProperty("title")
        private String title;
        @JsonProperty("published")
        private int published;
        @JsonProperty("shortURL")
        private String shortURL;
    }



