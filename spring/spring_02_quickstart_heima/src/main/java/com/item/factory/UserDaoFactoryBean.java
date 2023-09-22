package com.item.factory;

import com.item.dao.UserDao;
import com.item.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.FactoryBean;

public class UserDaoFactoryBean implements FactoryBean<UserDao> {


    // 代替原始实例工厂中创建对象的方法
    @Override
    public UserDao getObject() throws Exception {
        return new UserDaoImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return UserDao.class;
    }

    // 设置是否单例（默认单例）
    @Override
    public boolean isSingleton() {
        return false;
    }
}
