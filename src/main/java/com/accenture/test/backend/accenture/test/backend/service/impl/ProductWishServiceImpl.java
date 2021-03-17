package com.accenture.test.backend.accenture.test.backend.service.impl;

import com.accenture.test.backend.accenture.test.backend.repository.ProductRepository;
import com.accenture.test.backend.accenture.test.backend.repository.ProductWishRepository;
import com.accenture.test.backend.accenture.test.backend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductWishServiceImpl implements ProductService {

    private final ProductWishRepository productWishRepository;

    @Autowired
    public ProductWishServiceImpl(ProductWishRepository productWishRepository) {
        this.productWishRepository = productWishRepository;
    }
}
