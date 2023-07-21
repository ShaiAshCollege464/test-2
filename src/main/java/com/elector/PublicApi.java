package com.elector;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
@EnableScheduling
public class PublicApi {
    public static boolean applicationStarted = false;
    public static long startTime;

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(PublicApi.class, args);
        applicationStarted = true;
        startTime = System.currentTimeMillis();

    }
}