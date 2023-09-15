package com.item.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.item.dao.BookDao;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;


public class JdbcConfig {

    @Bean
    public void dataSource(BookDao bookDao) {  // 括号中填入你要引用的对象
        System.out.println(bookDao);
    }
}
