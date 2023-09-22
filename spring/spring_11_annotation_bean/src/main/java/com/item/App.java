package com.item;

import com.item.dao.BookDao;
import com.item.service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        // 1.加载类路径下的配置文件
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml.bak");

        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        System.out.println(bookDao);

        BookService bookService = ctx.getBean(BookService.class);
        System.out.println(bookService);
    }
}
