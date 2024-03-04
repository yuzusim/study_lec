package shop.mtcoding.blog.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import shop.mtcoding.blog.dto.scrap.ScrapResponse;
import shop.mtcoding.blog.model.resume.Resume;
import shop.mtcoding.blog.model.resume.ResumeRepository;
import shop.mtcoding.blog.model.resume.ResumeRequest;
import shop.mtcoding.blog.model.scrap.ScrapRepository;
import shop.mtcoding.blog.model.user.User;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class ResumeController {

    private final HttpSession session;
    private final ResumeRepository resumeRepository;
    private final ScrapRepository scrapRepository;

    @GetMapping("/resume/manageResume")
    public String manageResume(HttpServletRequest request) {
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

    @GetMapping("/resume/{id}/updateResumeForm")
    public String updateResumeForm (@PathVariable int id, HttpServletRequest request) {
        User sessionUser = (User) session.getAttribute("sessionUser");
        if(sessionUser == null){ // 401
            return "redirect:/loginForm";
        }

        return "/resume/updateResumeForm";
    }


    @GetMapping("/resume/writeResumeForm")
    public String writeResumeForm() {

        return "/resume/writeResumeForm";
    }


    @PostMapping("/resume/save")
    public String save(ResumeRequest.ResumeWriterDTO requestDTO, HttpServletRequest request) {
        System.out.println(requestDTO);
        resumeRepository.save(requestDTO);

        return "redirect:/resume/manageResume";
    }


    @PostMapping("/resume/{id}/delete")
    public String delete(@PathVariable int id, HttpServletRequest request){
        User sessionUser = (User) session.getAttribute("sessionUser");
        if(sessionUser == null){ // 401
            return "redirect:/loginForm";
        }
        Resume resumeDTO = resumeRepository.findById(id);
        resumeRepository.deleteById(id);

        request.setAttribute("resume", resumeDTO);

        return "redirect:/resume/manageResume";

    }

}