package com.shpcoder.aop;

import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * User: sunhaipeng
 * Date: 2018/2/6
 * Time: 14:38
 * To change this template use File | Settings | File Templates.
 */
@Component
public class BadPerformance implements Performance {
    @Override
    public void perform() {
        System.out.println("开始紧张的表演");
        System.out.println("表演失败啦 啊~~");
        throw new RuntimeException("表演失败");
    }
}
