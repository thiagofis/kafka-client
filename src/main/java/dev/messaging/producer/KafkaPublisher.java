package dev.messaging.producer;


import dev.messaging.message.Message;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Autowired;

public class KafkaPublisher implements Publisher {

    private final Producer<String, String> producer;

    @Autowired
    public KafkaPublisher(ProducerFactory producerFactory) {
        this.producer = producerFactory.Create();
    }

    @Override
    public void publish(Message message){
        var record = new ProducerRecord<>(message.getTopic(), message.getKey(), message.getContent());
        producer.send(record);
    }
}
