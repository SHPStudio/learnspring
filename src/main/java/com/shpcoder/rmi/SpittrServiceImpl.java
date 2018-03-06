package com.shpcoder.rmi;

import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * User: sunhaipeng
 * Date: 2018/3/1
 * Time: 17:00
 * To change this template use File | Settings | File Templates.
 */
@Component("spittrService")
public class SpittrServiceImpl implements SpittrService{
    @Override
    public ShapeEntity getEnity() {
        return new ShapeEntity("1554", "我是心形");
    }
}
