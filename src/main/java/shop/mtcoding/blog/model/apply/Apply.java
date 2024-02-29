package shop.mtcoding.blog.model.apply;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Table(name = "apply_tb")
@Data
@Entity
public class Apply {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private Integer resumeId;

    @Column(nullable = false)
    private Integer jobsId;

    @Column(nullable = false)
    private Boolean isPass;

    @Column(nullable = false)
    private Timestamp createdAt;

}
