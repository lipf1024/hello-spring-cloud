package com.hello.mybatis.configuration;

import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "com.hello.mybatis.mapper",sqlSessionFactoryRef = "primarySqlSessionFactory")
public class PrimaryDataSourceConfig {

    @Bean("primaryDataSource")
    @Primary
    @ConfigurationProperties("spring.datasource.primary")
    public DataSource createDataSource() {
        return  DataSourceBuilder.create().build();
    }

    @Bean("primarySqlSessionFactory")
    @Primary
    public SqlSessionFactory createSqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
        sqlSessionFactory.setDataSource(createDataSource());
        sqlSessionFactory.setMapperLocations(
                new PathMatchingResourcePatternResolver().
                getResources("classpath:mappers/*.xml"));
//        sqlSessionFactory.setConfigLocation(new PathMatchingResourcePatternResolver()
//                .getResource("classpath:mapper-config.xml"));
        return sqlSessionFactory.getObject();
    }


    @Bean("primaryTransactionManager")
    @Primary
    public PlatformTransactionManager createPlatformTramsactionManager(){
        return  new DataSourceTransactionManager(createDataSource());
    }
}
