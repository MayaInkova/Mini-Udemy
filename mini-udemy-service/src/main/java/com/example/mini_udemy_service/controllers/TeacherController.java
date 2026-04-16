package com.example.mini_udemy_service.controllers;

import com.example.mini_udemy_service.services.contracts.TeacherService;
import com.udemy.mini.api.TeachersApi;
import com.udemy.mini.model.TeacherCreateRequestDto;
import com.udemy.mini.model.TeacherListResponseDto;
import com.udemy.mini.model.TeacherResponseDto;
import com.udemy.mini.model.TeacherUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TeacherController implements TeachersApi {

    private final TeacherService teacherService;

    @Override
    public ResponseEntity<TeacherResponseDto>createTeacher(TeacherCreateRequestDto teacherCreateRequestDto){
        var response = teacherService.createTeacher(teacherCreateRequestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
    @Override
     public ResponseEntity<TeacherListResponseDto> getAllTeacher() {
        var response = teacherService.getAllTeacher();
        return ResponseEntity.ok(response);
    }
    @Override
    public ResponseEntity<TeacherResponseDto>getTeacherId(Long id){
        var response = teacherService.getTeacherId(id);
        return ResponseEntity.ok(response);
    }

    @Override
    public ResponseEntity<Void>deleteTeacher(Long id){
         teacherService.deleteTeacher(id);
        return  ResponseEntity.noContent().build();
    }

    @Override
    public ResponseEntity<TeacherResponseDto>updateTeacher(Long id, TeacherUpdateRequestDto teacherUpdateRequestDto){
        var response = teacherService.updateTeacher(id, teacherUpdateRequestDto);
        return ResponseEntity.ok(response);
    }


}
