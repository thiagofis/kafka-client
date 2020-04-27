package com.thiago.messaging.subscriber;

import org.apache.kafka.clients.consumer.Consumer;

public interface ConsumerFactory {
    Consumer<String, String> Create(String topic);
}
