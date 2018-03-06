package com.shpcoder.aop;

/**
 * Created by IntelliJ IDEA.
 * User: sunhaipeng
 * Date: 2018/2/6
 * Time: 16:03
 * To change this template use File | Settings | File Templates.
 */
public class DefaultHorce implements Emhorce {
    @Override
    public void horce() {
        System.out.println("我是附加功能");
    }
}
