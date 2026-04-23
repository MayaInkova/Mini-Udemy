package com.example.mini_udemy_service.services.contracts;

import org.springframework.web.multipart.MultipartFile;

public interface FileService {
    void uploadFile(MultipartFile file);
}
