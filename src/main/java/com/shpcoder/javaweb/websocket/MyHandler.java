package com.shpcoder.javaweb.websocket;

import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

/**
 * 文本信息处理
 * Created by IntelliJ IDEA.
 * User: sunhaipeng
 * Date: 2018/3/5
 * Time: 16:21
 * To change this template use File | Settings | File Templates.
 */
public class MyHandler extends TextWebSocketHandler{

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        System.out.println("服务器接收到消息" + message.getPayload());
        // 模拟延时
        Thread.sleep(3000);

        session.sendMessage(new TextMessage("Polo!"));
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        System.out.println("链接关闭");
    }

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        System.out.print("链接开启");
    }

    @Override
    public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {
        System.out.println("出错误了" + exception.getMessage());
    }
}
