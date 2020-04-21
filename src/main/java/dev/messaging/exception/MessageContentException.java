package dev.messaging.exception;

public class MessageContentException extends RuntimeException {

    public MessageContentException(String message) {
        super(message);
    }

    public MessageContentException(String message, Throwable cause) {
        super(message, cause);
    }

    public MessageContentException(Throwable cause) {
        super("It was not possible to handle the message content.", cause);
    }
}
