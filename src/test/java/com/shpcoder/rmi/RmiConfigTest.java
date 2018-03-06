package com.shpcoder.rmi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.concurrent.CountDownLatch;

/**
 * Created by IntelliJ IDEA.
 * User: sunhaipeng
 * Date: 2018/3/1
 * Time: 17:25
 * To change this template use File | Settings | File Templates.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RmiConfig.class)
public class RmiConfigTest {

    @Test
    public void testServer() throws InterruptedException {
        System.out.println("服务已开启。。。");
        new CountDownLatch(1).await();
    }
}