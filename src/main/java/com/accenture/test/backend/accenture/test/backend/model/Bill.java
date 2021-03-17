package com.accenture.test.backend.accenture.test.backend.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@ApiModel(description = "Bill for the wish")
@Table(name = "bill", schema = "public")
public class Bill {
    @Id
    @ApiModelProperty(notes = "The id bill : self-increasing value")
    @SequenceGenerator(name="bill", sequenceName="bill_bill_id_seq", allocationSize = 1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="bill")
    @Column(name = "bill_id")
    private int bill_id;

    @ApiModelProperty(notes = "The date bill: creation date 16-03-2021 10:21:00 ")
    @Column(name = "date_bill", nullable = false)
    private Date date_bill;

    @ApiModelProperty(notes = "The wish bill : id of wish ")
    @Column(name = "wish", nullable = false)
    private int wish;

    @ApiModelProperty(notes = "The iva bill : could be 0 or 19 % del valor de la venta ")
    @Column(name = "iva", nullable = false)
    private double iva;

    @ApiModelProperty(notes = "The domicile bill : could be 0 or 20000 ")
    @Column(name = "domicile", nullable = false)
    private double domicile;

    @ApiModelProperty(notes = "The total bill : could be 70000 or 100000 ")
    @Column(name = "total", nullable = false)
    private double total;

}
