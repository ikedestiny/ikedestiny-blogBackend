package com.example.blogbackend.Repository;

import com.example.blogbackend.Model.BlogPost;
import com.mongodb.client.AggregateIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.convert.MongoConverter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Component
public class SearchRepoImpl implements SearchRepo {
    @Autowired
    MongoClient mongoClient;
    @Autowired
    MongoConverter converter;

    @Override
    public List<BlogPost> fullTextSearch(String text) {


        /*
         * Requires the MongoDB Java Driver.
         * https://mongodb.github.io/mongo-java-driver
         */
        List<BlogPost> posts = new ArrayList<>();

        MongoDatabase database = mongoClient.getDatabase("linkindbusername");
        MongoCollection<Document> collection = database.getCollection("BlogPosts");
        AggregateIterable<Document> result = collection
                .aggregate(Arrays.asList(new Document("$search", new Document("index", "default")
                        .append("text", new Document("query", text)
                                .append("path", Arrays.asList("title", "author", "content")))),
                        new Document("$sort", new Document("created", -1L))));

        result.forEach(post -> posts.add(converter.read(BlogPost.class, post)));
        return posts;
    }
}
