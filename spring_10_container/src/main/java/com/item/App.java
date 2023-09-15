package com.item;

import com.item.dao.BookDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        // 1.加载类路径下的配置文件
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");


        // 2.从文件系统下加载配置文件
//        FileSystemXmlApplicationContext ctx2 = new FileSystemXmlApplicationContext("C:\\Users\\hxsnn\\java_workplace\\spring_heima\\spring_10_container\\src\\main\\resources\\applicationContext.xml");

//        BookDao bookDao = (BookDao) ctx.getBean("bookDao");  推荐
//        BookDao bookDao = ctx.getBean("bookDao", BookDao.class);
        BookDao bookDao = ctx.getBean(BookDao.class);

        bookDao.save();


    }
}
