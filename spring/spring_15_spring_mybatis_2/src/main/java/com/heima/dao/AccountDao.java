package com.heima.dao;


import com.heima.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountDao {


    @Insert("insert into tbl_account(name, money) values (#{name},#{money})")
    void save(Account account);


}
