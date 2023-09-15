package com.item;

import com.item.dao.BookDao;
import com.item.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForLifeCycle {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");


//        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
//        bookDao.save();  // book dao save ...mysql100

        BookService bookService = (BookService) ctx.getBean("bookService");
        bookService.save();
        ctx.close();
    }
}
