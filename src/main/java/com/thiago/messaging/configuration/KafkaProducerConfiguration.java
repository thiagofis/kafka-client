package com.thiago.messaging.configuration;

import java.util.List;
import java.util.Properties;

public class KafkaProducerConfiguration implements Configuration {

    private final Properties properties;
    private final String bootstrapServersKey = "bootstrap.servers";
    private final String keySerializerKey = "key.serializer";
    private final String valueSerializerKey = "value.serializer";
    private final String serializerValue = "org.apache.kafka.common.serialization.StringSerializer";

    public KafkaProducerConfiguration(List<String> bootstrapServers) {
        var bootstrapServersValue = String.join(",", bootstrapServers);

        this.properties = new Properties();
        this.properties.put(bootstrapServersKey, bootstrapServersValue);
        this.properties.put(keySerializerKey, serializerValue);
        this.properties.put(valueSerializerKey, serializerValue);
    }

    @Override
    public Properties getProperties() {
        return properties;
    }
}
