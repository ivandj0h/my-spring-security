package com.ivandjoh.springsecurity.repository;
import com.ivandjoh.springsecurity.model.Post;
import org.springframework.data.repository.ListCrudRepository;

public interface PostRepository extends ListCrudRepository<Post, Integer> { }
