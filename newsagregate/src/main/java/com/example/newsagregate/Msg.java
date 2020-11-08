package com.example.newsagregate;


public class Msg {
   private String title;
    private String content ;

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



    public Msg() {
    }

    public Msg(String title, String content) {
        this.title = title;
        this.content = content;
    }

}
