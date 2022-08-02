package com.hello.mybatis.domain;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 城市
 */
@Data
public class City implements Serializable {

    private Integer id;
    private Region region;
    private Country country;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private String name;
}
