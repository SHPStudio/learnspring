package com.shpcoder.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by IntelliJ IDEA.
 * User: sunhaipeng
 * Date: 2018/2/1
 * Time: 18:07
 * To change this template use File | Settings | File Templates.
 */
public class KnightMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(KnightConfig.class);
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
    }
}
