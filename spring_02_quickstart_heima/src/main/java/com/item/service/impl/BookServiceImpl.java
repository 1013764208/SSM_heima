package com.item.service.impl;

import com.item.dao.BookDao;
import com.item.service.BookService;
import com.item.dao.impl.BookDaoImpl;

public class BookServiceImpl implements BookService {


    // 5.删除业务层中使用new方法创建的dao对象
    private BookDao bookDao;
    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }

    // 6.提供对于的set方法
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
