package shop.mtcoding.blog.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import shop.mtcoding.blog.model.profile.ProfileRepository;
import shop.mtcoding.blog.model.profile.ProfileRequest;

@RequiredArgsConstructor
@Controller
public class UserController {

    private final ProfileRepository profileRepository;

    @GetMapping("/user/joinForm")
    public String joinForm () {
        return "/user/joinForm";
    }

    @GetMapping("/user/loginForm")
    public String loginForm () {
        return "/user/loginForm";
    }

    @GetMapping("/user/offer")
    public String offer () {
        return "/user/offer";
    }



    @GetMapping("/user/scrap")
    public String scrap () {
        return "/user/scrap";
    }

    @GetMapping("/user/updateForm")
    public String updateForm () {
        return "/user/updateForm";
    }

    @GetMapping("/user/userHome")
    public String userHome () {
        return "/user/userHome";
    }

    // 이미지업로드용
    @PostMapping("profileUpload")
    public String profileUpload(ProfileRequest.ProfileDTO requestDTO) {



        return "redirect:/user/profileUpdateForm";
    }

    // 이미지업로드용
    @GetMapping("/user/profileUpdateForm")
    public String profileUpdateForm () {
        return "/user/profileUpdateForm";
    }
}
