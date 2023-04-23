package com.ivandjoh.springsecurity.service;

import com.ivandjoh.springsecurity.model.Post;

import java.util.List;

public interface PostService {
    List<Post> findAllPosts();
}
