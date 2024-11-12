package com.example.springbootawssolo.web;

import com.example.springbootawssolo.config.auth.LoginUser;
import com.example.springbootawssolo.config.auth.dto.SessionUser;
import com.example.springbootawssolo.service.posts.PostsService;
import com.example.springbootawssolo.web.dto.PostsResponseDto;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RequiredArgsConstructor
@Controller
public class IndexController {

    private final PostsService postsService;
    private final HttpSession httpSession;

//    version 1
//    @LoginUser 애너테이션 구현 전, 세션에서 직접 user 데이터 획득
//    @GetMapping("/")
//    public String index(Model model) {
//        // Posts 리스트 조회
//        model.addAttribute("posts", postsService.findAllDesc());
//
//        // 로그인 성공 시, 세션에 저장된 User 가져오기
//        SessionUser user = (SessionUser) httpSession.getAttribute("user");
//        if (user != null) {
//            model.addAttribute("userName", user.getName());
//        }
//
//        return "index";
//    }

//    version 2
//    1. WebMvcConfigurer 의 addArgumentResolvers 로 등록된 리졸버가
//    2. supportsParameter() 메서드에 의해
//    3. @LoginUser 애너테이션이 붙어있고 && SessionUser 타입인지 확인 후
//    4. resolveArgument() 에 정의된 메서드에의해 파라미터로 전달된다.
//    5. 즉, 세션에서 직접 가져오는 건 resolveArgument() 메서드에 정의되어 있고 그 전에 supportsParameter() 에 의해 한 번 검증된다.
//    SessionUser user = (SessionUser) httpSession.getAttribute("user"); 이 코드를 검증하여 가져오는 것.
    @GetMapping("/")
    public String index(Model model, @LoginUser SessionUser user) {
        model.addAttribute("posts", postsService.findAllDesc());

        if (user != null) {
            model.addAttribute("userName", user.getName());
        }

        return "index";
    }

    @GetMapping("/posts/save")
    public String postsSave() {
        return "posts-save";
    }

    @GetMapping("/posts/update/{id}")
    public String postsUpdate(@PathVariable Long id, Model model) {
        PostsResponseDto dto = postsService.findById(id);
        model.addAttribute("post", dto);

        return "posts-update";
    }
}
