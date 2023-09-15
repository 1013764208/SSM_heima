package com.item.dao.impl;

import com.item.dao.BookDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Repository("bookDao")
public class BookDaoImpl implements BookDao {

    public void save() {
        System.out.println("book dao save");
    }
}
