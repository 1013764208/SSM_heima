package com.item;

import com.item.dao.BookDao;
import com.item.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForLifeCycle {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 设置关闭钩子 方式2
//        ctx.registerShutdownHook();
//        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
//        bookDao.save();
//
//        // 必须要关闭容器，才会执行 destroy  方式1 比较暴力
////        ctx.close();


        // 方式3
        BookService bookService = (BookService) ctx.getBean("bookService");
        bookService.save();
        ctx.close();
    }
}
