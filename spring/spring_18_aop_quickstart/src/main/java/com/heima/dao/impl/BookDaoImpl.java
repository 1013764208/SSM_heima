package com.heima.dao.impl;

import com.heima.dao.BookDao;
import org.springframework.stereotype.Repository;


@Repository
public class BookDaoImpl implements BookDao {


    public int save() {
        System.out.println("book dao save ");
        return 100;
    }

    public void update() {
        System.out.println("book dao update ");
    }
}
