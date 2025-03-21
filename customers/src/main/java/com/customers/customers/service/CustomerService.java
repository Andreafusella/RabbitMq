package com.customers.customers.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.customers.customers.service.rabbit.RabbitHandler;

@Service
public class CustomerService {

    @Autowired
    RabbitHandler rabbitHandler;

    public String send(String message) {
        Object obj = rabbitHandler.handle(message);
        return obj.toString();
    }
}
