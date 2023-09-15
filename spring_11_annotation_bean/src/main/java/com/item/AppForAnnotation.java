package com.item;

import com.item.config.SpringConfig;
import com.item.dao.BookDao;
import com.item.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForAnnotation {
    public static void main(String[] args) {


        // 加载配置类
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        System.out.println(bookDao);

        BookService bookService = ctx.getBean(BookService.class);
        System.out.println(bookService);
    }
}
