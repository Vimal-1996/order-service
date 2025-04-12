package com.example.order.order_service.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.order.order_service.DTO.ProductDTO;
import com.example.order.order_service.models.VendorClientFallback;

@FeignClient(name="vendor-service", url="${vendor.service.url}", fallback=VendorClientFallback.class)
public interface VendorClient {
	
	@GetMapping("/api/vendors/product/{productId}")
	ProductDTO getProductDetails(@PathVariable("productId") Long productId);

}
