package com.jojoldu.book.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostsRepository extends JpaRepository<Posts,Long> {
    @Query("SELECT p FROM Posts p ORDER BY p.id DESC")
    List<Posts> findAllDesc();
}
/*
DB Layer 접근자
JpaRepository<Entity 클래스,PK 타입>를 상속하면 기본적인 크루드 메소드가 자동으로 생성
엔티티 클래스와 함께위치해야됨
 */
