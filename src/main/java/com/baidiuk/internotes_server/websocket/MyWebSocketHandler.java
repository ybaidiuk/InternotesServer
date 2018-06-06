package com.baidiuk.internotes_server.websocket;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


@Component
public class MyWebSocketHandler extends TextWebSocketHandler {
    private Map<String, WebSocketSession> sessions = new ConcurrentHashMap<>();
    private final static Logger LOGGER = LoggerFactory.getLogger(MyWebSocketHandler.class);


    public void sendMessage(WebSocketSession session, String message) {
//        WebSocketMessage
//        session.sendMessage(message);
    }

    /**
     * receive message from user and forward it to another user
     */
    @Override
    public void handleTextMessage(WebSocketSession session, TextMessage message) {
        LOGGER.info("handleTextMessage");
        System.out.println("SANTA handleTextMessage");
    }

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        LOGGER.info("user has CREATED connection");
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        LOGGER.warn("user has CLOSED connection");
    }

    @Override
    public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {
        LOGGER.warn("user has ERROR with connection");
    }
}

