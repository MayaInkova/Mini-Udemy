package com.example.mini_udemy_service.controllers;
import com.example.mini_udemy_service.services.contracts.CourseService;
import com.udemy.mini.api.CoursesApi;
import com.udemy.mini.model.CourseCreateRequestDto;
import com.udemy.mini.model.CourseListResponseDto;
import com.udemy.mini.model.CourseResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CourseController implements CoursesApi {

    private final CourseService courseService;

    @Override
    public ResponseEntity<CourseResponseDto> createCourse(CourseCreateRequestDto courseCreateRequestDto) {
        var response = courseService.createCourse(courseCreateRequestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @Override
    public ResponseEntity<CourseListResponseDto> getAllCourses() {
        var response = courseService.getAllCourses();
        return ResponseEntity.ok(response);
    }

    @Override
    public ResponseEntity<CourseResponseDto> getCourseId(Long id){
        var response = courseService.getCourseId(id);
        return ResponseEntity.ok(response);
    }
    @Override
    public ResponseEntity<Void> deleteCourse(Long id) {
        courseService.deleteCourse(id);
        return  ResponseEntity.noContent().build();
    }
}
