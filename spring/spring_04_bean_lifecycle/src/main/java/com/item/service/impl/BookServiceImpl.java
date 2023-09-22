package com.item.service.impl;

import com.item.dao.BookDao;
import com.item.service.BookService;
import com.item.dao.impl.BookDaoImpl;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookServiceImpl implements BookService, InitializingBean, DisposableBean {

    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }


    @Override
    public void destroy() throws Exception {
        System.out.println("service destroy ");
    }


    // 初始化 - 属性设置 - 属性设置后 - 销毁
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("service init");
    }
}
