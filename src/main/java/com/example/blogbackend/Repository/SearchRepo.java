package com.example.blogbackend.Repository;

import com.example.blogbackend.Model.BlogPost;

import java.util.List;

public interface SearchRepo {
    List<BlogPost> fullTextSearch(String text);
}
