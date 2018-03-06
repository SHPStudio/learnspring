package com.shpcoder.activemqserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsOperations;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * User: sunhaipeng
 * Date: 2018/3/2
 * Time: 17:45
 * To change this template use File | Settings | File Templates.
 */
@Component
public class AlertServiceImpl implements AlertService {

    @Autowired
    private JmsOperations jmsOperations;

    @Override
    public void sendShapeAlert(ShapeMessageEntity entity) {
        jmsOperations.convertAndSend("spitter.queue", entity);
    }
}
