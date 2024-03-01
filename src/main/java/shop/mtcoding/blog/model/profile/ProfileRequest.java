package shop.mtcoding.blog.model.profile;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

public class ProfileRequest {

    @Data
    public static class ProfileDTO{
        private String title;
        private MultipartFile imgFile;
    }
}
