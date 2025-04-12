package com.example.order.order_service.services;

import java.util.concurrent.CompletableFuture;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import com.example.order.order_service.DTO.OrderDTO;



@Service
public class KafkaProducer {
	private final KafkaTemplate<String, OrderDTO> kafkaTemplate;
	
	public KafkaProducer(KafkaTemplate<String, OrderDTO> kafkaTemplate) {
  this.kafkaTemplate = kafkaTemplate;
}
    
//	private final KafkaTemplate<String, String> kafkaTemplate;
//	
//	public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
//		this.kafkaTemplate = kafkaTemplate;
//	}
	


    public void sendOrderNotification(OrderDTO order) {
    	CompletableFuture<SendResult<String, OrderDTO>> future = kafkaTemplate.send("order-notification-topic", order);
    	future.whenComplete((result, exception)->{
    		if(exception== null) {
    			System.out.println("Sent message= with offset=[" + result.getRecordMetadata().offset() + "]");
    		}else {
    			System.err.println("Unable to send message= due to : " + exception.getMessage());
    		}
    	});
    
    
    }
	
}
