package com.thiago.messaging.subscriber;

import com.thiago.messaging.configuration.Configuration;
import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.KafkaConsumer;

import java.util.Collections;

public class KafkaConsumerFactory implements ConsumerFactory {

    private final Configuration configuration;

    public KafkaConsumerFactory(Configuration configuration) {
        this.configuration = configuration;
    }

    @Override
    public Consumer<String, String> Create(String topic) {
        var consumerConfigs = configuration.getProperties();
        var consumer = new KafkaConsumer<String, String>(consumerConfigs);
        consumer.subscribe(Collections.singletonList(topic));
        return consumer;
    }
}
