package com.example.mini_udemy_service.services.implementation;

import com.example.mini_udemy_service.services.contracts.TeacherService;
import com.udemy.mini.model.TeacherCreateRequestDto;
import com.udemy.mini.model.TeacherListResponseDto;
import com.udemy.mini.model.TeacherResponseDto;
import com.udemy.mini.model.TeacherUpdateRequestDto;
import org.springframework.stereotype.Service;


@Service
public class TeacherServiceImpl implements TeacherService {

    @Override
    public TeacherResponseDto createTeacher(TeacherCreateRequestDto teacherCreateRequestDto){
        return  null;
    }
    @Override
     public  TeacherListResponseDto getAllTeacher(){
        return  null;
    }

    @Override
    public  TeacherResponseDto getTeacherId(Long id){
        return  null;

    }
    @Override
    public void  deleteTeacher(Long id){

    }
    @Override
    public TeacherResponseDto updateTeacher(Long id, TeacherUpdateRequestDto teacherUpdateRequestDto){
        return  null;
    }

}
