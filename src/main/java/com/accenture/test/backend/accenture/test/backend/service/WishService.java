package com.accenture.test.backend.accenture.test.backend.service;

import com.accenture.test.backend.accenture.test.backend.model.Wish;

import java.util.List;

public interface WishService {
    List<Wish> ConsultWish(Long id);
}
