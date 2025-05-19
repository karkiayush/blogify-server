package com.karkiayush.blogifybackend.controller;

import com.karkiayush.blogifybackend.entity.Blog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/blogs")
public class BlogController {
    @GetMapping
    public List<Blog> getAllBlogs() {

    }
}
