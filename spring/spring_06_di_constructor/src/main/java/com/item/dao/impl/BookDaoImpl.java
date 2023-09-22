package com.item.dao.impl;

import com.item.dao.BookDao;
import com.item.service.BookService;

public class BookDaoImpl implements BookDao {

    private int connectionNum;
    private String databaseName;

    public void save() {
        System.out.println("book dao save ...");
    }
}
