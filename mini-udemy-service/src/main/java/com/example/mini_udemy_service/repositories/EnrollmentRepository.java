package com.example.mini_udemy_service.repositories;

import com.example.mini_udemy_service.entities.EnrollmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentRepository extends JpaRepository<EnrollmentEntity,Long> {

}
