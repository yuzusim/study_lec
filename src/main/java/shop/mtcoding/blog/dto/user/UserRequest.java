package shop.mtcoding.blog.dto.user;

import lombok.Data;

import java.sql.Date;

public class UserRequest {

    @Data
    public static class JoinDTO{
        private String email;
        private String myName;
        private String password;
        private Date birth;
        private String tel;
        private Integer role;
    }
}
