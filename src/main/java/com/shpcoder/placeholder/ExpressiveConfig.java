package com.shpcoder.placeholder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

/**
 * Created by IntelliJ IDEA.
 * User: sunhaipeng
 * Date: 2018/2/5
 * Time: 11:52
 * To change this template use File | Settings | File Templates.
 */
@Configuration
@PropertySource("classpath:app.properties")
public class ExpressiveConfig {

    @Autowired
    Environment env;

    @Bean
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public SgtPeppers sgtPeppers() {
//        return new SgtPeppers(env.getProperty("disc.title"), env.getProperty("disc.artist"));
        // 使用占位符代替用环境接口去获取环境变量
        return new SgtPeppers("1","2");
    }
}
