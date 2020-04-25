package dev.dependency.setting;

import java.util.List;

public class BootstrapSettings {

    private List<String> servers;

    public void setServers(List<String> servers) {
        this.servers = servers;
    }

    public List<String> getServers() {
        return servers;
    }
}
