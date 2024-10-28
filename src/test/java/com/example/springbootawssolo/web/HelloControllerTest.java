package com.example.springbootawssolo.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

// JUnit 에 내장된 실행자 외에 다른 실행자를 실행
// 여기서는 SpringRunner 라는 스프링 실행자 사용
// 즉, 스프링 부트 테스트와 JUnit 사이에 연결자 역할
@RunWith(SpringRunner.class)
// 여러 스프링 애너테이션 중, Web 에 징중할 수 있는 애너테이션
// 선언할 경우 @Controller, @ControllerAdvice 등을 사용 가능
// 단 @Service, @Component, @Repository 등은 사용 불가
@WebMvcTest(controllers = HelloController.class)
public class HelloControllerTest {

    // 스프링 빈 DI
    @Autowired
    // 웹 API 를 테스트할 때 사용
    // 스프링 MVC 테스트의 시작점
    // 이 class 를 통해 HTTP GET, POST 등 API 테스트 가능
    private MockMvc mvc;

    @Test
    public void hello가_리턴된다() throws Exception {
        String hello = "hello";

        mvc.perform(get("/hello"))          // MockMvc 를 통해 "/hello" 주소로 HTTP GET 요청, 체이닝 지원
                .andExpect(status().isOk())             // andExpect(): perform() 의 결과 검증
                                                        // HTTP Header 의 Status 검증
                                                        // isOK(): 200 인지 검증
                .andExpect(content().string(hello));    // 본문의 내용 검증
    }
}
