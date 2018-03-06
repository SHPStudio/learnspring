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
//@Qualifier("cold")
/**
 * 使用自定义注解代替字符串形式的限定符减少歧义
 */
@Cold
public class IceCream implements Dessert {
    @Override
    public void test() {
        System.out.println("icecream");
    }
}
