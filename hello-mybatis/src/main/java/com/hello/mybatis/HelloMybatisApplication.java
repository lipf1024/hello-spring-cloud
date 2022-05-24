package com.hello.mybatis;


import com.hello.mybatis.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloMybatisApplication implements CommandLineRunner {

    @Autowired
    private CityMapper cityMapper;

    public static void main(String[] args) {
        SpringApplication.run(HelloMybatisApplication.class,args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(cityMapper.selectCityById(1));
    }
}
