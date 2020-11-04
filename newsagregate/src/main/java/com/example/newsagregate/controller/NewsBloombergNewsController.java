package com.example.newsagregate.controller;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpClient.Version;
import java.net.http.HttpResponse.BodyHandlers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewsBloombergNewsController {
    @GetMapping("/newsbl")
    public String getNews() throws IOException, InterruptedException, URISyntaxException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().version(Version.HTTP_1_1).GET().uri(new
                URI("https://rapidapi.p.rapidapi.com/news/list?id=markets"))
                .header("x-rapidapi-key", "164fb594f9msha15efc315bdf58ep16d1c2jsnf94b0b48879f")
                .header("x-rapidapi-host", "bloomberg-market-and-financial-news.p.rapidapi.com")

                .build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        return (String) response.body();
    }

}
