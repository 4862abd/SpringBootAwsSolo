package com.example.springbootawssolo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


// 해당 애너테이션으로 인해 스프링 부트의 자동 설정, 스프링 빈 읽기와 생성을 자동으로 설정
// 이 애너테이션이 있는 위치부터 설정을 읽어가기 때문에 최상단 위치 필요
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        // 이 메서드를 통해 내장 WAS 실행
        // 톰캣을 설치할 필요가 없게 된다. - 언제 어디서나 같은 환경에서 스프링 부트를 배포할 수 있다.
        SpringApplication.run(Application.class, args);
    }
}
