package com.example.springbootawssolo.config.auth.dto;

import com.example.springbootawssolo.domain.user.User;
import lombok.Getter;

/**
 * 인증된 사용자 정보만
 */
@Getter
public class SessionUser {

    private String name;
    private String email;
    private String picture;

    public SessionUser(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }
}
