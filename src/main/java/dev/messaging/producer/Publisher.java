package dev.messaging.producer;

import dev.messaging.message.Message;

public interface Publisher {
    void publish(Message message);
}
