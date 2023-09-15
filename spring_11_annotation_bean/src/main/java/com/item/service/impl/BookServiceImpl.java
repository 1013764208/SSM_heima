package com.item.service.impl;

import com.item.dao.BookDao;
import com.item.service.BookService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Repository
public class BookServiceImpl implements BookService {

    private BookDao bookDao;

    @Override
    public void save() {
        System.out.println("book service ");
    }
}

