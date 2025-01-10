package com.example.blogbackend.Repository;

import com.example.blogbackend.Model.BlogPost;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BlogPostRepo extends MongoRepository<BlogPost,String> {
}
