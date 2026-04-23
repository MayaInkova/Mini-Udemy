package com.example.mini_udemy_service.repositories;

import com.example.mini_udemy_service.entities.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CourseRepository extends JpaRepository<CourseEntity, Long>, JpaSpecificationExecutor<CourseEntity> {

    boolean existsByTitleIgnoreCase(String title);


}
