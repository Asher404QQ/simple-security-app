package ru.kors.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(
        schema = "security",
        name = "product"
)
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private Double price;
    @Column(name = "currency")
    @Enumerated(EnumType.STRING)
    private Currency currency;
}
