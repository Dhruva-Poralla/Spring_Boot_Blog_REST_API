package com.springboot.blog.springboot.blog.restapi.repository;

import com.springboot.blog.springboot.blog.restapi.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role,Long> {
    Optional<Role> findByName(String name);
}
