package com.example.mini_udemy_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class MiniUdemyServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiniUdemyServiceApplication.class, args);
	}

}
