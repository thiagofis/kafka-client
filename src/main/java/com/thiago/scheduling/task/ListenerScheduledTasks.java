package com.thiago.scheduling.task;

import com.thiago.model.MessageModel;
import com.thiago.messaging.subscriber.Subscriber;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ListenerScheduledTasks {

    private final Subscriber subscriber;
    private final SimpMessagingTemplate simpMessagingTemplate;

    public ListenerScheduledTasks(Subscriber subscriber, SimpMessagingTemplate simpMessagingTemplate) {
        this.subscriber = subscriber;
        this.simpMessagingTemplate = simpMessagingTemplate;
    }

    @Scheduled(fixedDelay = 3000)
    public void run() {
        var messages = subscriber.pull();
        for (var message: messages) {
            simpMessagingTemplate.convertAndSend("/topic/messages", new MessageModel(message.getKey(), message.getContent()));
        }
    }
}