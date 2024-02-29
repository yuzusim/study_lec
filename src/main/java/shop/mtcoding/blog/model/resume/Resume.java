package shop.mtcoding.blog.model.resume;


import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Table(name = "resume_tb")
@Data
@Entity
public class Resume {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    // 가입시 필요한 아이디
    @Column(nullable = false)
    private Integer userId;

    @Column(nullable = false)
    private String title;
    // 희망 근무 지역
    private String area;

    @Column(nullable = false)
    private String edu;

    @Column(nullable = false)
    private String career;

    // 자기소개
    @Column(nullable = false)
    private String introduce;
    // 포트폴리오 링크
    private String portLink;

    @Column(nullable = false)
    private Boolean isPublic;

    @Column(nullable = false)
    private Timestamp createdAt;

}
