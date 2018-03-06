package com.shpcoder.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * User: sunhaipeng
 * Date: 2018/2/6
 * Time: 14:24
 * To change this template use File | Settings | File Templates.
 */

/**
 * 定义切面
 */
@Aspect
@Component
public class Audience {

    /**
     * 定义切点 使用AspectJ的指示器和表达式
     */
    @Pointcut("execution(* com.shpcoder.aop.Performance.perform(..))")
    public void performance() {
    }

    /**
     * 定义通知方法
     */

//    @Before("performance()")
//    public void silenceCellPhones() {
//        System.out.println("开始前关闭手机");
//    }
//
//    @Before("performance()")
//    public void takeSeats() {
//        System.out.println("找好地方坐下");
//    }
//
//    @AfterReturning("performance()")
//    public void applause() {
//        System.out.println("精彩的表演 鼓掌");
//    }
//
//    @AfterThrowing("performance()")
//    public void demandRefund() {
//        System.out.println("糟糕的表演啊");
//    }

    @Around("performance()")
    public void watchPerformace(ProceedingJoinPoint jp) {
        try {
            System.out.println("把手机关机");
            System.out.println("找座位");
            jp.proceed();
            System.out.println("鼓掌");
        } catch (Throwable throwable) {
            System.out.println("糟糕的表演");
        }
    }

}
