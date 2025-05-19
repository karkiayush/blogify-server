package com.karkiayush.blogifybackend.repository;

import com.karkiayush.blogifybackend.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BlogRepository extends JpaRepository<Blog, UUID> {
}
