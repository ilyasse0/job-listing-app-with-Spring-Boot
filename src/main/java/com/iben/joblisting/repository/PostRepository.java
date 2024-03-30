package com.iben.joblisting.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.iben.joblisting.model.Post;

public interface PostRepository extends MongoRepository<Post , String> {
    

}
