package com.accenture.test.backend.accenture.test.backend.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@ApiModel(description = "ProductsWish for wish")
@Table(name = "products_wish", schema = "public")
public class ProductsWish {
    @Id
    @ApiModelProperty(notes = "The products_wish_id ProductsWish: could be 1 or 10 ")
    @SequenceGenerator(name="product_wish", sequenceName="products_wish_products_wish_id_seq", allocationSize = 1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="product_wish")
    @Column(name = "products_wish_id")
    private int products_wish_id;
    @ApiModelProperty(notes = "The wish_id ProductsWish: could be 1 or 10 ")
    @Column(name = "wish_id", nullable = false)
    private int wish_id;
    @ApiModelProperty(notes = "The product_id ProductsWish: could be 1 or 6 ")
    @Column(name = "product_id", nullable = false)
    private int product_id;
    @ApiModelProperty(notes = "The quantity of product: could be 1 or 100 ")
    @Column(name = "quantity", nullable = false)
    private int quantity;

}
