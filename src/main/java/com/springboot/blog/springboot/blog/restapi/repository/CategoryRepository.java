package com.springboot.blog.springboot.blog.restapi.repository;

import com.springboot.blog.springboot.blog.restapi.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
