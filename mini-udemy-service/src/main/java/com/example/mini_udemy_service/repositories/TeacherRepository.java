package com.example.mini_udemy_service.repositories;

import com.example.mini_udemy_service.entities.TeacherEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<TeacherEntity, Long> {

    Boolean existsByEmailIgnoreCase(String email);

}
