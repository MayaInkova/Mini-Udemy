package com.example.mini_udemy_service.services.contracts;

import com.udemy.mini.model.TeacherCreateRequestDto;
import com.udemy.mini.model.TeacherListResponseDto;
import com.udemy.mini.model.TeacherResponseDto;
import com.udemy.mini.model.TeacherUpdateRequestDto;

public interface TeacherService {

    TeacherResponseDto createTeacher(TeacherCreateRequestDto teacherCreateRequestDto);
    TeacherListResponseDto getAllTeacher();
    TeacherResponseDto getTeacherId(Long id);
    void deleteTeacher(Long id);
    TeacherResponseDto updateTeacher(Long id, TeacherUpdateRequestDto teacherUpdateRequestDto);
}
