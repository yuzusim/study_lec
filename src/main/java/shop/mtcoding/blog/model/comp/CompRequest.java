package shop.mtcoding.blog.model.comp;

import jakarta.persistence.*;
import lombok.Data;
import shop.mtcoding.blog.model.skill.Skill;
import shop.mtcoding.blog.model.user.User;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class CompRequest {

    @Data
    public static class JobsViewDTO{

        private Integer id;

        private User user;

        private Integer number;

        private String area;

        private String title;

        private String edu;

        private String career;

        private List<Skill> skillList = new ArrayList<>();

        private String content;

        private Date deadLine;

        private String task;

        private Timestamp createdAt;
    }
}
