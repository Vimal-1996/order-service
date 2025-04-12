package com.example.order.order_service.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.order.order_service.models.Cart;
import com.example.order.order_service.models.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
