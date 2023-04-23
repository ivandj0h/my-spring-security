package com.ivandjoh.springsecurity.service.Impl;

import com.ivandjoh.springsecurity.model.Post;
import com.ivandjoh.springsecurity.repository.PostRepository;
import com.ivandjoh.springsecurity.service.PostService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public List<Post> findAllPosts() {
        return postRepository.findAll();
    }
}
