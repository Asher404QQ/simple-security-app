package ru.kors.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kors.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
