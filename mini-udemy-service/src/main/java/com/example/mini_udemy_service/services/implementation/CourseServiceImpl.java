package com.example.mini_udemy_service.services.implementation;

import com.example.mini_udemy_service.entities.CourseEntity;
import com.example.mini_udemy_service.entities.PriceEntity;
import com.example.mini_udemy_service.entities.TeacherEntity;
import com.example.mini_udemy_service.exceptions.handler.model.BadRequestException;
import com.example.mini_udemy_service.exceptions.handler.model.ConflictException;
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
import org.springframework.data.domain.Pageable;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;


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
            throw new ConflictException(ErrorMessages.COURSE_ALREADY_EXISTS.formatted(req.getTitle()));
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
    public CourseListResponseDto getAllCourses(Integer size, Integer page, List<String> sort, List<String> filter) {

        Specification<CourseEntity> spec = (root, query, cd) -> {
            if (filter == null || filter.isEmpty()) return null;
            return cd.like(root.get("title"), "%" + filter.get(0) + "%");

        };
        Pageable pageable = PageRequest.of(page, size);

        var coursePage = courseRepository.findAll(spec, pageable);

        var dtos = coursePage.getContent().stream()
                .map(courseMapper::toCourseDto)
                .toList();
        return new CourseListResponseDto().data(dtos);

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
            throw new BadRequestException(ErrorMessages.COURSE_NOT_FOUND.formatted(id));
        }

        courseRepository.deleteById(id);
    }

    @Override
    @Transactional
    public  CourseResponseDto updateCourse(Long id, CourseUpdateRequestDto updateDto){
        CourseEntity courseEntity = courseRepository.findById(id)
                .orElseThrow(() ->  new BadRequestException(ErrorMessages.COURSE_NOT_FOUND.formatted(id)));

                courseEntity.setTitle(updateDto.getTitle());
                courseEntity.setDescription(updateDto.getDescription());

                return  courseMapper.toDto(courseRepository.save(courseEntity));
    }

}




