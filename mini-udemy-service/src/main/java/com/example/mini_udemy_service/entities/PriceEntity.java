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

    @Column(nullable = false)
    private String currency;

}
