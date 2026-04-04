package com.example.mini_udemy_service.services.implementation;

import com.example.mini_udemy_service.mappers.CourseMapper;
import com.example.mini_udemy_service.repositories.CourseRepository;
import com.example.mini_udemy_service.repositories.TeacherRepository;
import com.example.mini_udemy_service.services.contracts.CourseService;
import com.example.mini_udemy_service.services.util.ErrorMessages;
import com.udemy.mini.model.CourseCreateRequestDto;
import com.udemy.mini.model.CourseResponseDto;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService {

    private final CourseRepository courseRepository;
    private final CourseMapper courseMapper;

    @Override
    @Transactional
    public CourseResponseDto createCourse(CourseCreateRequestDto req) {

        if (courseRepository.existsByTitleIgnoreCase(req.getTitle())) {
            throw new ResponseStatusException(
                    HttpStatus.CONFLICT,
                    ErrorMessages.COURSE_ALREADY_EXISTS.formatted(req.getTitle())
            );
        }

        var entity = courseMapper.toEntity(req);

        var saveEntity = courseRepository.save(entity);

        return courseMapper.toDto(saveEntity);
    }
}
