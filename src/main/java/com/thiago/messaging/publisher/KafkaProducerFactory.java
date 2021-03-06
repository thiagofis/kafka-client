package com.thiago.messaging.publisher;

import com.thiago.messaging.configuration.Configuration;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;

public class KafkaProducerFactory implements ProducerFactory {

    private final Configuration configuration;

    public KafkaProducerFactory(Configuration configuration) {
        this.configuration = configuration;
    }

    @Override
    public Producer<String, String> Create() {
        var producerConfigs = configuration.getProperties();
        return new KafkaProducer<>(producerConfigs);
    }
}
