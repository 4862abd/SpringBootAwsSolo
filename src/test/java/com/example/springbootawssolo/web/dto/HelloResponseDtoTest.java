package com.example.springbootawssolo.web.dto;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {

    // assertj 장점
    // 1. CoreMatchers 와 달리 추가적으로 라이브러리 필요 X
    //      Junit 의 assertThat 을 쓰게 되면 is() 와 같이 CoreMathers 라이브러리가 필요

    @Test
    public void 롬복_기능_테스트() {
        // given
        String name = "test";
        int amount = 1000;

        // when
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        // then
        assertThat(dto.getName()).isEqualTo(name);          // assertj 라는 테스트 검증 라이브러리의 검증 메서드
                                                            // 검증하고 싶은 대상을 메서드 인자로 받는다.
                                                            // 메서드 체이닝 지원
        assertThat(dto.getAmount()).isEqualTo(amount);

    }

}