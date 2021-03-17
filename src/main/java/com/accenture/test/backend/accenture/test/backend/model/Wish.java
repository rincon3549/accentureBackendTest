package com.accenture.test.backend.accenture.test.backend.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Data
@Entity
@Table(name = "wish", schema = "public")
public class Wish {

    @Id
    @Column(name = "wish_id")
    private Integer wish_id;

    @Column(name = "client_id", nullable = false)
    private int client_id;

    @Column(name = "creationdate", nullable = false)
    private Date creation_date;

    @Column(name = "wishstate", nullable = false)
    private String wish_state;

}

