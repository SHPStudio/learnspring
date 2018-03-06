package com.shpcoder.javaweb;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * 配置ContextLoaderListener
 * Created by IntelliJ IDEA.
 * User: sunhaipeng
 * Date: 2018/2/7
 * Time: 10:58
 * To change this template use File | Settings | File Templates.
 */
@Configuration
/**
 * 这个的目的是不扫描DispacherServlet加载的有关bean，让RootConfig只用来加载非web组件的bean web组件的bean由WebConfig加载
 */
@ComponentScan(excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class)})
public class RootConfig {
}
