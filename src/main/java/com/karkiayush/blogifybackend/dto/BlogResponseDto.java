package com.karkiayush.blogifybackend.dto;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class BlogResponseDto {
    private UUID id;
    private String title;
    private String content;
    private String coverImage;
    private String authorName;
    private List<String> tags;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String totalLikes;
    private String totalComments;
}
