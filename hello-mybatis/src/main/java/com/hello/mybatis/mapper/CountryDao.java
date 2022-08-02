package com.hello.mybatis.mapper;

import com.hello.mybatis.domain.Country;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CountryDao {

    Country findById(@Param("id") final short id);
}
