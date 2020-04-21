package dev.messaging.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public final class JsonConverter {

    private static final ObjectMapper mapper = new ObjectMapper();

    public static String ToJson(Object object) throws JsonProcessingException {
        return mapper.writeValueAsString(object);
    }

}
