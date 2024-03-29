package shop.mtcoding.blog.model.resume;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import shop.mtcoding.blog.model.skill.Skill;
import shop.mtcoding.blog.model.user.User;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Table(name = "resume_tb")
@Getter
@Setter
@Entity
public class Resume {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer userId;


    private String title;
    // 희망 근무 지역
    private String area;


    private String edu;

    private String career;

    // 자기소개

    private String introduce;
    // 포트폴리오 링크
    private String portLink;

    // private Boolean isPublic; // 이부분 오류나길래 일단 String 바꿔놓음

    private Timestamp createdAt;

}
