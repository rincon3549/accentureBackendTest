package com.accenture.test.backend.accenture.test.backend.service.impl;

import com.accenture.test.backend.accenture.test.backend.model.Wish;
import com.accenture.test.backend.accenture.test.backend.repository.WishRepository;
import com.accenture.test.backend.accenture.test.backend.service.WishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WishServiceImpl implements WishService {
    private final WishRepository wishRepository;

    @Autowired
    public WishServiceImpl(WishRepository wishRepository) {
        this.wishRepository = wishRepository;
    }

    @Override
    public List<Wish> ConsultWish(Long id) {
        return null;
    }
}
