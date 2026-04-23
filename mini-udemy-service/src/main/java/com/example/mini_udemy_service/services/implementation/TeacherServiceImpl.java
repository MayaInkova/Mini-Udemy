package com.example.mini_udemy_service.services.implementation;

import com.example.mini_udemy_service.entities.TeacherEntity;
import com.example.mini_udemy_service.exceptions.handler.model.BadRequestException;
import com.example.mini_udemy_service.exceptions.handler.model.ConflictException;
import com.example.mini_udemy_service.mappers.TeacherMapper;
import com.example.mini_udemy_service.repositories.TeacherRepository;
import com.example.mini_udemy_service.services.contracts.TeacherService;
import com.example.mini_udemy_service.services.util.ErrorMessages;
import com.udemy.mini.model.*;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@RequiredArgsConstructor
@Service
public class TeacherServiceImpl implements TeacherService {

    private final TeacherRepository teacherRepository;
    private final TeacherMapper teacherMapper;


    @Override
    @Transactional
    public TeacherResponseDto createTeacher(TeacherCreateRequestDto teacherCreateRequestDto){
        if (teacherRepository.existsByEmailIgnoreCase(teacherCreateRequestDto.getEmail())) {
            throw new ConflictException(ErrorMessages.TEACHER_ALREADY_EXISTS);

        }

        var teacherEntity = teacherMapper.toEntity(teacherCreateRequestDto);

        var savedTeacher = teacherRepository.save(teacherEntity);

        return  new TeacherResponseDto().data(teacherMapper.toDto(savedTeacher));

    }

    @Override
     public  TeacherListResponseDto getAllTeacher(){

        var allTeacher = teacherRepository.findAll();

        var dtos =allTeacher.stream()
                .map(teacherMapper::toDto)
                .toList();

        TeacherListResponseDto response = new TeacherListResponseDto();
        response.setData(dtos);

        return response;
    }


    @Override
    public  TeacherResponseDto getTeacherId(Long id){
        var teacherEntity = teacherRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,ErrorMessages.TEACHER_NOT_FOUND));

        return  new TeacherResponseDto().data(teacherMapper.toDto(teacherEntity));

    }
    @Override
    public void  deleteTeacher(Long id){
        if (!teacherRepository.existsById(id)) {
            throw new BadRequestException(ErrorMessages.TEACHER_NOT_FOUND.formatted(id));
        }

        teacherRepository.deleteById(id);
    }

    @Override
    public TeacherResponseDto updateTeacher(Long id, TeacherUpdateRequestDto teacherUpdateRequestDto){
        TeacherEntity teacherEntity = teacherRepository.findById(id)
                .orElseThrow(() ->  new ResponseStatusException(HttpStatus.NOT_FOUND,ErrorMessages.TEACHER_NOT_FOUND.formatted(id)));

        teacherMapper.updateEntityFromDto(teacherUpdateRequestDto, teacherEntity);

        TeacherEntity saved = teacherRepository.save(teacherEntity);

        return  new TeacherResponseDto().data(teacherMapper.toDto(saved));


    }

}
