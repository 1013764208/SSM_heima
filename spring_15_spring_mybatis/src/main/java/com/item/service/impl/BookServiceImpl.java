package com.item.service.impl;

import com.item.dao.BookDao;
import com.item.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Service("bookService")
public class BookServiceImpl implements BookService {


    // 依赖注入
    @Autowired
    private BookDao bookDao;

//    public void setBookDao(BookDao bookDao) {
//        this.bookDao = bookDao;
//    }

    @Override
    public void save() {
        System.out.println("book service ");
        bookDao.save();
    }
}

