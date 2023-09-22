package com.item.service.impl;

import com.item.dao.BookDao;
import com.item.service.BookService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Repository
@Scope("singleton")  // prototype 非单例  @Scope("singleton) 单例
public class BookServiceImpl implements BookService {

    private BookDao bookDao;

    @Override
    public void save() {
        System.out.println("book service ");
    }

    @PostConstruct  // 构造方法后
    public void init() {
        System.out.println("init ");
    }


    @PreDestroy // 在销毁前
    public void destroy() {
        System.out.println("destroy ");
    }
}

