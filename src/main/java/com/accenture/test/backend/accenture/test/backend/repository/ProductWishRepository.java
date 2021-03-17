package com.accenture.test.backend.accenture.test.backend.repository;
import com.accenture.test.backend.accenture.test.backend.model.ProductsWish;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductWishRepository extends JpaRepository<ProductsWish, Integer> {
}
