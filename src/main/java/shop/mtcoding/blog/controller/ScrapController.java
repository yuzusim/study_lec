package shop.mtcoding.blog.controller;


import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import shop.mtcoding.blog.dto.scrap.ScrapRequest;

import shop.mtcoding.blog.model.scrap.ScrapRepository;
import shop.mtcoding.blog.model.user.User;

@RequiredArgsConstructor
@Controller
public class ScrapController {
    private final ScrapRepository scrapRepository;
    private final HttpSession session;

    @PostMapping("/scrap/save")
    public String save(ScrapRequest.SaveDTO requestDTO) {
        System.out.println("requestDTO : " + requestDTO);
        User sessionUser = (User) session.getAttribute("sessionComp");
        scrapRepository.save(requestDTO, sessionUser.getId());

        return "redirect:/resume/resumeDetail/" + requestDTO.getResumeId();
    }

    @PostMapping("/scrap/{id}/delete")
    public String delete(@PathVariable Integer id, ScrapRequest.SaveDTO saveDTO) {
        System.out.println(saveDTO.getResumeId());
        System.out.println("delete id : " + id);
        scrapRepository.deleteById(id);
        return "redirect:/resume/resumeDetail/" + saveDTO.getResumeId();
    }
}