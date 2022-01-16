package com.example.fileupload.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface FileService {

    String uploadFile(String originalFileName, MultipartFile file) throws IOException;

}
