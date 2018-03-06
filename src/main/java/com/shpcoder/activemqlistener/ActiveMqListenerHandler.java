package com.shpcoder.activemqlistener;

import com.shpcoder.activemqserver.ShapeMessageEntity;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * User: sunhaipeng
 * Date: 2018/3/5
 * Time: 10:54
 * To change this template use File | Settings | File Templates.
 */
@Component("myListener")
public class ActiveMqListenerHandler{

    public void handlerAlertHandler(ShapeMessageEntity entity) {
        System.out.println("事件接收到了");
        System.out.println(entity);
    }
}
