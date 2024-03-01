package shop.mtcoding.blog.model.user;


import jakarta.persistence.*;
import lombok.Data;
import java.sql.Date;
import java.sql.Timestamp;

@Table(name = "user_tb")
@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
