package com.item;

import com.item.dao.UserDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForInstanceUser {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserDao userDao = (UserDao) ctx.getBean("userDao");
        userDao.save();
    }
}
