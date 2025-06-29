package com.example.kafka.sender.kafka_config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class kafkaConfig {

    @Bean
    public NewTopic topic(){
        return new NewTopic("messaging",3,(short)1);
    }
}
