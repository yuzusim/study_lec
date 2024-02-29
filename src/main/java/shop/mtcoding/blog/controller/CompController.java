package shop.mtcoding.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CompController {

    @GetMapping("/comp/apply")
    public String apply(){
        return "/comp/apply";
    }

    @GetMapping("/comp/comphome")
    public String compHome(){
        return "/comp/comphome";
    }

    @GetMapping("/comp/joinForm")
    public String compJoinForm(){
        return "/comp/joinForm";
    }

    @GetMapping("/comp/loginForm")
    public String compLoginForm(){
        return "/comp/loginForm";
    }

    @GetMapping("/comp/profileUpdateForm")
    public String profileUpdateForm(){
        return "/comp/profileUpdateForm";
    }

    @GetMapping("/comp/readResume")
    public String readResume(){
        return "/comp/readResume";
    }

    @GetMapping("/comp/scrap")
    public String scrap(){
        return "/comp/scrap";
    }

    @GetMapping("/comp/talent")
    public String talent(){
        return "/comp/talent";
    }

    @GetMapping("/comp/updateForm")
    public String updateForm(){
        return "/comp/updateForm";
    }

    @GetMapping("/comp/jobsInfo")
    public String jobsInfo(){
        return "/comp/jobsInfo";
    }
    @GetMapping("/comp/compResumeDetail")
    public String compResumeDetail(){
        return "/comp/compResumeDetail";
    }
}
