package com.accenture.test.backend.accenture.test.backend.repository;
import com.accenture.test.backend.accenture.test.backend.model.Wish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface  WishRepository extends JpaRepository<Wish, Integer> {

    @Query(value = " SELECT W FROM Wish W ")
    List<Wish> getAllWish();
}