package com.baidiuk.internotes_server.enums;

public enum MessageType {
    UNKNOWN(0),
    REGISTER(1),
    FORWARD_MESSAGE(2);

    private int code;

    MessageType(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
