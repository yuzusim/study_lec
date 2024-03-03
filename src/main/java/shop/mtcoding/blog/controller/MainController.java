package shop.mtcoding.blog.controller;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import shop.mtcoding.blog.model.jobs.Jobs;
import shop.mtcoding.blog.model.jobs.JobsRepository;
import shop.mtcoding.blog.model.page.Page;
import shop.mtcoding.blog.model.page.Paging;

import java.util.ArrayList;
import java.util.List;


@RequiredArgsConstructor
@Controller
public class MainController {
    private final Paging paging;
    private final JobsRepository jobsRepository;

//    @GetMapping("/")
//    public String main(HttpServletRequest request, @RequestParam(defaultValue = "") String keyword) {
//
//        List<Jobs> jobsList = jobsRepository.findAll();
//        request.setAttribute("jobsList", jobsList);
//
//        if(keyword.isBlank()) { //isBlank면 검색 안함
//            jobsList = jobsRepository.findAll();
//            request.setAttribute("keyword", "");
//            request.setAttribute("jobsList", jobsList);
//
//        } else {    //검색하면 키워드를 던져줌
//            jobsList = jobsRepository.findAll(keyword);
//            request.setAttribute("keyword", keyword);
//            request.setAttribute("jobsList", jobsList);
//        }
//
//
//        return "index";
//    }

    @GetMapping("/")
    public String index(HttpServletRequest request, @RequestParam(defaultValue = "") String keyword) {
        int currentPage = 1;
        boolean lastPage = paging.lastPage(currentPage);
        boolean firstPage = paging.firstPage(currentPage);
        int totalPages = paging.totalPages();

        List<Jobs> jobsList;
        List<Page> pages = new ArrayList<>();

        for (int i = 1; i <= totalPages; i++) {
            Page page1 = new Page();
            page1.setNumber(i);
            page1.setActive(currentPage == i);
            pages.add(page1);
        }
        List<Jobs> pageList = paging.showPages(currentPage);

        if(keyword.isBlank()) { //isBlank면 검색 안함
            jobsList = jobsRepository.findAll();
            request.setAttribute("keyword", "");
            request.setAttribute("jobsList", jobsList);

        } else {    //검색하면 키워드를 던져줌
            jobsList = jobsRepository.findAll(keyword);
            request.setAttribute("keyword", keyword);
            request.setAttribute("jobsList", jobsList);
        }

        request.setAttribute("pages", pages);
        request.setAttribute("firstPage", firstPage);
        request.setAttribute("lastPage", lastPage);
        request.setAttribute("pagelist", pageList);
        request.setAttribute("prevPage", Math.max(1, currentPage - 1));
        request.setAttribute("nextPage", Math.min(totalPages, currentPage + 1));

        return "index";
    }

    @GetMapping("/{page}")
    public String paging(@PathVariable int page, HttpServletRequest request, @RequestParam(defaultValue = "") String keyword) {
        int currentPage = page;
        boolean lastPage = paging.lastPage(currentPage);
        boolean firstPage = paging.firstPage(currentPage);
        int totalPages = paging.totalPages();

        List<Jobs> jobsList;
        List<Page> pages = new ArrayList<>();

        for (int i = 1; i <= totalPages; i++) {
            Page page1 = new Page();
            page1.setNumber(i);
            page1.setActive(currentPage == i);
            pages.add(page1);
        }
        List<Jobs> pageList = paging.showPages(currentPage);

        if(keyword.isBlank()) { //isBlank면 검색 안함
            jobsList = jobsRepository.findAll();
            pageList = paging.showPages(currentPage, jobsList);
            request.setAttribute("keyword", "");
            request.setAttribute("jobsList", jobsList);

        } else {    //검색하면 키워드를 던져줌
            jobsList = jobsRepository.findAll(keyword);
            request.setAttribute("keyword", keyword);
            request.setAttribute("jobsList", jobsList);
        }

        request.setAttribute("pages", pages);
        request.setAttribute("firstPage", firstPage);
        request.setAttribute("lastPage", lastPage);
        request.setAttribute("pagelist", pageList);
        request.setAttribute("prevPage", Math.max(1, currentPage - 1));
        request.setAttribute("nextPage", Math.min(totalPages, currentPage + 1));

        return "index";
    }
}
