package com.example.mini_udemy_service.controllers;

import com.example.mini_udemy_service.services.contracts.FileService;
import com.udemy.mini.api.FilesApi;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.multipart.MultipartFile;

@RequiredArgsConstructor
@Controller
public class FilesController implements FilesApi {

    private final FileService fileService;

    @Override
    public ResponseEntity<Void> uploadFile(MultipartFile file) {
      return   ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }
}
