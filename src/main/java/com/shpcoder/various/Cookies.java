package com.shpcoder.various;

import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * User: sunhaipeng
 * Date: 2018/2/5
 * Time: 10:30
 * To change this template use File | Settings | File Templates.
 */
@Component
/**
 * 当出现冲突 可以设置首选 但是如果要是有多个首选也会造成歧义
 */
//@Primary
public class Cookies implements Dessert {
    @Override
    public void test() {
        System.out.println("Cookies");
    }
}
