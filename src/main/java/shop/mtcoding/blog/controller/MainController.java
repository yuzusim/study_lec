package shop.mtcoding.blog.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String main () {
        return "index";
    }

    @GetMapping("/jobs/interest")
    public String interest () {
        return "/jobs/interest";
    }
    @GetMapping("/resume/manageResume")
    public String manageResume () {
        return "/resume/manageResume";
    }

    @GetMapping("/jobs/info")
    public String info () {
        return "/jobs/info";
    }
    @GetMapping("/user/loginForm")
    public String loginForm () {
        return "/user/loginForm";
    }
    @GetMapping("/user/joinForm")
    public String joinForm () {
        return "/user/joinForm";
    }
    @GetMapping("/comp/loginForm")
    public String compLogin () {
        return "/comp/loginForm";
    }



}
