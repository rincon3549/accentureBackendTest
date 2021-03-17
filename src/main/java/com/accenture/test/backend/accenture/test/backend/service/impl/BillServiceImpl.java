package com.accenture.test.backend.accenture.test.backend.service.impl;

import com.accenture.test.backend.accenture.test.backend.repository.BillRepository;
import com.accenture.test.backend.accenture.test.backend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

public class BillServiceImpl implements ProductService {

    private final BillRepository billRepository;

    @Autowired
    public BillServiceImpl(BillRepository billRepository) {
        this.billRepository = billRepository;
    }
}
