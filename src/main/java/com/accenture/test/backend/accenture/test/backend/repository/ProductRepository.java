package com.accenture.test.backend.accenture.test.backend.repository;

import com.accenture.test.backend.accenture.test.backend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
