package shop.mtcoding.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CompController {

    @GetMapping("/comp/joinForm")
    public String compJoinForm(){
        return "/comp/joinForm";
    }

    @GetMapping("/comp/loginForm")
    public String compLoginForm(){
        return "/comp/loginForm";
    }

}
