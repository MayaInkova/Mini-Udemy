package com.example.mini_udemy_service.services.implementation;

import com.example.mini_udemy_service.entities.CourseEntity;
import com.example.mini_udemy_service.entities.PriceEntity;
import com.example.mini_udemy_service.entities.TeacherEntity;
import com.example.mini_udemy_service.mappers.CourseMapper;
import com.example.mini_udemy_service.repositories.CourseRepository;
import com.example.mini_udemy_service.repositories.PriceRepository;
import com.example.mini_udemy_service.repositories.TeacherRepository;
import com.example.mini_udemy_service.services.contracts.CourseService;
import com.example.mini_udemy_service.services.util.Constants;
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
    private  final TeacherRepository teacherRepository;
    private final PriceRepository priceRepository;


    @Override
    @Transactional
    public CourseResponseDto createCourse(CourseCreateRequestDto req) {

        if (courseRepository.existsByTitleIgnoreCase(req.getTitle())) {
            throw new ResponseStatusException(
                    HttpStatus.CONFLICT,
                    ErrorMessages.COURSE_ALREADY_EXISTS.formatted(req.getTitle())
            );
        }

        TeacherEntity teacher = teacherRepository.findById(req.getTeacherId())
                .orElseThrow(()  -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Teacher not found"));

        PriceEntity priceEntity = new PriceEntity();
        priceEntity.setAmount(req.getPriceAmount());
        priceEntity.setCurrency(Constants.DEFAULT_CURRENCY);
        priceEntity = priceRepository.save(priceEntity);

        CourseEntity courseEntity = courseMapper.toEntity(req);

        courseEntity.setTeacher(teacher);
        courseEntity.setPrice(priceEntity);

        CourseEntity savedCourse = courseRepository.save(courseEntity);

        return courseMapper.toDto(savedCourse);
    }
}
