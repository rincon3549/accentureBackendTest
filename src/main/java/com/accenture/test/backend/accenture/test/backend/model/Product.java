package com.accenture.test.backend.accenture.test.backend.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@ApiModel(description = "Product for wish")
@Table(name = "product", schema = "public")
public class Product {

    @Id
    @ApiModelProperty(notes = "The id product: could be 1 or 10 ")
    @Column(name = "product_id")
    private int product_id;
    @ApiModelProperty(notes = "The name product: could be headphones or pines ")
    @Column(name = "productname", nullable = false)
    private String product_name;
    @ApiModelProperty(notes = "The     private int price product: could be 20000 or 140000 ")
    @Column(name = "price", nullable = false)
    private int price;
}
