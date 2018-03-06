package com.shpcoder.redismanager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by IntelliJ IDEA.
 * User: sunhaipeng
 * Date: 2018/3/1
 * Time: 12:02
 * To change this template use File | Settings | File Templates.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RedisManagerConfig.class)
public class SpittrResposityTest {

    @Autowired
    private SpittrResposity spittrResposity;

    @Test
    public void getProduct() throws Exception {
        while(true) {
            System.out.println(spittrResposity.getProduct());
            Thread.sleep(5000);
        }
    }

}