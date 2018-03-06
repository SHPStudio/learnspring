package com.shpcoder.activemqclient;

import com.shpcoder.activemqserver.ShapeMessageEntity;

/**
 * Created by IntelliJ IDEA.
 * User: sunhaipeng
 * Date: 2018/3/2
 * Time: 17:57
 * To change this template use File | Settings | File Templates.
 */
public interface MqReceive {
    ShapeMessageEntity receviveEntity();
}
