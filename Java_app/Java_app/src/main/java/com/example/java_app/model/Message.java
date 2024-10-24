package com.example.java_app.model;

public class Message {
    private String content;
    private String sender;

    // Default constructor
    public Message() {}

    // Constructor with parameters
    public Message(String content, String sender) {
        this.content = content;
        this.sender = sender;
    }

    // Getters and setters
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
}
