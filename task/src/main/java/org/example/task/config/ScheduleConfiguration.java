package org.example.task.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

//在类上，添加 @EnableScheduling 注解，启动 Spring Task 的定时任务调度的功能。
@Configuration
@EnableScheduling
public class ScheduleConfiguration {
}