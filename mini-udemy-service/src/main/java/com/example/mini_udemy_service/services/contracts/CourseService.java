package com.example.mini_udemy_service.services.contracts;

import com.example.mini_udemy_service.controllers.CourseController;
import com.udemy.mini.model.CourseCreateRequestDto;
import com.udemy.mini.model.CourseResponseDto;

public interface CourseService {

    CourseResponseDto createCourse(CourseCreateRequestDto courseCreateRequestDto);
}
