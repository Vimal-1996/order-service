package com.example.order.order_service.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.order.order_service.models.Cart;

public interface CartRepository extends JpaRepository<Cart, Long>{

}
