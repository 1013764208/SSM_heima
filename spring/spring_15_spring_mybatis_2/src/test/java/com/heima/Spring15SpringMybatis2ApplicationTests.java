package com.heima;

import com.heima.dao.AccountDao;
import com.heima.domain.Account;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Spring15SpringMybatis2ApplicationTests {



    @Autowired
    private AccountDao accountDao;

    @Test
    public void test_insert(){


        Account account = new Account();
        account.setName("张博");
        account.setMoney(2000.0);

        accountDao.save(account);
    }
}
