package com.example.order.order_service.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.order.order_service.services.VendorClient;

@RestController
@RequestMapping("/test")
public class ProductTestController {
	
	private final VendorClient vendorClient;
    public ProductTestController(VendorClient vendorClient) {
        this.vendorClient = vendorClient;
    }

    @GetMapping("/vendor/{id}")
    public ResponseEntity<?> getVendor(@PathVariable Long id) {
        return ResponseEntity.ok(vendorClient.getProductDetails(id));
    }
}
