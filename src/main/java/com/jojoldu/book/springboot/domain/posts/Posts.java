package com.jojoldu.book.springboot.domain.posts;

import com.jojoldu.book.springboot.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Posts extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content){
        this.title = title;
        this.content = content;
    }
}

/*
>@Entity
-테이블과 링크될 클래스임을 나타냄
-기본값으로 클래스의 카멜케이스 이름을 언더스코어 네이밍으로 테이블 이름을 매칭

>@id
-PK

>@GeneratedValue
-PK 생성규칙
-스프링부트 2.0에서는 GenerationType.IDENTITY옵션을 추가해야 auto_increment

>@Column
-테이블의 칼럼을 나타냄 굳이 선언하지 않아도 해당클래스의 모든 필드는 컬럼이 됨
-사용하는 이유는 , 기본값 외에 추가로 변경이 필요한 옵션이 있으면 사용
-문자열의 경우 varchar(255)가 기본

>@Builder
-해당 클래스의 빌더 패턴 클래스 생성
-생성자 상단에 선언시 생성자에 포함된 필드만 빌더에 포함

세터는 만들지 않고 해당 필드의 값변경이 필요하면 목적과 의도를 나타낼수있는 메소드를 추가하여 사용
 */
