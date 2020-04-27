package com.thiago.messaging.subscriber;

import com.thiago.messaging.message.Message;

import java.util.List;

public interface Subscriber extends AutoCloseable {
    List<Message> pull();
}
