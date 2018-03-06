package com.shpcoder.javaweb.websocket;

import com.alibaba.fastjson.support.spring.FastjsonSockJsMessageCodec;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

/**
 * 启用websocket的配置 但是不是所有的浏览器都支持websocket
 * Created by IntelliJ IDEA.
 * User: sunhaipeng
 * Date: 2018/3/5
 * Time: 16:17
 * To change this template use File | Settings | File Templates.
 */
@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry webSocketHandlerRegistry) {
        // 添加websocket的映射我们还可以添加拦截器 在握手之前或之后
        // 如果websocket不可用那么需要使用SockJs去作为代替的一种方案
        // 并且websocket的链接的协议websocket协议 ws//
        webSocketHandlerRegistry.addHandler(myHandler(), "/myHandler");
        // 添加sockjs的替代方案 sockjs是http协议
        /**
         * 利用sockjs遇到个问题就是报java.lang.IllegalStateException: A SockJsMessageCodec is required but not available: Add Jackson 2 to the classpath, or configure a custom SockJsMessageCodec.
         * 这个是消息解码器出现问题 需要引用Fastjson库才可以
         */
        webSocketHandlerRegistry.addHandler(myHandler(), "/mySockJs").withSockJS().setMessageCodec(new FastjsonSockJsMessageCodec());
    }

    @Bean
    public WebSocketHandler myHandler() {
        return new MyHandler();
    }
}
