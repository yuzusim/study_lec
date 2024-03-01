package shop.mtcoding.blog.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import shop.mtcoding.blog.dto.user.UserRequest;
import shop.mtcoding.blog.model.user.UserRepository;


@RequiredArgsConstructor
@Controller
public class UserController {
    private final UserRepository userRepository;

    @PostMapping("/user/join")
    public String join (UserRequest.JoinDTO requestDTO) {

        userRepository.save(requestDTO);
        return "redirect:/";
    }

    @GetMapping("/user/joinForm")
    public String joinForm () {
        return "/user/joinForm";
    }

    @GetMapping("/user/loginForm")
    public String loginForm () {
        return "/user/loginForm";
    }

    @GetMapping("/user/offer")
    public String offer () {
        return "/user/offer";
    }

    @GetMapping("/user/profileUpdateForm")
    public String profileUpdateForm () {
        return "/user/profileUpdateForm";
    }

    @GetMapping("/user/scrap")
    public String scrap () {
        return "/user/scrap";
    }

    @GetMapping("/user/updateForm")
    public String updateForm () {
        return "/user/updateForm";
    }

    @GetMapping("/user/userHome")
    public String userHome () {
        return "/user/userHome";
    }


}
