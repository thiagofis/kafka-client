package dev.messaging.message;

public interface Message {

    String getTopic();
    String getKey();
    String getContent();
}
