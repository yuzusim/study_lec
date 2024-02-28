package shop.mtcoding.blog.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/user/loginForm")
    public String loginForm () {
        return "/user/loginForm";
    }

    @GetMapping("/user/joinForm")
    public String joinForm () {
        return "/user/joinForm";
    }

    @GetMapping("/user/userHome")
    public String userHome () {
        return "/user/userHome";
    }

    @GetMapping("/user/offer")
    public String offer () {
        return "/user/offer";
    }

    @GetMapping("/user/scrap")
    public String scrap () {
        return "/user/scrap";
    }

    @GetMapping("/user/updateForm")
    public String updateForm () {
        return "/user/updateForm";
    }

    @GetMapping("/user/profileUpdateForm")
    public String profileUpdateForm () {
        return "/user/profileUpdateForm";
    }


}
