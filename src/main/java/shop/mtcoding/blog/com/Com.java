package shop.mtcoding.blog.com;

import jakarta.persistence.*;
import lombok.Data;
import java.sql.Timestamp;

@Table(name = "com_tb")
@Data
@Entity
public class Com {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true)
    private String comName;
    private String password;
    @Column(unique = true)
    private String email;
    @Column(unique = true)
    private String bizNum;
    @Column(unique = true)
    private String representativeName;
    private String photo;
    @Column(unique = true)
    private String homepage;
    private Timestamp createdAt;
}