package com.example.mini_udemy_service.controllers;
import com.example.mini_udemy_service.services.contracts.CourseService;
import com.udemy.mini.api.CoursesApi;
import com.udemy.mini.model.CourseCreateRequestDto;
import com.udemy.mini.model.CourseResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CourseController implements CoursesApi  {

    public final CourseService courseService;

    @Override
    public ResponseEntity<CourseResponseDto>createCourse(CourseCreateRequestDto body) {
        var response = courseService.createCourse(body);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }



}
