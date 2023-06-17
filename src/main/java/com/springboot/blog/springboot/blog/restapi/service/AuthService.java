package com.springboot.blog.springboot.blog.restapi.service;

import com.springboot.blog.springboot.blog.restapi.payload.LoginDto;
import com.springboot.blog.springboot.blog.restapi.payload.RegisterDto;

public interface AuthService {
    String login(LoginDto loginDto);

    String register(RegisterDto registerDto);
}
