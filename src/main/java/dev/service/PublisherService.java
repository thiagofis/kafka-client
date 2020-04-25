package dev.service;

public interface PublisherService {
    void publish(String topic, String key, String data);
}
