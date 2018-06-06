package com.baidiuk.internotes_server.websocket;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;


@Component
public class MyWebSocketHandler extends TextWebSocketHandler {
    //    private Map<String, Session> sessions = new ConcurrentHashMap<>();
    private final Logger log = LoggerFactory.getLogger(this.getClass());


    @Override
    public void handleTextMessage(WebSocketSession session, TextMessage message) {
        System.out.println("SANTA ON MESSAGE");
        log.info("on handleTextMessage");
    }

}

