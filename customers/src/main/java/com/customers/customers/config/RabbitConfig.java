package com.customers.customers.config;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;

@Configuration
@Getter
@Setter
public class RabbitConfig {

   @Value("${rabbitmq.queue}")
   private String nameIdentity;

   @Bean
   public Queue nameIdentity() {return new Queue(nameIdentity, true); }
}
