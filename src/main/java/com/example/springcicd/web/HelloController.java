package com.example.springcicd.web;

import com.example.springcicd.web.dto.HelloResponseDto;
import com.example.springcicd.domain.posts.PostsRepository;
import com.example.springcicd.web.dto.PostsSaveRequestDto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class HelloController {

    private PostsRepository postsRepository;

    @GetMapping("/hello")
    public String hello() {

        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name, @RequestParam("amount") int amount) {
        return new HelloResponseDto(name, amount);
    }

    @PostMapping("/posts")
    public void savePosts(@RequestBody PostsSaveRequestDto dto) {
        System.out.println(dto.toEntity().toString());
        postsRepository.save(dto.toEntity());
        System.out.println(postsRepository.findAll().get(0));
    }

}
