package com.example.order.order_service.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.order.order_service.models.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
