package com.example.order.order_service.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.order.order_service.models.NotificationRequest;

@FeignClient(name = "notification-service", url = "http://NOTIFICATION-SERVICE/api/notifications")
public interface NotificationServiceClient {

    @PostMapping("/send")
    void sendNotification(@RequestBody NotificationRequest request);
}
