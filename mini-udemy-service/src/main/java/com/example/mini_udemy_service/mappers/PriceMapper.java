package com.example.mini_udemy_service.mappers;

import com.example.mini_udemy_service.entities.CourseEntity;
import com.example.mini_udemy_service.entities.PriceEntity;
import com.udemy.mini.model.CourseCreateRequestDto;
import com.udemy.mini.model.PriceDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

@Mapper(componentModel = SPRING)
public interface PriceMapper {

    @Mapping(target = "amount", source = "priceAmount")
    PriceEntity toEntity(CourseCreateRequestDto dto);

    PriceDto toDto(PriceEntity entity );
}
