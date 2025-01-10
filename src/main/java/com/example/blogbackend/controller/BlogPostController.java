package com.example.blogbackend.controller;

import com.example.blogbackend.Model.BlogPost;
import com.example.blogbackend.Repository.BlogPostRepo;
import com.example.blogbackend.Repository.SearchRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@CrossOrigin(origins = "*", allowCredentials = "true", allowedHeaders = "*")
@RestController
public class BlogPostController {
    @Autowired
    BlogPostRepo repo;
    @Autowired
    SearchRepo searchRepo;

    @GetMapping("/posts")
    public List<BlogPost> getAll(){
        return repo.findAll();
    }

    @PostMapping("/create-new-blog")
    public BlogPost createNewBlog(@RequestBody BlogPost blogPost){
        return repo.save(blogPost);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable String id){
        repo.deleteById(id);
        return "successfully deleted post with id "+id;
    }

    @GetMapping("/search/{text}")
    public List<BlogPost> search(@PathVariable String text){
        return searchRepo.fullTextSearch(text);
    }
}
