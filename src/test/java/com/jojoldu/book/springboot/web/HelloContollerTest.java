package com.jojoldu.book.springboot.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest
public class HelloContollerTest {
    @Autowired
    private MockMvc mvc;

    @Test
    public void hello가_리턴된다() throws Exception {
        String hello = "hello";

        mvc.perform(get("/hello")).andExpect(status().isOk())
                .andExpect(content().string(hello));
    }
}
/*
>@RunWith(SpringRunner.class)
-테스트를 진핼할때 JUnit에 내장된 실행자 외에 다른 실행자를 실행시킨다.
-즉 스프링 부트 테스트와 JUnit 사이에 연결자 역할을 한다.
>@WebMvcTest
-여러 스프링 테스트 어노테이션중 Web(Spring MVC)에 집중할 수 있는 어노테이션
-선언할경우 @Controller , @ControllerAdvice 등을 사용할 수 있다.
-단, @Service, @Component, @Repository 등은 사용할 수 없다.
-여기서는 컨트롤러만 사용하기 떄문에 선언
>@Autowired
-스프링이 관리하는 빈을 주입
>private MockMvc mvc
-웹 API를 테스트할때 사용한다.
-스프링 MVC테스트의 시작점
-이클래스를 통해 HTTP GET, POST등에 대한 API를 테스트할 수 있다.
 */