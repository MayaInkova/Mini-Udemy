package com.example.mini_udemy_service.services.implementation;

import com.example.mini_udemy_service.services.contracts.CourseService;
import com.udemy.mini.model.CourseCreateRequestDto;
import com.udemy.mini.model.CourseResponseDto;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {

    @Override
    public CourseResponseDto createCourse(CourseCreateRequestDto courseCreateRequestDto) {
        return new CourseResponseDto();
    }
}