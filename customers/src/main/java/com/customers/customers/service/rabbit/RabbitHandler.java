package com.customers.customers.service.rabbit;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customers.customers.config.RabbitConfig;

@Service
public class RabbitHandler {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    RabbitConfig rabbitConfig;
    
    public Object handle(String message) {
        return rabbitTemplate.convertSendAndReceive(rabbitConfig.getNameIdentity(), message);
    }
}
