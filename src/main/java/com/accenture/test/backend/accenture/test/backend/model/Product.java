package com.accenture.test.backend.accenture.test.backend.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "product", schema = "public")
public class Product {

    @Id
    @Column(name = "product_id")
    private int product_id;

    @Column(name = "productname", nullable = false)
    private String product_name;

    @Column(name = "price", nullable = false)
    private int price;
}
