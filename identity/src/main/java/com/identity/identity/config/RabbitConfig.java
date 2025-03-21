package com.identity.identity.config;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.rabbitmq.client.ConnectionFactory;

@Configuration
public class RabbitConfig {

    @Value("${rabbitmq.queue}")
    private String nameIdentity;

    @Bean
    public Queue nameIdentity() {
        System.out.println("Creating queue: " + nameIdentity);
        return new Queue(nameIdentity, true); 
    
    }

    
}
