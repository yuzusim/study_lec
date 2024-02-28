package shop.mtcoding.blog.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JobsController {



    @GetMapping("/jobs/interest")
    public String interest () {
        return "/jobs/interest";
    }

    @GetMapping("/jobs/info")
    public String info () {
        return "/jobs/info";
    }


    @GetMapping("/jobs")
    public String jobs() {
        return "/jobs/jobsDetail";
    }


}
