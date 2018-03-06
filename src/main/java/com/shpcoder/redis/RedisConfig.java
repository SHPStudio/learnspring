package com.shpcoder.redis;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * Created by IntelliJ IDEA.
 * User: sunhaipeng
 * Date: 2018/2/28
 * Time: 18:12
 * To change this template use File | Settings | File Templates.
 */
@Configuration
public class RedisConfig {

    /**
     * 设置链接工厂
     * @return
     */
    @Bean
    public RedisConnectionFactory factory() {
        JedisConnectionFactory factory = new JedisConnectionFactory();
        factory.setUsePool(true);
        return factory;
    }

    /**
     * 设置模板
     */
    @Bean
    public RedisTemplate<String, Product> redisTemplate(RedisConnectionFactory factory) {
        RedisTemplate<String, Product> redis = new RedisTemplate<String, Product>();
        redis.setConnectionFactory(factory);
        return redis;
    }
}
