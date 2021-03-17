package com.accenture.test.backend.accenture.test.backend.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Data
@Entity
@Table(name = "bill", schema = "public")
public class Bill {
    @Id
    @Column(name = "bill_id")
    private int bill_id;

    @Column(name = "date_bill", nullable = false)
    private Date date_bill;

    @Column(name = "wish", nullable = false)
    private int wish;

    @Column(name = "iva", nullable = false)
    private double iva;

    @Column(name = "domicile", nullable = false)
    private double domicile;

    @Column(name = "total", nullable = false)
    private double total;

}
