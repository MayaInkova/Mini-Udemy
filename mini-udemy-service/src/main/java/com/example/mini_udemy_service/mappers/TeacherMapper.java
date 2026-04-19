package com.example.mini_udemy_service.mappers;

import com.example.mini_udemy_service.entities.TeacherEntity;
import com.udemy.mini.model.TeacherCreateRequestDto;
import com.udemy.mini.model.TeacherDto;
import com.udemy.mini.model.TeacherUpdateRequestDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

@Mapper(componentModel = SPRING)
public interface TeacherMapper {
    TeacherEntity toEntity(TeacherCreateRequestDto dto);

    TeacherDto toDto(TeacherEntity entity);
    void updateEntityFromDto(TeacherUpdateRequestDto dto, @MappingTarget TeacherEntity entity);
}
