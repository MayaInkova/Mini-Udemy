package com.example.mini_udemy_service.services.contracts;

import com.udemy.mini.model.CourseCreateRequestDto;
import com.udemy.mini.model.CourseListResponseDto;
import com.udemy.mini.model.CourseResponseDto;

public interface CourseService {

    CourseResponseDto createCourse(CourseCreateRequestDto courseCreateRequestDto);
    CourseListResponseDto getAllCourses();
    CourseResponseDto getCourseId(Long id);
    void deleteCourse(Long id);
}
