package com.springboot.blog.springboot.blog.restapi.service;

import com.springboot.blog.springboot.blog.restapi.payload.PostDto;
import com.springboot.blog.springboot.blog.restapi.payload.PostResponse;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);
    PostResponse getAllPosts(int pageNo, int pageSize,String sortBy,String sortDir);
    PostDto getPostById(Long id);
    PostDto updatePost(PostDto postDto,Long id);
    void deletePostById(Long id);
    List<PostDto> getPostsByCategory(Long categoryId);
}
