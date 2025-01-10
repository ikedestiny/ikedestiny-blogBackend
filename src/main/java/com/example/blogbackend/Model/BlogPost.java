package com.example.blogbackend.Model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Arrays;

@Document(collection = "BlogPosts")
public class BlogPost {

    private String id;
    private String title;
    private LocalDateTime created;
    private String author;
    private Paragraph[] paragraphs;

    public BlogPost() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "BlogPost{" +
                "title='" + title + '\'' +
                ", created=" + created +
                ", author='" + author + '\'' +
                ", paragraphs=" + Arrays.toString(paragraphs) +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Paragraph[] getParagraphs() {
        return paragraphs;
    }

    public void setParagraphs(Paragraph[] paragraphs) {
        this.paragraphs = paragraphs;
    }
}
