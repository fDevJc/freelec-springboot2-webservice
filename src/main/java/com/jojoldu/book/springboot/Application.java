package com.jojoldu.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing  //JPA Auditing 활성화
@SpringBootApplication
//메인클래스
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }
}

/*

Application 클래스는 메인클래스
@SpringBootApplication으로 인해 스프링 부트의 자동 설정, 빈 읽기 생성등 자동으로 설정
위의 어노테이션이 있는 위치부터 설정을 읽어가기 때문에 프로젝트의 최상단에 위치
SpringApplication.run(Application.class,args); 으로 인해 내장 WAS를 실행
 */
