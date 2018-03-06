package com.shpcoder.activemqlistener;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.concurrent.CountDownLatch;

/**
 * Created by IntelliJ IDEA.
 * User: sunhaipeng
 * Date: 2018/3/5
 * Time: 11:52
 * To change this template use File | Settings | File Templates.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ActiveMqListenerClientConfig.class)
public class ActiveMqListenerClientConfigTest {

    @Test
    public void test() throws InterruptedException {
        new CountDownLatch(1).await();
    }
}