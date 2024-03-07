package shop.mtcoding.blog.model.offer;

import lombok.Data;

public class OfferRequest {

    @Data
    public static class CompOfterDTO {
        private Integer id; // apply 의 키값
        private String ResumeUserName;
        private String ResumeTitle;
        private String JobsTitle;
        private Integer status;
        private Integer jobsId;
        private Integer Number;
    }
}
