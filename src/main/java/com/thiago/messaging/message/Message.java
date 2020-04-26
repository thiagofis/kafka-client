package com.thiago.messaging.message;

public interface Message {

    String getTopic();
    String getKey();
    String getContent();
}
