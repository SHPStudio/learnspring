package com.shpcoder.activemqserver;

/**
 * Created by IntelliJ IDEA.
 * User: sunhaipeng
 * Date: 2018/3/2
 * Time: 17:44
 * To change this template use File | Settings | File Templates.
 */
public interface AlertService {
    void sendShapeAlert(ShapeMessageEntity entity);
}
