package com.example.springbootawssolo.web;

import com.example.springbootawssolo.web.dto.HelloResponseDto;
import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// 컨트롤러를 JSON 을 반환하는 컨트롤러로 만들어 준다.
// @ResponseBody 를 각 메서드마다 선언했던 것을 해결
@RestController
public class HelloController {

    // HTTP Method 인 Get 의 요청을 받을 수 있다.
    // 이전에는 @RequestMapping(method = RequestMethod.GET) 으로 이용
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name, @RequestParam("amount") int amount) {
        return new HelloResponseDto(name, amount);
    }
}
