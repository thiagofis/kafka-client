package dev.messaging.message;

import com.fasterxml.jackson.core.JsonProcessingException;
import dev.messaging.exception.MessageContentException;

import static dev.messaging.util.JsonConverter.ToJson;

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
            return ToJson(message);
        } catch (JsonProcessingException e) {
            throw new MessageContentException(e);
        }
    }
}
