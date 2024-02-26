package shop.mtcoding.blog.com;


import lombok.Data;
import java.sql.Timestamp;

public class ComRequest {

    @Data
    public static class JoinDTO {
        private String comName;
        private String password;
        private String email;
        private String bizNum;
        private String representativeName;
        private String photo;
        private String homepage;
        private Timestamp createdAt;
    }
}
