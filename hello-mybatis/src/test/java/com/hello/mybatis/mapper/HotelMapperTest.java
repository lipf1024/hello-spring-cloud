package com.hello.mybatis.mapper;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HotelMapperTest {

    //    @Autowired
//    private CityMapper mapper;
    @Autowired
    ApplicationContext context;

    @Test
    public void test() {
        System.out.println(context.getId());
    }
}