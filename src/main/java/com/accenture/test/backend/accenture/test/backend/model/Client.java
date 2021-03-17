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
@ApiModel(description = "client for the wish")
@Table(name = "client", schema = "public")
public class Client {
    @Id
    @ApiModelProperty(notes = "The id client : self-increasing value")
    @Column(name = "client_id")
    private int client_id;

    @ApiModelProperty(notes = "The name client : could be Felipe or Johan")
    @Column(name = "name", nullable = false)
    private String name;

    @ApiModelProperty(notes = "The lastname client : could be Rincon or Lopez")
    @Column(name = "lastname", nullable = false)
    private String lastname;

    @ApiModelProperty(notes = "The address client : could be street 11 # 21 # 51")
    @Column(name = "address", nullable = false)
    private String address;

    @ApiModelProperty(notes = "The number phone client : could be 321649852155")
    @Column(name = "numberphone")
    private  String numberphone;

    @ApiModelProperty(notes = "The state client : could be active or inactive")
    @Column(name = "userstate", nullable = false)
    private String userstate;

    @ApiModelProperty(notes = "The identification card client : could be 11442012255 ")
    @Column(name = "identificationcard", nullable = false)
    private int identificationcard;
}
