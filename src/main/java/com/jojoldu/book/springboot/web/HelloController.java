package com.jojoldu.book.springboot.web;

import com.jojoldu.book.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name, @RequestParam int amount){
        return new HelloResponseDto(name,amount);
    }
}
/*
@RestContoller
-컨트롤러를 JSON을 반환하는 컨트롤러로 만들어 준다.
-예전에는 @ResponseBody를 각 메소드마다 선언했던것을 한번에 사용할수 있도록
@GetMapping
-get method 요청 처리
@RequestParam
-외부에서 API로 넘긴 파라미터를 가져오는 어노테이션
-여기서는 외부에서 name이란 이름으로 넘긴 파라미터를 메소드 파라미터 name으로 저장
 */
