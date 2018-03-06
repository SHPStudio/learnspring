package com.shpcoder.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

/**
 * 为已有源码的接口添加新的功能 如果没有源码只能使用xml配置方式
 * Created by IntelliJ IDEA.
 * User: sunhaipeng
 * Date: 2018/2/6
 * Time: 16:04
 * To change this template use File | Settings | File Templates.
 */
@Aspect
@Component
public class EmhorceIntroducer {

    @DeclareParents(value = "com.shpcoder.aop.Performance+", defaultImpl = DefaultHorce.class)
    public static Emhorce emhorce;

    @Before("execution(* com.shpcoder.aop.Performance.perform(..)) && this(emhorce)")
    public void beforePerformance(Emhorce emhorce) {
        emhorce.horce();
    }
}
