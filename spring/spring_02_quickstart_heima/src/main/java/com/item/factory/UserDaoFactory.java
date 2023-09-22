package com.item.factory;

import com.item.dao.UserDao;
import com.item.dao.impl.UserDaoImpl;

public class UserDaoFactory {
    public UserDao getUserDao() {
        return new UserDaoImpl();
    }
}
