package com.thiago.setting;

import java.util.List;

public class ConsumerSettings {
    private String topic;
    private String groupId;
    private int waitingTimeInSeconds;
    private String autoOffsetReset;

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public void setWaitingTimeInSeconds(int waitingTimeInSeconds) {
        this.waitingTimeInSeconds = waitingTimeInSeconds;
    }

    public void setBootstrapServers(List<String> bootstrapServers) {
        this.bootstrapServers = bootstrapServers;
    }

    private List<String> bootstrapServers;


    public String getGroupId() {
        return groupId;
    }

    public String getTopic() {
        return topic;
    }

    public int getWaitingTimeInSeconds() {
        return waitingTimeInSeconds;
    }

    public List<String> getBootstrapServers() {
        return bootstrapServers;
    }

    public void setAutoOffsetReset(String autoOffsetReset) {
        this.autoOffsetReset = autoOffsetReset;
    }

    public String getAutoOffsetReset() {
        return autoOffsetReset;
    }
}
