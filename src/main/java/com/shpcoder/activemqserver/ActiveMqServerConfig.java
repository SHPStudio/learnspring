package com.shpcoder.activemqserver;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.apache.activemq.spring.ActiveMQConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsTemplate;

/**
 * Created by IntelliJ IDEA.
 * User: sunhaipeng
 * Date: 2018/3/2
 * Time: 17:12
 * To change this template use File | Settings | File Templates.
 */
@Configuration
@ComponentScan
public class ActiveMqServerConfig {

    /**
     * activemq作为消息代理
     * 需要创建链接工厂
     * @return
     */
    @Bean
    public ActiveMQConnectionFactory mqConnectionFactory() {
        ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory();
        factory.setBrokerURL("tcp://localhost:61616");
        return factory;
    }

    /**
     * 配置消息目的地 也就是是队列那种点对点的还是主题/订阅的模式
     */
    @Bean
    public ActiveMQQueue queue() {
        return new ActiveMQQueue("spitter.queue");
    }

    @Bean
    public ActiveMQTopic topic() {
        return new ActiveMQTopic("spitter.topic");
    }

    /**
     * 配置mq 的jmsTemplate
     */
    @Bean
    public JmsTemplate jmsTemplate(ActiveMQConnectionFactory factory) {
        return new JmsTemplate(factory);
    }
}
