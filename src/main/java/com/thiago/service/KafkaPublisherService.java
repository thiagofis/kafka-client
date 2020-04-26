package com.thiago.service;

import com.thiago.messaging.message.KafkaMessage;
import com.thiago.messaging.publisher.Publisher;
import org.springframework.stereotype.Service;

@Service
public class KafkaPublisherService implements PublisherService {

    private final Publisher publisher;

    public KafkaPublisherService(Publisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public void publish(String topic, String key, String data) {
        var message  = new KafkaMessage(topic, key, data);
        publisher.publish(message);
    }
}
