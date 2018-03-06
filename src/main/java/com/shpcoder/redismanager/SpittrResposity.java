package com.shpcoder.redismanager;

import com.shpcoder.redis.Product;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

/**
 * 我们的业务查数据方法
 * Created by IntelliJ IDEA.
 * User: sunhaipeng
 * Date: 2018/3/1
 * Time: 11:55
 * To change this template use File | Settings | File Templates.
 */
@Component
public class SpittrResposity {

    /**
     * 使用注解来使用缓存
     * @Cacheable 在调用方法前在缓存中找是否有shp为名字的缓存值 如果有返回缓存中的值
     * 否则就调用方法然后把结果放到缓存中 如果带有参数 那么参数会被当做key
     * @CachePut 将方法返回方法放到缓存中，调用前不会检查缓存 方法会被一直调用
     * @CacheEvict spring应该在缓存中清楚一个或多个条目
     * @Caching 分组注解能够同时应用多个其他的注解
     *
     * @Cacheable和@CachePut的一些共有的属性
     * value 要使用的缓存名称
     * condition 表达式 如果是false 就不会将缓存应用到方法的调用上
     * key 用来计算自定义的缓存key
     * unless 如果是true 返回值不会放到缓存中
     *
     * 表达式
     * #root.args 传递的参数形式为数组
     * #root.caches对应的缓存
     * #root.target 目标对象
     * #root.targetClass目标对应的类
     * #root.method 缓存方法
     * #root.methodName 缓存方法的名称
     * #result 方法调用的返回值
     * #Argument 方法参数名字
     * @return
     */
    @Cacheable("shp")
    public Product getProduct() {
        return generateProduct();
    }

    private Product generateProduct() {
        System.out.println("调用方法查询的 不是缓存");
        return new Product("1244124", "产品1");
    }
}
