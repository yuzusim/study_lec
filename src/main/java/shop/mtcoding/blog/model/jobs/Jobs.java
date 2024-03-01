package shop.mtcoding.blog.model.jobs;

import jakarta.persistence.*;
import lombok.Data;
import shop.mtcoding.blog.model.skill.Skill;
import shop.mtcoding.blog.model.user.User;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Table(name = "jobs_tb")
@Data
@Entity
public class Jobs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @Column(nullable = false)
    private String area;

    @Column(nullable = false)
    private String edu;

    @Column(nullable = false)
    private String career;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "job_id")
    private List<Skill> skillList = new ArrayList<>();

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private Date deadLine;

    @Column(nullable = false)
    private String task;

    @Column(nullable = false)
    private Timestamp createdAt;
}
