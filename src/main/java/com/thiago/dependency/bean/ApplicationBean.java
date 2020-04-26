package com.thiago.dependency.bean;

import com.thiago.messaging.publisher.ProducerFactory;
import com.thiago.dependency.setting.ApplicationSettings;
import com.thiago.messaging.configuration.KafkaProducerConfiguration;
import com.thiago.messaging.publisher.KafkaProducerFactory;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(ApplicationSettings.class)
public class ApplicationBean {

    private final ApplicationSettings settings;

    public ApplicationBean(ApplicationSettings settings) {
        this.settings = settings;
    }

    @Bean
    public ProducerFactory producerFactory(){
        var configuration = new KafkaProducerConfiguration(settings.getKafkaBootstrapServes());
        return new KafkaProducerFactory(configuration);
    }

}
