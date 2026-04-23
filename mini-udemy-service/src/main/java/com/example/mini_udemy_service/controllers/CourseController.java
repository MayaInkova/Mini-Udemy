package com.example.mini_udemy_service.controllers;
import com.example.mini_udemy_service.services.contracts.CourseService;
import com.udemy.mini.api.CoursesApi;
import com.udemy.mini.model.CourseCreateRequestDto;
import com.udemy.mini.model.CourseListResponseDto;
import com.udemy.mini.model.CourseResponseDto;
import com.udemy.mini.model.CourseUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class
CourseController implements CoursesApi {

    private final CourseService courseService;

    @Override
    public ResponseEntity<CourseResponseDto> createCourse(CourseCreateRequestDto courseCreateRequestDto) {
        var response = courseService.createCourse(courseCreateRequestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @Override
    public ResponseEntity<CourseListResponseDto>getAllCourses(Integer page, Integer size, List<String>sort, List<String>filter){
        var response = courseService.getAllCourses(page, size ,sort, filter);
        return ResponseEntity.ok(response);
    }

    @Override
    public ResponseEntity<CourseResponseDto> getCourseId(Long id){
        var response = courseService.getCourseId(id);
        return ResponseEntity.ok(response);
    }
   @Override
    public ResponseEntity<Void>deleteCourse(Long id){
        courseService.deleteCourse(id);
        return ResponseEntity.noContent().build();

    }
    @Override
    public  ResponseEntity<CourseResponseDto> updateCourse(Long id, CourseUpdateRequestDto courseUpdateRequestDto){
        var response = courseService.updateCourse(id, courseUpdateRequestDto);
        return ResponseEntity.ok(response);
    }
}
