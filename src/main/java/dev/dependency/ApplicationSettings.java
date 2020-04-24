package dev.dependency;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "settings")
class ApplicationSettings {
    private KafkaSettings kafka;

    public KafkaSettings getKafka() {
        return kafka;
    }
}

