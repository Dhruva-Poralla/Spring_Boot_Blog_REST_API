package com.springboot.blog.springboot.blog.restapi.repository;

import com.springboot.blog.springboot.blog.restapi.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post,Long> {

    List<Post> findByCategoryId(Long categoryId);
}
