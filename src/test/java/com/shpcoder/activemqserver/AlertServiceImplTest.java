package com.shpcoder.activemqserver;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by IntelliJ IDEA.
 * User: sunhaipeng
 * Date: 2018/3/2
 * Time: 17:49
 * To change this template use File | Settings | File Templates.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ActiveMqServerConfig.class)
public class AlertServiceImplTest {

    @Autowired
    private AlertService alertService;

    @Test
    public void testSendMessage() {
        ShapeMessageEntity entity = new ShapeMessageEntity("123445445566", "我是123445的信息445566");
        alertService.sendShapeAlert(entity);
    }
}