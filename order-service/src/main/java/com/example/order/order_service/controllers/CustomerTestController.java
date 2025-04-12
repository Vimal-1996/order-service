package com.example.order.order_service.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.order.order_service.DTO.CustomerDTO;
import com.example.order.order_service.services.CustomerClient;

@RestController
@RequestMapping("/test")
public class CustomerTestController {

    private final CustomerClient customerClient;

    public CustomerTestController(CustomerClient customerClient) {
        this.customerClient = customerClient;
    }

    @GetMapping("/customers/{id}")
    public ResponseEntity<?> getCustomer(@PathVariable Long id) {
        CustomerDTO customer = customerClient.getCustomerById(id);
        return ResponseEntity.ok(customer);
    }
}