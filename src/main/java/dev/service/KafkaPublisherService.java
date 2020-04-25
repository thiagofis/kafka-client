package dev.service;

import dev.messaging.message.KafkaMessage;
import dev.messaging.producer.Publisher;
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
