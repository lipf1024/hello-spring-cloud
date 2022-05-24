package com.hello.mybatis.mapper;

import com.hello.mybatis.domain.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CityMapper {

    City selectCityById(final @Param("id") int id);
}
