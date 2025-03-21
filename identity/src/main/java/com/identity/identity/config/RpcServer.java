package com.identity.identity.config;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RpcServer {

    @RabbitListener(queues = "${rabbitmq.queue}")
    public String getMessage(String message) {
        return message + " received";
    }
}
