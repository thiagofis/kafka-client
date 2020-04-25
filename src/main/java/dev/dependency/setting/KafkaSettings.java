package dev.dependency.setting;

public class KafkaSettings {
    private BootstrapSettings bootstrap;

    public BootstrapSettings getBootstrap() {
        return bootstrap;
    }

    public void setBootstrap(BootstrapSettings bootstrap) {
        this.bootstrap = bootstrap;
    }
}
