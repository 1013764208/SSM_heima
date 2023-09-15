package com.item.dao.impl;

import com.item.dao.BookDao;
import com.item.service.BookService;

public class BookDaoImpl implements BookDao {

    public void save() {
        System.out.println("book dao save ...");
    }

    // 表示Bean初始化对应的操作
    public void init(){
        System.out.println("init");
    }

    // 表示bean销毁前对应的操作
    public void destroy(){
        System.out.println("destroy");

    }
}
