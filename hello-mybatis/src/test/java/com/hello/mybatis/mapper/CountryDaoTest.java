package com.hello.mybatis.mapper;


import com.github.pagehelper.PageRowBounds;
import org.apache.ibatis.session.RowBounds;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CountryDaoTest {
    @Autowired
    private CountryDao countryDao;

    @Autowired
    private CityDao cityDao;

    @Test
    public void testFindById() {
        System.out.println(cityDao.findById(1));
        //System.out.println(countryDao.findById((short) 1));
    }

    @Test
    public void testPageQuery(){
        final PageRowBounds bounds=new PageRowBounds(10,10);
        System.out.println(cityDao.findByPage(bounds));
        System.out.println(bounds.getTotal());
    }
}