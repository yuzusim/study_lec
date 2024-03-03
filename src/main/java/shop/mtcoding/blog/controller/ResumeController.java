package shop.mtcoding.blog.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import shop.mtcoding.blog.model.resume.Resume;
import shop.mtcoding.blog.model.resume.ResumeRepository;
import shop.mtcoding.blog.model.scrap.ScrapRepository;
import shop.mtcoding.blog.dto.scrap.ScrapResponse;
import shop.mtcoding.blog.model.user.User;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class ResumeController {

    private final ResumeRepository resumeRepository;
    private final HttpSession session;
    private final ScrapRepository scrapRepository;
    @GetMapping("/resume/manageResume")
    public String manageResume (HttpServletRequest request) {
        List<Resume> resumeList = resumeRepository.findAll();
        request.setAttribute("resumeList", resumeList);

        return "/resume/manageResume";
    }

    @GetMapping("/resume/resumeDetail/{id}")
    public String resumeDetail (@PathVariable Integer id, HttpServletRequest request) {
        User sessionUser = (User) session.getAttribute("sessionUser");

        Resume resumeDTO = resumeRepository.findById(id);
        request.setAttribute("resume", resumeDTO);


        if(sessionUser == null) {
            ScrapResponse.DetailDTO scrapDetailDTO = scrapRepository.findScrap(id);
            request.setAttribute("scrap", scrapDetailDTO);
        } else {
            ScrapResponse.DetailDTO scrapDetailDTO = scrapRepository.findScrap(id, sessionUser.getId());
            request.setAttribute("scrap", scrapDetailDTO);
        }
        return "/resume/resumeDetail";
    }
    @GetMapping("/resume/updateResumeForm")
    public String updateResumeForm () {
        return "/resume/updateResumeForm";
    }
    @GetMapping("/resume/writeResumeForm")
    public String writeResumeForm () {
        return "/resume/writeResumeForm";
    }


}
