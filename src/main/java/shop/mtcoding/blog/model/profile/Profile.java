package shop.mtcoding.blog.model.profile;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "profile_tb")
@Entity
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;
    private String imgFilename; // 파일 패스
}
