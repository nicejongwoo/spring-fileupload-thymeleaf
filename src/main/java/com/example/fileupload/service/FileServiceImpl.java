package com.example.fileupload.service;

import com.example.fileupload.entity.FileEntity;
import com.example.fileupload.repository.FileRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Service
@Slf4j
@RequiredArgsConstructor
public class FileServiceImpl implements FileService {

    private final FileRepository fileRepository;

    @Value("${upload.directory}")
    private String uploadDirectory;

    @Override
    public String uploadFile(String originalFileName, MultipartFile file) throws IOException {
        byte[] fileData = file.getBytes();

        //유일 ID 생성
        UUID uuid = UUID.randomUUID();
        //새로운 파일이름 생성
        String newFileName = uuid.toString() + "_" + originalFileName;

        log.info("uploadPath: {}", uploadDirectory);
        log.info("newFileName: {}", newFileName);

        //경로에 파일 생성
        makeFiles(fileData, newFileName);

        //DB저장
        FileEntity fileEntity = new FileEntity(file, newFileName);

        fileRepository.save(fileEntity);
        return null;
    }

    private void makeFiles(byte[] fileData, String newFileName) throws IOException {
        //폴더생성
        makeDir(uploadDirectory);

        //파일생성
        File target = new File(uploadDirectory, newFileName);
        FileCopyUtils.copy(fileData, target);
    }

    private static void makeDir(String path) throws IOException {
        File directory = new File(path);
        if (!directory.exists()) {
            directory.mkdir();
        }
//        Files.createDirectory(Paths.get(path));
    }
}
