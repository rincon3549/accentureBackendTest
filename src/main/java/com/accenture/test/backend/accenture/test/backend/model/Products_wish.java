package com.accenture.test.backend.accenture.test.backend.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "product", schema = "public")
public class Products_wish {
    @Id
    @Column(name = "products_wish_id")
    private int products_wish_id;

    @Column(name = "wish_id", nullable = false)
    private int wish_id;

    @Column(name = "product_id", nullable = false)
    private int product_id;

    @Column(name = "quantity", nullable = false)
    private int quantity;

}
