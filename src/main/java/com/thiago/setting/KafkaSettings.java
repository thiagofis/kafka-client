package com.thiago.setting;

public class KafkaSettings {
    private ProducerSettings producer;
    private ConsumerSettings consumer;

    public void setProducer(ProducerSettings producer) {
        this.producer = producer;
    }

    public void setConsumer(ConsumerSettings consumer) {
        this.consumer = consumer;
    }

    public ProducerSettings getProducer() {
        return producer;
    }

    public ConsumerSettings getConsumer() {
        return consumer;
    }
}
