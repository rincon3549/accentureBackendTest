package com.accenture.test.backend.accenture.test.backend.model.Dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Getter
@Builder
@ToString
@ApiModel(description = "ProductDto for service consumption")
public class ProductDto {
    @ApiModelProperty(notes = "The id product: could be 1 or 10 ")
    private int product_id;
    @ApiModelProperty(notes = "The quantity product: could be 1 or 10 ")
    private int quantity;
    @ApiModelProperty(notes = "The     private int price product: could be 20000 or 140000 ")
    private int price;
}
