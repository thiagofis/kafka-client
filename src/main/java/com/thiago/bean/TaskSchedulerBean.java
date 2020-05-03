package com.thiago.bean;

import com.thiago.scheduling.task.ListenerScheduledTasks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

import java.time.Duration;

@EnableScheduling
@Configuration
@ComponentScan("com.thiago.scheduling.task")
public class TaskSchedulerBean {
}
