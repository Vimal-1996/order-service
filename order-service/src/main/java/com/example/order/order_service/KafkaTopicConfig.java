package com.example.order.order_service;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaTopicConfig {
	
	@Bean
	public NewTopic orderNotificationTopic() {
		return new NewTopic("order-notification-topic",1,(short) 1);
	}
}
