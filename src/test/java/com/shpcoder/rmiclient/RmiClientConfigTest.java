package com.shpcoder.rmiclient;

import com.shpcoder.rmi.SpittrService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by IntelliJ IDEA.
 * User: sunhaipeng
 * Date: 2018/3/1
 * Time: 17:36
 * To change this template use File | Settings | File Templates.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RmiClientConfig.class)
public class RmiClientConfigTest {

    @Autowired
    private SpittrService spitterService;

    @Test
    public void testClient() {
        System.out.println("接收到了" + spitterService.getEnity());
    }
}