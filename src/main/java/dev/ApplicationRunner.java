package dev;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

public class ApplicationRunner implements CommandLineRunner {

    private static Logger log = LoggerFactory.getLogger(ApplicationRunner.class);

    public static void main(String[] args) {
        log.info("STARTING THE APPLICATION");
        SpringApplication.run(ApplicationRunner.class, args);
        log.info("APPLICATION FINISHED");
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
