package shop.mtcoding.blog.model.skill;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

public class SkillRequest {
    @Data
    @Builder
    public static class CompskillDTO{
        private String name;
        private String color;
    }

    @Data
    @Builder
    public static class UserskillDTO{
        private String name;
        private String color;
    }

    @Data
    @Builder
    public static class JobsSkillDTO{
        private String name;
        private String color;
    }

    @Data
    public static class ApplyskillDTO{
        private String name;
        private String color;

        public ApplyskillDTO(String name, String color) {
            String colorClass = "";
            if (name.equals("jQuery")){
                colorClass = "badge bg-primary";
            }
            else if(name.equals("javaScript")){
                colorClass = "badge bg-secondary";
            }
            else if(name.equals("Spring")){
                colorClass = "badge bg-success";
            }
            else if(name.equals("HTML/CSS")){
                colorClass = "badge bg-danger";
            }
            else if(name.equals("JSP")){
                colorClass = "badge bg-warning";
            }
            else if(name.equals("java")){
                colorClass = "badge bg-info";
            }
            else if(name.equals("React")){
                colorClass = "badge bg-dark";
            }

            this.name = name;
            this.color = colorClass;
        }
    }
}
