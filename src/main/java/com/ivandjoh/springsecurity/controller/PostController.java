package com.ivandjoh.springsecurity.controller;

import com.ivandjoh.springsecurity.model.Post;
import com.ivandjoh.springsecurity.service.PostService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }


    @GetMapping("/posts")
    public List<Post> findAllPosts() {
        return postService.findAllPosts();
    }
}
