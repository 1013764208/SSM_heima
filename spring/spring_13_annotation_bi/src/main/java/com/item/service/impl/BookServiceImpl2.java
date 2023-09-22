package com.item.service.impl;

import com.item.dao.BookDao;
import com.item.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Service("BookService2")
public class BookServiceImpl2 implements BookService {


//    @Value("zhangbo")
    @Value("${name}")
    private String name;

    @Override
    public void save() {
        System.out.println("book service " + name);
    }
}

