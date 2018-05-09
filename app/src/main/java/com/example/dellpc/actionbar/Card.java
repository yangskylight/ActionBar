package com.example.dellpc.actionbar;

public class Card {

    private String title;
    private String content1;

    public Card(  String title, String content1) {

        this.title = title;
        this.content1 = content1;
    }


    public String getContent1() {
        return content1;
    }

    public void setContent1(String content1) {
        this.content1 = content1;
    }

    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }
}
