package com.example.springbootawssolo.domain.user;

import com.example.springbootawssolo.domain.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "springboot_aws_solo_user")
public class User extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column
    private String picture;

//    @Enumerated(EnumType.STRING): JPA 로 DB 에 저장할 때 Enum 값을 어떤 형태로 저장할지 경정
//    기본적으로는 int 로 된 숫자가 저장된다.
//    숫자로 저장되면 DB 로 확인할 때 그 값이 무슨 코드를 의미하는지 확인 불가하여 String 으로 저장한다.
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

    @Builder
    public User(String name, String email, String picture, Role role) {
        this.name = name;
        this.email = email;
        this.picture = picture;
        this.role = role;
    }

    public User update(String name, String picture) {
        this.name = name;
        this.picture = picture;

        return this;
    }

    public String getRoleKey() {
        return this.role.getKey();
    }
}
