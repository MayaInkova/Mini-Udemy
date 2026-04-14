package com.example.mini_udemy_service.services.implementation;

import com.example.mini_udemy_service.entities.CourseEntity;
import com.example.mini_udemy_service.entities.PriceEntity;
import com.example.mini_udemy_service.entities.TeacherEntity;
import com.example.mini_udemy_service.mappers.CourseMapper;
import com.example.mini_udemy_service.mappers.PriceMapper;
import com.example.mini_udemy_service.repositories.CourseRepository;
import com.example.mini_udemy_service.repositories.TeacherRepository;
import com.example.mini_udemy_service.services.contracts.CourseService;
import com.example.mini_udemy_service.services.util.Constants;
import com.example.mini_udemy_service.services.util.ErrorMessages;
import com.udemy.mini.model.CourseCreateRequestDto;
import com.udemy.mini.model.CourseListResponseDto;
import com.udemy.mini.model.CourseResponseDto;
import com.udemy.mini.model.CourseUpdateRequestDto;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;


@Service
@RequiredArgsConstructor

public  class CourseServiceImpl  implements CourseService {

    private final TeacherRepository teacherRepository;
    private final CourseRepository courseRepository;
    private final CourseMapper courseMapper;
    private final PriceMapper priceMapper;


    @Override
    @Transactional
    public CourseResponseDto createCourse(CourseCreateRequestDto req) {


        if (courseRepository.existsByTitleIgnoreCase(req.getTitle())) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, ErrorMessages.COURSE_ALREADY_EXISTS.formatted(req.getTitle()));
        }

        TeacherEntity teacher = teacherRepository.findById(req.getTeacherId())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));

        CourseEntity courseEntity = courseMapper.toEntity(req);

        PriceEntity price = priceMapper.toEntity(req);
        price.setCurrency(Constants.DEFAULT_CURRENCY);
        price.setDiscount(Constants.DEFAULT_DISCOUNT);
        courseEntity.setPrice(price);

        courseEntity.setTeacher(teacher);


        return courseMapper.toDto(courseRepository.save(courseEntity));

    }

    @Override
    public CourseListResponseDto getAllCourses() {

        var allCourses = courseRepository.findAll();

        var dtos = allCourses.stream()
                .map(courseMapper::toCourseDto)
                .toList();

        CourseListResponseDto response = new CourseListResponseDto();
        response.setData(dtos);

        return response;
    }

    @Override
    public CourseResponseDto getCourseId(Long id) {
        CourseEntity courseEntity = courseRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, ErrorMessages.COURSE_NOT_FOUND.formatted()));
        return new CourseResponseDto().data(courseMapper.toCourseDto(courseEntity));
    }

    @Override
    public void deleteCourse(Long id) {
        if (!courseRepository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, ErrorMessages.COURSE_NOT_FOUND.formatted(id));
        }

        courseRepository.deleteById(id);
    }

    @Override
    @Transactional
    public  CourseResponseDto updateCourse(Long id, CourseUpdateRequestDto updateDto){
        CourseEntity courseEntity = courseRepository.findById(id)
                .orElseThrow(() ->  new ResponseStatusException(HttpStatus.NOT_FOUND,ErrorMessages.COURSE_NOT_FOUND.formatted(id)));

                courseEntity.setTitle(updateDto.getTitle());
                courseEntity.setDescription(updateDto.getDescription());

                return  courseMapper.toDto(courseRepository.save(courseEntity));
    }

}




