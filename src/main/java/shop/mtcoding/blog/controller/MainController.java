package shop.mtcoding.blog.controller;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import shop.mtcoding.blog.model.jobs.Jobs;
import shop.mtcoding.blog.model.jobs.JobsRepository;

import java.util.List;


@RequiredArgsConstructor
@Controller
public class MainController {

    private final JobsRepository jobsRepository;
    @GetMapping("/")
    public String main(HttpServletRequest request, @RequestParam(defaultValue = "") String keyword) {

        List<Jobs> jobsList = jobsRepository.findAll();
        request.setAttribute("jobsList", jobsList);

        if(keyword.isBlank()) { //isBlank면 검색 안함
            jobsList = jobsRepository.findAll();
            request.setAttribute("keyword", "");
            request.setAttribute("jobsList", jobsList);

        } else {    //검색하면 키워드를 던져줌
            jobsList = jobsRepository.findAll(keyword);
            request.setAttribute("keyword", keyword);
            request.setAttribute("jobsList", jobsList);
        }

        return "index";
    }
}
