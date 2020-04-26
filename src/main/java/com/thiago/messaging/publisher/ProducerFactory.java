package com.thiago.messaging.publisher;

import org.apache.kafka.clients.producer.Producer;

public interface ProducerFactory {

    Producer<String, String> Create();
}
