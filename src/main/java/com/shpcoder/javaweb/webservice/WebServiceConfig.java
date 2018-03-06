package com.shpcoder.javaweb.webservice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.jaxws.SimpleJaxWsServiceExporter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by IntelliJ IDEA.
 * User: sunhaipeng
 * Date: 2018/3/2
 * Time: 11:20
 * To change this template use File | Settings | File Templates.
 */
@Configuration
@EnableWebMvc
@ComponentScan
public class WebServiceConfig extends WebMvcConfigurerAdapter{

    @Bean
    public SimpleJaxWsServiceExporter jaxWsServiceExporter() {
        SimpleJaxWsServiceExporter web = new SimpleJaxWsServiceExporter();
        web.setBaseAddress("http://localhost:8888/services/");
        return web;
    }
}
