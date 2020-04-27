package com.thiago.messaging.configuration;

import org.apache.kafka.common.serialization.StringDeserializer;

import java.util.List;
import java.util.Properties;

public class KafkaConsumerConfiguration implements Configuration {

    private final Properties properties;
    private final String groupIdKey = "group.id";
    private final String bootstrapServersKey = "bootstrap.servers";
    private final String keyDeserializerKey = "key.deserializer";
    private final String valueDeserializerKey = "value.deserializer";
    private final String deserializerValue = StringDeserializer.class.getName();

    public KafkaConsumerConfiguration(List<String> bootstrapServers, String groupId) {
        var bootstrapServersValue = String.join(",", bootstrapServers);

        this.properties = new Properties();
        this.properties.put(bootstrapServersKey, bootstrapServersValue);
        this.properties.put(groupIdKey, groupId);
        this.properties.put(keyDeserializerKey, deserializerValue);
        this.properties.put(valueDeserializerKey, deserializerValue);
    }

    @Override
    public Properties getProperties() {
        return properties;
    }
}
