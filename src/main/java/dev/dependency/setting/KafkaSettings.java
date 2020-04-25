package dev.dependency.setting;

import java.util.List;

public class KafkaSettings {
    private BootstrapSettings bootstrap;

    public BootstrapSettings getBootstrap() {
        return bootstrap;
    }

    public void setBootstrap(BootstrapSettings bootstrap) {
        this.bootstrap = bootstrap;
    }

    public List<String> getBootstrapServers() {
        return this.bootstrap.getServers();
    }
}
