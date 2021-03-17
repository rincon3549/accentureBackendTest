package com.accenture.test.backend.accenture.test.backend.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;


@Data
@Entity
@ApiModel(description = "wish of products")
@Table(name = "wish", schema = "public")
public class Wish {
    @ApiModelProperty(notes = "The id wish: could be number autoincrement")
    @Id
    @Column(name = "wish_id")
    @SequenceGenerator(name="client", sequenceName="wish_wish_id_seq", allocationSize = 1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="client")
    private Integer wish_id;

    @ApiModelProperty(notes = "The client id for register wish: could be 1 or 10 ")
    @Column(name = "client_id", nullable = false)
    private int client_id;

    @ApiModelProperty(notes = "The create date of wish : could be 16-03-2021 10:30:00 ")
    @Column(name = "creationdate", nullable = false)
    private Date creation_date;

    @ApiModelProperty(notes = "The state of wish: could be Active or Cancel or Delivered ")
    @Column(name = "wishstate", nullable = false)
    private String wish_state;

}

