package com.karkiayush.blogifybackend.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BlogRequestDto {
    private String title;

    private String content;

    private String coverImage;

    private List<String> tags;
}
