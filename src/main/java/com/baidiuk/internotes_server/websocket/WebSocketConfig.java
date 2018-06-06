package com.baidiuk.internotes_server.websocket;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.*;

import java.util.logging.Logger;

@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {

    Logger logger = Logger.getLogger(this.getClass().getName());
    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(new MyWebSocketHandler(), "/").setAllowedOrigins("*");
        logger.info("registerWebSocketHandlers");
    }

}