package shop.mtcoding.blog.model.user;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;

import java.sql.Date;
import java.sql.Timestamp;

public class UserRequest {
    @Data
    @Builder
    public static class UserAllDTO{

        private Integer id;

        private String userid;

        private String myName;

        private String password;

        private String email;

        private String phone;

        private String address;

        private Date birth;

        private String businessNumber;

        private String photo;

        private String compName;

        private String homepage;

        private Integer role;

        private Timestamp createdAt;
    }
}
