package com.hello.mybatis.mapper;

import com.hello.mybatis.domain.Hotel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HotelMapper {

     Hotel selectByCityId(final @Param("id") int id);
}
