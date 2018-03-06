package com.shpcoder.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by IntelliJ IDEA.
 * User: sunhaipeng
 * Date: 2018/2/6
 * Time: 14:39
 * To change this template use File | Settings | File Templates.
 */
@Configuration
/**
 * 开启自动代理
 */
@EnableAspectJAutoProxy
@ComponentScan
public class AopConfig {
}
