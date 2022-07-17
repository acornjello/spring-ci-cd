package com.example.springcicd.web.dto;

import com.example.springcicd.domain.posts.Posts;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class PostsResponseDto {

    private Long id;
    private String title;
    private String content;
    private String author;


    public PostsResponseDto(Posts entity) {
        this.id = entity.getId();
        this.title = entity.getContent();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
    }

}
