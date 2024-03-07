package com.example.fileapp.pic;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

public class PicRequest {

    @Data
    public static class UploadDTO{
        private String title;
        private MultipartFile imgFile;
    }
}