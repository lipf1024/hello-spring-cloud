package com.hello.mybatis.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Hotel implements Serializable {
    private Long city;

    private String name;

    private String address;

    private String zip;
}
