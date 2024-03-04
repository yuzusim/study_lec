package shop.mtcoding.blog.controller;


import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import shop.mtcoding.blog.dto.scrap.ScrapRequest;
import shop.mtcoding.blog.model.scrap.Scrap;
import shop.mtcoding.blog.model.scrap.ScrapRepository;
import shop.mtcoding.blog.model.user.User;

@RequiredArgsConstructor
@RestController
public class ScrapController {
    private final ScrapRepository scrapRepository;
    private final HttpSession session;
    @PostMapping("/api/scrap")
    public Scrap save(@RequestBody ScrapRequest.SaveDTO requestDTO) {
        User sessionUser = (User) session.getAttribute("sessionUser");
        Scrap scrap = scrapRepository.save(requestDTO, sessionUser.getId());
        return scrap;
    }

    @PostMapping("/api/scrap/{id}")
    public void delete(@PathVariable Integer id) {
        scrapRepository.deleteById(id);
    }

}
