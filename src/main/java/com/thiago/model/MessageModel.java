package com.thiago.model;

public class MessageModel {

    private String key;
    private String content;

    public MessageModel(String key, String content) {
        this.key = key;
        this.content = content;
    }

    public String getKey() {
        return key;
    }

    public String getContent() {
        return content;
    }
}
