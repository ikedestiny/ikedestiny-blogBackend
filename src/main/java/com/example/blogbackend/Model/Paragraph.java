package com.example.blogbackend.Model;

public class Paragraph {
    private String title;
    private String content;

    public Paragraph() {
    }

    @Override
    public String toString() {
        return "Paragraph{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
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
