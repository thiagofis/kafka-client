package dev.messaging.producer;

import dev.messaging.configuration.Configuration;
import org.apache.kafka.clients.producer.Producer;

public interface ProducerFactory {

    Producer<String, String> Create();
}
