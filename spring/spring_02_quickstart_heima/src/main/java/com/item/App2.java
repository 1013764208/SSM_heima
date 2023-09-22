package com.item;

import com.item.dao.BookDao;
import com.item.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
    public static void main(String[] args) {

        // 3.获取IOC容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");


//        BookService bookService = (BookService) ctx.getBean("bookService");
        BookService bookService = (BookService) ctx.getBean("bookService2");  // 别名
        bookService.save();
    }
}
