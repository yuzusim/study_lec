package com.example.fileapp.pic;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "pic_tb")
@Entity
public class Pic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer userId;

    private Integer resumeId;

    @Column(unique = true)
    private String title;
    private String imgFilename; // 파일 패스



}