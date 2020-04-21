package dev.messaging.producer;


import dev.messaging.configuration.Configuration;
import dev.messaging.message.Message;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import java.util.Properties;

public class KafkaPublisher implements Publisher {

    private final Producer<String, String> producer;

    public KafkaPublisher(Configuration configuration) {
        var producerConfigs = configuration.getProperties();
        this.producer = new KafkaProducer<String, String>(producerConfigs);
    }

    public void publish(Message message){

    }
}
