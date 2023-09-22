package com.item;

import com.item.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForLifeCycle {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");


        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();


    }
}
