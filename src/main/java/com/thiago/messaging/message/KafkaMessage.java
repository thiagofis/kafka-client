package com.thiago.messaging.message;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.thiago.messaging.exception.MessageContentException;
import com.thiago.messaging.util.JsonConverter;

public class KafkaMessage implements Message {

    private final String topic;
    private final Object message;
    private final String key;

    public KafkaMessage(String topic, String key, Object message) {
        this.topic = topic;
        this.key = key;
        this.message = message;
    }

    @Override
    public String getTopic() {
        return topic;
    }

    @Override
    public String getKey() {
        return key;
    }

    @Override
    public String getContent() throws MessageContentException {
        try {
            return JsonConverter.ToJson(message);
        } catch (JsonProcessingException e) {
            throw new MessageContentException(e);
        }
    }
}
