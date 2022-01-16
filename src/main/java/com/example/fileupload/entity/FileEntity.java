package com.example.fileupload.entity;

import lombok.Builder;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "file")
public class FileEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private final String originName;

    private final String newName;

    private final String type;

    private final Long size;

    @CreatedDate
    private LocalDateTime createdAt;

//    @CreatedBy
//    private String createdBy;

    public FileEntity(MultipartFile file, String newFilename) {
        this.originName = file.getOriginalFilename();
        this.newName = newFilename;
        this.type = file.getContentType();
        this.size = file.getSize();
    }
}
