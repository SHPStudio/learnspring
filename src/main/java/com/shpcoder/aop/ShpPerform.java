package com.shpcoder.aop;

import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * User: sunhaipeng
 * Date: 2018/2/6
 * Time: 14:37
 * To change this template use File | Settings | File Templates.
 */
@Component
public class ShpPerform implements Performance {
    @Override
    public void perform() {
        System.out.println("海鹏精彩的表演");
    }
}
