package com.example.mini_udemy_service.repositories;

import com.example.mini_udemy_service.entities.PriceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceRepository extends JpaRepository<PriceEntity, Long> {

}
