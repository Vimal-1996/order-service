package com.example.order.order_service.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.order.order_service.DTO.CustomerDTO;

@FeignClient(name="customer-service-api", url="http://localhost:8082")
public interface CustomerClient {
	
	@GetMapping("/api/customers/{id}")
	CustomerDTO getCustomerById(@PathVariable ("id") Long id);
}
