package com.item.dao.impl;

import com.item.dao.UserDao;

public class UserDaoImpl implements UserDao {

    @Override
    public void save() {
        System.out.println("user do save");
    }
}
