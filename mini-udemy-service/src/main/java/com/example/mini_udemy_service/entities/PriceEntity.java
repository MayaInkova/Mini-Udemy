package com.example.mini_udemy_service.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "prices")
@NoArgsConstructor
@Getter
@Setter
public class PriceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private java.math.BigDecimal amount;

    @Column(length = 3)
    private String currency;


    @ManyToOne
    @JoinColumn(name = "course_id") // ТОВА е правилното име на колоната в SQL
    private CourseEntity course;

}
