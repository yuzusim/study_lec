package shop.mtcoding.blog.model.skill;


import jakarta.persistence.*;
import lombok.Data;

@Table(name = "skill_tb")
@Data
@Entity
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Integer resumeId;

    @Column(nullable = false)
    private Integer jobsId;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private Integer role;

}
