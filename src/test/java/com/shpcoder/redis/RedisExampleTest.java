package com.shpcoder.redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.BoundListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: sunhaipeng
 * Date: 2018/2/28
 * Time: 18:15
 * To change this template use File | Settings | File Templates.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RedisConfig.class)
public class RedisExampleTest {

    @Autowired
    private RedisConnectionFactory factory;

    @Autowired
    private RedisTemplate<String, Product> template;

    @Test
    public void testRedisFactory() {
        RedisConnection conn = factory.getConnection();
        conn.set("greeting".getBytes(), "hello world".getBytes());
        byte[] greetingsBytes = conn.get("greeting".getBytes());
        String greeting = new String(greetingsBytes);
        System.out.println(greeting + "from redis");
    }

    @Test
    public void testTemplate() {
        Product product = new Product();
        product.setId("111");
        product.setName("我的产品");
        template.opsForValue().set(product.getId(), product);
        Product product1 = template.opsForValue().get("111");
        System.out.println(product1.getId());
        System.out.println(product1.getName());
    }

    @Test
    public void testTemplateList() {
        Product left = new Product("1231", "左边头产品");
        Product right = new Product("1154", "右边头产品");
        template.opsForList().leftPush("cart", left);
        template.opsForList().rightPush("cart", right);

        /**
         * 不只有列表还有hashset等等多种数据结构
         * 并且还能够对这些数据结构进行一些并集差集之类的计算
         */
    }

    /**
     * 测试绑定到某个key上
     */
    @Test
    public void testBoundKey() {
        BoundListOperations<String, Product> cart = template.boundListOps("cart");
        // 也就是之后所有的命令都是基于这个key “cart“进行操作的
        Product popped = cart.rightPop();
        System.out.println(popped);
        cart.rightPush(new Product("1","1号产品"));
        cart.rightPush(new Product("2","2号产品"));
        cart.rightPush(new Product("3","3号产品"));
        List<Product> list = cart.range(0,cart.size()-1);
        list.forEach(n -> System.out.println(n));
    }

}