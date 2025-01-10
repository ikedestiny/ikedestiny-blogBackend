package com.example.blogbackend.controller;

import com.example.blogbackend.Model.BlogPost;
import com.example.blogbackend.Repository.BlogPostRepo;
import com.example.blogbackend.Repository.SearchRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BlogPostController {
    @Autowired
    BlogPostRepo repo;
    @Autowired
    SearchRepo searchRepo;

    @GetMapping("/posts")
    @CrossOrigin(origins = "*")
    public List<BlogPost> getAll(){
        return repo.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/create-new-blog")
    public BlogPost createNewBlog(@RequestBody BlogPost blogPost){
        return repo.save(blogPost);
    }

    @CrossOrigin(origins = "*")
    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable String id){
        repo.deleteById(id);
        return "successfully deleted post with id "+id;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/search/{text}")
    public List<BlogPost> search(@PathVariable String text){
        return searchRepo.fullTextSearch(text);
    }
}
