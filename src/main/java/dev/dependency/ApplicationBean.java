package dev.dependency;

import dev.messaging.configuration.KafkaProducerConfiguration;
import dev.messaging.producer.KafkaProducerFactory;
import dev.messaging.producer.ProducerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
        var configuration = new KafkaProducerConfiguration(settings.getKafka().getBootstrap().getServers());
        return new KafkaProducerFactory(configuration);
    }

}
