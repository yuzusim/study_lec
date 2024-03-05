package shop.mtcoding.blog.model.resume;

import lombok.Data;

import java.sql.Timestamp;

public class ResumeResponse {
    private Integer id;
    private Integer userId;
    private String title;
    private String area;
    private String edu;
    private String career;
    private String introduce;
    private String portLink;
    private Boolean isPublic;
    private Timestamp createdAt;

}
