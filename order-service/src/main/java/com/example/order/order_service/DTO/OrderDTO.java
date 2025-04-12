package com.example.order.order_service.DTO;

import java.io.Serializable;
import java.math.BigDecimal;

import com.example.order.order_service.models.OrderStatus;

import jakarta.persistence.Column;

public class OrderDTO implements Serializable{
	private Long id;
	
	private int customerId;
	
	private BigDecimal totalPrice;
	
	private OrderStatus status;
	
	

	public OrderDTO(Long id, int customerId, BigDecimal totalPrice, OrderStatus status) {
		super();
		this.id = id;
		this.customerId = customerId;
		this.totalPrice = totalPrice;
		this.status = status;
	}

	public OrderDTO() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public BigDecimal getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	
}
