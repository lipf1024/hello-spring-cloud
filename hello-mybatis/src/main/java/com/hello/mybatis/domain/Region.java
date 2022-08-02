package com.hello.mybatis.domain;

import lombok.Data;

/**
 * 洲
 */
@Data
public class Region {
    private Integer id;
    private String name;
    private String code;
    private short countryId;
}
