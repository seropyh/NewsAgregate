package com.example.newsagregate;

public class Greeting {

    private String title;
    private String content;

    public Greeting() {

    }

    public Greeting(String title, String content) {
        this.title = title;
        this.content = content;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
