package com.thiago.setting;

import java.util.List;

public class ProducerSettings {

    private List<String> bootstrapServers;

    public void setBootstrapServers(List<String> bootstrapServers) {
        this.bootstrapServers = bootstrapServers;
    }

    public List<String> getBootstrapServers() {
        return bootstrapServers;
    }
}
