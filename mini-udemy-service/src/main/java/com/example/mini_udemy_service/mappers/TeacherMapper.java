package com.example.mini_udemy_service.mappers;

import com.example.mini_udemy_service.entities.TeacherEntity;
import com.udemy.mini.model.TeacherDto;
import org.mapstruct.Mapper;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

@Mapper(componentModel = SPRING)
public interface TeacherMapper {
    TeacherEntity toEntity(TeacherDto dto);

    TeacherDto toDto(TeacherEntity entity);
}
