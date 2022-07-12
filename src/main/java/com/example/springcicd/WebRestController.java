package com.example.springcicd;

import com.example.springcicd.repository.PostsRepository;
import com.example.springcicd.dto.PostsSaveRequestDto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class WebRestController {

    private PostsRepository postsRepository;

    @GetMapping("/hello")
    public String hello() {
        return "HelloWorld";
    }

    @PostMapping("/posts")
    public void savePosts(@RequestBody PostsSaveRequestDto dto) {
        System.out.println(dto.toEntity().toString());
        postsRepository.save(dto.toEntity());
        System.out.println(postsRepository.findAll().get(0));
    }

}
