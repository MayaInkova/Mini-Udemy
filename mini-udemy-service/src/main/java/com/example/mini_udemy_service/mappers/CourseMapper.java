package com.example.mini_udemy_service.mappers;

import com.example.mini_udemy_service.entities.CourseEntity;
import com.udemy.mini.model.CourseCreateRequestDto;
import com.udemy.mini.model.CourseDto;
import com.udemy.mini.model.CourseResponseDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

@Mapper(componentModel = SPRING)
public interface CourseMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "price", ignore = true)
    @Mapping(target = "teacher", ignore = true)
    CourseEntity toEntity(CourseCreateRequestDto dto);

    CourseDto toCourseDto(CourseEntity entity);

    @Mapping(source = "entity", target = "data")
    CourseResponseDto toDto(CourseEntity entity);
}
