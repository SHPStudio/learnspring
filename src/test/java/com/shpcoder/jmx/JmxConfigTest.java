package com.shpcoder.jmx;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by IntelliJ IDEA.
 * User: sunhaipeng
 * Date: 2018/3/6
 * Time: 12:52
 * To change this template use File | Settings | File Templates.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = JmxConfig.class)
public class JmxConfigTest {

    @Autowired
    private MyShapeJmxController myShapeJmxController;

    @Test
    public void test() throws InterruptedException {
        myShapeJmxController.readByPage();
    }
}