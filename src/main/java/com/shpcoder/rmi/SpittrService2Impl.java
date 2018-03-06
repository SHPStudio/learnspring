package com.shpcoder.rmi;

import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * User: sunhaipeng
 * Date: 2018/3/1
 * Time: 17:41
 * To change this template use File | Settings | File Templates.
 */
@Component("rect")
public class SpittrService2Impl implements SpittrService {
    @Override
    public ShapeEntity getEnity() {
        return new ShapeEntity("1564", "我是方形");
    }
}
