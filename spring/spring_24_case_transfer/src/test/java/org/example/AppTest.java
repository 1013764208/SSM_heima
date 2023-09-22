package org.example;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.example.conf.SpringConfig;
import org.example.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;

/**
 * Unit test for simple App.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class AppTest {


    @Autowired
    private AccountService accountService;

    @Test
    public void testTransfer() throws IOException{
        accountService.transfer("Tom", "Jerry", 1000.0);

    }

}
