package com.hello.mybatis.mapper;

import com.hello.mybatis.domain.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

@Mapper
public interface CityDao {

    City findById(@Param("id") final int id);

    List<City> findByPage(final RowBounds rowBounds);
}
