package com.shpcoder.activemqclient;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.JmsException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by IntelliJ IDEA.
 * User: sunhaipeng
 * Date: 2018/3/2
 * Time: 18:00
 * To change this template use File | Settings | File Templates.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ActiveMqClientConfig.class)
public class MqClientTest {

    @Autowired
    private MqReceive mqReceive;

    @Test
    public void testReceive() throws InterruptedException {
            while(true){
                try {
                    System.out.println(mqReceive.receviveEntity() + "接收到了");
                    Thread.sleep(5000);
                } catch (JmsException e) {
                    System.out.println("没有消息了");
                    break;
                }
            }

    }
}