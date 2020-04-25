package dev.dependency.bean;

import dev.dependency.setting.ApplicationSettings;
import dev.messaging.configuration.KafkaProducerConfiguration;
import dev.messaging.producer.KafkaProducerFactory;
import dev.messaging.producer.ProducerFactory;
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
