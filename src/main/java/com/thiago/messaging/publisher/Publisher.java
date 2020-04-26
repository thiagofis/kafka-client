package com.thiago.messaging.publisher;

import com.thiago.messaging.message.Message;

public interface Publisher {
    void publish(Message message);
}
