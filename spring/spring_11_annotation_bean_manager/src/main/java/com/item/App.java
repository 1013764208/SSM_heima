package com.item;

import com.item.config.SpringConfig;
import com.item.dao.BookDao;
import com.item.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

public class App {
    public static void main(String[] args) {


        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        DataSource ds = ctx.getBean(DataSource.class);
        System.out.println(ds);


    }
}
