package shop.mtcoding.blog.com;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
@Controller
public class ComController {
    private final ComRepository comRepository;

    @PostMapping("/com/join")
    public void join (ComRequest.JoinDTO requestDTO) {
        comRepository.join(requestDTO);
    }
}
