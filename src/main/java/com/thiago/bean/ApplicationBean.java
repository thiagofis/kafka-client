package com.thiago.bean;

import com.thiago.messaging.configuration.KafkaConsumerConfiguration;
import com.thiago.messaging.configuration.KafkaProducerConfiguration;
import com.thiago.messaging.publisher.KafkaProducerFactory;
import com.thiago.messaging.publisher.ProducerFactory;
import com.thiago.messaging.subscriber.ConsumerFactory;
import com.thiago.messaging.subscriber.KafkaConsumerFactory;
import com.thiago.messaging.subscriber.KafkaSubscriber;
import com.thiago.messaging.subscriber.Subscriber;
import com.thiago.setting.ApplicationSettings;
import com.thiago.setting.ConsumerSettings;
import com.thiago.setting.ProducerSettings;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(ApplicationSettings.class)
public class ApplicationBean {

    private final ApplicationSettings applicationSettings;
    private final ConsumerSettings consumerSettings;
    private final ProducerSettings producerSettings;

    public ApplicationBean(ApplicationSettings applicationSettings) {
        this.applicationSettings = applicationSettings;
        this.consumerSettings = applicationSettings.getKafka().getConsumer();
        this.producerSettings = applicationSettings.getKafka().getProducer();
    }

    @Bean
    public ProducerFactory producerFactory() {
        var configuration = new KafkaProducerConfiguration(producerSettings.getBootstrapServers());
        return new KafkaProducerFactory(configuration);
    }

    @Bean
    public Subscriber subscriber() {
        return new KafkaSubscriber(consumerSettings.getTopic(), consumerSettings.getWaitingTimeInSeconds(), consumerFactory());
    }

    @Bean
    public ConsumerFactory consumerFactory() {
        var configuration = new KafkaConsumerConfiguration(consumerSettings.getBootstrapServers(), consumerSettings.getGroupId());
        return new KafkaConsumerFactory(configuration);
    }
}
