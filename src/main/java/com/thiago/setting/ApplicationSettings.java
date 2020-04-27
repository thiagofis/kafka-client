package com.thiago.setting;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "settings")
public class ApplicationSettings {
    private KafkaSettings kafka;

    public void setKafka(KafkaSettings kafka) {
        this.kafka = kafka;
    }

    public KafkaSettings getKafka() {
        return kafka;
    }
}

