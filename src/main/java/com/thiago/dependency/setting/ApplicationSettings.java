package com.thiago.dependency.setting;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@ConfigurationProperties(prefix = "settings")
public class ApplicationSettings {
    private KafkaSettings kafka;

    public KafkaSettings getKafka() {
        return kafka;
    }

    public void setKafka(KafkaSettings kafka) {
        this.kafka = kafka;
    }

    public List<String> getKafkaBootstrapServes(){
        return this.kafka.getBootstrapServers();
    }
}

