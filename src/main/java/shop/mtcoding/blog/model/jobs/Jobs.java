package shop.mtcoding.blog.model.jobs;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.sql.Timestamp;

@Table(name = "jobs_tb")
@Data
@Entity
public class Jobs {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false)
    private Integer compId;

    @Column(nullable = false)
    private String area;

    @Column(nullable = false)
    private String edu;

    @Column(nullable = false)
    private String career;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private Date deadLine;

    @Column(nullable = false)
    private String task;

    @Column(nullable = false)
    private Timestamp createdAt;
}
