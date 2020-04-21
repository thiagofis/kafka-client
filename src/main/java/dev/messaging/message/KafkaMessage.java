package dev.messaging.message;

import com.fasterxml.jackson.core.JsonProcessingException;
import dev.messaging.exception.MessageContentException;

import static dev.messaging.util.JsonConverter.ToJson;

public class KafkaMessage implements Message {

    private final Object message;
    private final String key;

    public KafkaMessage(Object message, String key) {
        this.message = message;
        this.key = key;
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
