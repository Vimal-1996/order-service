package com.example.order.order_service.controllers;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.order.order_service.DTO.OrderDTO;
import com.example.order.order_service.services.KafkaProducer;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    private final KafkaProducer kafkaProducer;

    public OrderController(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }
	
	
    @GetMapping("/{id}")
    public ResponseEntity<OrderDTO> getOrderById(@PathVariable("id") Long id) {
        // Returns order details for notification
    	return new ResponseEntity<>(new OrderDTO(), HttpStatus.OK);
    }
    
    @PostMapping("/place")
    public ResponseEntity<String> placeOrder(@RequestBody OrderDTO orderDTO) {
        // Place order logic (e.g., save to DB)
        kafkaProducer.sendOrderNotification(orderDTO);
        return ResponseEntity.ok("Order placed and notification sent.");
    }
}
