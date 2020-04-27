package com.thiago.messaging.subscriber;

import com.thiago.messaging.message.KafkaMessage;
import com.thiago.messaging.message.Message;
import org.apache.kafka.clients.consumer.Consumer;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class KafkaSubscriber implements Subscriber {

    private final Duration waitingTime;
    private final Consumer<String, String> consumer;

    public KafkaSubscriber(String topic, int waitingTimeInSeconds, ConsumerFactory consumerFactory) {
        this.waitingTime = Duration.ofSeconds(waitingTimeInSeconds);
        this.consumer = consumerFactory.Create(topic);
    }

    @Override
    public List<Message> pull() {

            var records = consumer.poll(waitingTime);
            return StreamSupport.stream(records.spliterator(), false)
                                .map(record -> new KafkaMessage(record.topic(), record.key(), record.value()))
                                .collect(Collectors.toList());
    }

    @Override
    public void close() throws Exception {
        consumer.close();
    }
}
