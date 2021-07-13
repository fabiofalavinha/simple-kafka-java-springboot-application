package com.example.kafka;

public class SampleMessage {
    private String content;

    public SampleMessage() {
    }

    public SampleMessage(String foo) {
        this.content = foo;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "SampleMessage [content=" + this.content + "]";
    }
}
