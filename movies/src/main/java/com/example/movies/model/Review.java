package com.example.movies.model;


import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reviews")
public class Review {
    private ObjectId id;
    private String body;
}
