package com.example.newsagregate.controller;

import com.example.newsagregate.model.BloomNews;
import com.example.newsagregate.model.BloombergNews;
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
import java.net.http.HttpResponse.BodyHandlers;
import java.util.ArrayList;
@Controller
    public class NewsPostBloombergNewsController {
        @GetMapping("/")
        public String getNewsBloomberg(Model model) throws IOException, InterruptedException, URISyntaxException {
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
        /*var bloombergNews = objectMapper.readValue(retString, BloombergNews.class);
        //return bloombergNews.toString();
        //return retString;
       // var myNews = new
        var news = new ArrayList <BloomNews>();//<BloombergNews>();
        for (var entry : bloombergNews.getModules().entrySet()) {
           // System.out.println(entry.getValue().getShareImageUrl());

            news.add(new BloomNews(entry.getValue().getTitle(), 100 ,entry.getValue().getType()));
        }

         */
        /* Исключение  Nullpointer в 54
        var bloombergNews = objectMapper.readValue(retString, Module.class);

        var news = new ArrayList <BloomNews>();//<BloombergNews>();
        for (var entry : bloombergNews.getStories().entrySet() ) {
           // System.out.println(entry.getValue().getShareImageUrl());

            news.add(new BloomNews(entry.getValue().getTitle(), entry.getValue().getPublished() ,entry.getValue().getShortURL()));
        }
        ;/
         */

            var bloombergNews = objectMapper.readValue(retString, BloombergNews.class);

            var news = new ArrayList <BloomNews>();//<BloombergNews>();
            for (var entry : bloombergNews.getModules()) {
                // System.out.println(entry.getValue().getShareImageUrl());
                for (var myNews : entry.getStories()) {
                    news.add(new BloomNews(myNews.getTitle(), myNews.getPublished() ,myNews.getShortURL()));
                }
            }
            model.addAttribute("Story", news);
            return "NewsBloomberg";
        }

    }

