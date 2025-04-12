package com.example.order.order_service.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.order.order_service.models.VendorResponse;

//@FeignClient(name = "vendor-service", url = "http://VENDOR-SERVICE/api/vendors")
//public interface VendorServiceClient {
//    @GetMapping("/{vendorId}")
//    VendorResponse getVendorById(@PathVariable("vendorId") Long vendorId);
//
//}
