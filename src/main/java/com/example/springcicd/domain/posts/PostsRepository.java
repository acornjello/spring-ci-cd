package com.example.springcicd.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository<Entity클래스, PK타입> 상속 시, 기본적인 CRUD 메소드 자동 생성
// @Repository 별도 추가 필요 없음
public interface PostsRepository extends JpaRepository<Posts, Long> {

}
