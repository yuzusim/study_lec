package shop.mtcoding.blog.model.jobs;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.sql.Timestamp;

public class JobRequest {

    @Data
    public static class JobWriterDTO{
        private Integer id;

        private Integer compId;

        private String title;

        private String area;

        private String edu;

        private String career;

        private String content;

        private Date deadLine;

        private String task;

        private Timestamp createdAt;
    }

    @Data
    public static class JobUpdateDTO{
        private Integer id;

        private Integer compId;

        private String title;

        private String area;

        private String edu;

        private String career;

        private String content;

        private Date deadLine;

        private String task;

        private Timestamp createdAt;
    }


    @Data
    @Builder
    public static class JobJoinDTO{
        private Integer id;
        private Integer compId;
        private String compName;
        private String phone;
        private String area;
        private String edu;
        private String content;
        private String task;
        private String title;
        private String homepage;
        private String career;
        private String deadLine;
        private String businessNumber;
    }

    @Builder
    @Data
    public static class JobDeleteDTO{
        private Integer compId;
    }
}
