package com.shpcoder.autodi;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by IntelliJ IDEA.
 * User: sunhaipeng
 * Date: 2018/2/2
 * Time: 10:23
 * To change this template use File | Settings | File Templates.
 */

/**
 * @Configuration代表是配置类
 * @ComponentScan表示开启组件扫描 扫描与该类同层级的所有包包括子包
 * 他会扫描到SgtPeppers所带的注解@Component 那么spring就会为SgtPeppers创建一个bean
 */
@Configuration
@ComponentScan
public class CDPlayerConfig {
}
