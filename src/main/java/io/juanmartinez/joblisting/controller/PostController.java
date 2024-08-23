package io.juanmartinez.joblisting.controller;

import io.juanmartinez.joblisting.PostRepository;
import io.juanmartinez.joblisting.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    PostRepository repo;

    @GetMapping("/posts")
    public List<Post> getAllPost(){
        return repo.findAll() ;
    }

    @PostMapping("/post")
    public Post addPost(@RequestBody Post post){
        return repo.save(post);
    }
}
