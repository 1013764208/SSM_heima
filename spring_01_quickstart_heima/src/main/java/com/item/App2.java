package com.item;

import com.item.dao.BookDao;
import com.item.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
    public static void main(String[] args) {

        // 3.获取IOC容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 4.获取bean
//        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
//        bookDao.save();

        BookService bookService = (BookService) ctx.getBean("bookService");
        bookService.save();
    }
}
