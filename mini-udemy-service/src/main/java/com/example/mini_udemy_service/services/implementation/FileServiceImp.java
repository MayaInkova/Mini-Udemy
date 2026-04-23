package com.example.mini_udemy_service.services.implementation;

import com.example.mini_udemy_service.exceptions.handler.model.FileStorageException;
import com.example.mini_udemy_service.services.contracts.FileService;
import com.example.mini_udemy_service.services.util.ErrorMessages;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Service
public class FileServiceImp implements FileService {

    @Value("${app.storage.location}")
    private String StoragePath;

    @Override
    public void uploadFile(MultipartFile file) {
        if (file.isEmpty() || file.getOriginalFilename() == null) {
            throw new FileStorageException(ErrorMessages.FILE_EMPTY_INVALID);
        }

        Path folder = Paths.get(StoragePath);
        String fileName = file.getOriginalFilename();
        Path fullPatch = folder.resolve(fileName);

        try (InputStream inputStream = file.getInputStream()) {

            if (!Files.exists(folder)) {
                Files.createDirectories(folder);
            }

            Files.copy(inputStream, fullPatch, StandardCopyOption.REPLACE_EXISTING);

        }catch (IOException e ){
            throw  new FileStorageException(ErrorMessages.NOT_SAVE_FILE);
        }

    }


}




