package com.accenture.test.backend.accenture.test.backend.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "client", schema = "public")
public class Client {
    @Id
    @Column(name = "client_id")
    private int client_id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "lastname", nullable = false)
    private String lastname;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "numberphone")
    private  String number_phone;

    @Column(name = "userstate", nullable = false)
    private String user_state;

    @Column(name = "identificationcard", nullable = false)
    private int identification_card;
}
