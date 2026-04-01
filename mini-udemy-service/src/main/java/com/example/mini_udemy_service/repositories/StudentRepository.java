package com.example.mini_udemy_service.repositories;

import com.example.mini_udemy_service.entities.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity, Long> {

}
