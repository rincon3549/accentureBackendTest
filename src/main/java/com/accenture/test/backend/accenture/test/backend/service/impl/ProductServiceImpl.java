package com.accenture.test.backend.accenture.test.backend.service.impl;
import com.accenture.test.backend.accenture.test.backend.repository.ProductRepository;
import com.accenture.test.backend.accenture.test.backend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
}
