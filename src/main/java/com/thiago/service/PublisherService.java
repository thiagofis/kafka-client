package com.thiago.service;

public interface PublisherService {
    void publish(String topic, String key, String data);
}
