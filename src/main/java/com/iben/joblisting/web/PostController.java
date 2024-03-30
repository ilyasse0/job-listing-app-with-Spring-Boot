package com.iben.joblisting.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.iben.joblisting.model.Post;
import com.iben.joblisting.repository.PostRepository;

@RestController
public class PostController {
    
    
    @Autowired
    private PostRepository postRepository;

    @GetMapping("/posts")
    public List<Post> fetchAllPosts(){
        return postRepository.findAll();
    }


    @PostMapping("/addPost")
    public Post addPost(@RequestBody Post post){
       return postRepository.save(post);
    }

    
}
