package com.shpcoder.various;

import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * User: sunhaipeng
 * Date: 2018/2/5
 * Time: 10:29
 * To change this template use File | Settings | File Templates.
 */
@Component
public class Cake implements Dessert {
    @Override
    public void test() {
        System.out.println("cake");
    }
}
