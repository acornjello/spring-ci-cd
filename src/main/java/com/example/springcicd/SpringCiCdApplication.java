package com.example.springcicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing // JPA Audiditing 활성화
@SpringBootApplication
public class SpringCiCdApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCiCdApplication.class, args);
    }

}
