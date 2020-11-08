package com.example.newsagregate.controller;

import com.example.newsagregate.model.BloomNews;
import com.example.newsagregate.model.BloombergNews;
import com.example.newsagregate.model.ContextSearchNews;
import com.example.newsagregate.model.FirstNews;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.ArrayList;
import java.util.Date;

@Controller
    public class NewsPostBloombergNewsController {
        @GetMapping("/")
        public String getNewsBloomberg(Model model) throws IOException, InterruptedException, URISyntaxException {
            // API 1
            var client = HttpClient.newHttpClient();
            var request = HttpRequest.newBuilder().version(Version.HTTP_1_1).GET().uri(new
                    URI("https://rapidapi.p.rapidapi.com/news/list?id=markets"))
                    .header("x-rapidapi-key", "164fb594f9msha15efc315bdf58ep16d1c2jsnf94b0b48879f")
                    .header("x-rapidapi-host", "bloomberg-market-and-financial-news.p.rapidapi.com")
                    .build();
            var response = client.send(request, BodyHandlers.ofString());

            var retString = (String) response.body();
            var objectMapper = new ObjectMapper();
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);


            var bloombergNews = objectMapper.readValue(retString, BloombergNews.class);

            var news = new ArrayList <BloomNews>();//<BloombergNews>();
            for (var entry : bloombergNews.getModules()) {
                // System.out.println(entry.getValue().getShareImageUrl());
                for (var myNews : entry.getStories()) {
                    news.add(new BloomNews(myNews.getTitle(), myNews.getPublished() ,myNews.getShortURL()));
                }
            }
            //API 2
            HttpClient client2 = HttpClient.newHttpClient();
                HttpRequest request2 = HttpRequest.newBuilder().version(Version.HTTP_1_1).GET().uri(new URI("https://bing-news-search1.p.rapidapi.com/news/trendingtopics?textFormat=Raw&safeSearch=Off")).header("x-rapidapi-host", "bing-news-search1.p.rapidapi.com").header("x-rapidapi-key", "164fb594f9msha15efc315bdf58ep16d1c2jsnf94b0b48879f").header("x-bingapis-sdk", "true").build();
                HttpResponse<String> response2 = client.send(request2, BodyHandlers.ofString());
            var retString2 = (String) response2.body();
            var objectMapper2 = new ObjectMapper();

            objectMapper2.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            var firstNews = objectMapper2.readValue(retString2, FirstNews.class);
            long sysdate = new Date().getTime();
            for (var entry : firstNews.getFirstNewsValue()) {
                news.add(new BloomNews(entry.getName(),sysdate,entry.getNewsSearchUrl()));
            }

            // API 3
            HttpClient client3 = HttpClient.newHttpClient();
            HttpRequest request3 = HttpRequest.newBuilder().version(Version.HTTP_1_1).GET().uri(new
                    URI("https://rapidapi.p.rapidapi.com/api/search/NewsSearchAPI?pageSize=10&q=taylor%20swift&autoCorrect=true&pageNumber=1&toPublishedDate=null&fromPublishedDate=null"))
                    .header("x-rapidapi-key", "164fb594f9msha15efc315bdf58ep16d1c2jsnf94b0b48879f")
                    .header("x-rapidapi-host", "contextualwebsearch-websearch-v1.p.rapidapi.com")
                    .build();
            HttpResponse<String> response3 = client.send(request3, BodyHandlers.ofString());
            var retString3 = (String) response3.body();
            var objectMapper3 = new ObjectMapper();
            objectMapper3.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            var contextNews = objectMapper3.readValue(retString3, ContextSearchNews.class);


            for (var entry : contextNews.getContextSearchValueNews()){
                news.add(new BloomNews(entry.getTitle(),sysdate, entry.getUrl()));
            }





            model.addAttribute("Story", news);
            return "NewsBloomberg";
        }

    }

