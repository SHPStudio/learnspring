package com.shpcoder.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by IntelliJ IDEA.
 * User: sunhaipeng
 * Date: 2018/2/6
 * Time: 14:45
 * To change this template use File | Settings | File Templates.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AopConfig.class)
public class AopConfigTest {

    @Autowired
    private Performance shpPerform;

    @Autowired
    private Performance badPerformance;

    @Test
    public void testShp() {
        shpPerform.perform();
    }

    @Test
    public void testBad() {
        badPerformance.perform();
    }
}