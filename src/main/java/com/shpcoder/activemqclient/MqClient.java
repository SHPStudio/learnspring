package com.shpcoder.activemqclient;

import com.shpcoder.activemqserver.ShapeMessageEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsOperations;
import org.springframework.jms.support.JmsUtils;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.ObjectMessage;

/**
 * Created by IntelliJ IDEA.
 * User: sunhaipeng
 * Date: 2018/3/2
 * Time: 17:56
 * To change this template use File | Settings | File Templates.
 */
@Component
public class MqClient implements MqReceive{

    @Autowired
    private JmsOperations jmsOperations;

    @Override
    public ShapeMessageEntity receviveEntity() {
        try {
            ObjectMessage receviedMessage = (ObjectMessage) jmsOperations.receive("spitter.queue");
            return (ShapeMessageEntity) receviedMessage.getObject();
        }catch (JMSException jmsException){
            throw JmsUtils.convertJmsAccessException(jmsException);
        }
    }

}
