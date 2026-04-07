package com.example.mini_udemy_service.entities;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "courses")
@NoArgsConstructor
@Getter
@Setter
public class CourseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private  String title;

    private  String description;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "price_id")
    private  PriceEntity price;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private  TeacherEntity teacher;

}
