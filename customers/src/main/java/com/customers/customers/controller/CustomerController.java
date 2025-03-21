package com.customers.customers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.customers.customers.service.CustomerService;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/get")
    public ResponseEntity<?> get(@RequestParam String message) {
        try {
            return ResponseEntity.ok().body(customerService.send(message));
        } catch (Exception e) {
            return ResponseEntity.status(501).body(e.getMessage());
        }
    }
}
