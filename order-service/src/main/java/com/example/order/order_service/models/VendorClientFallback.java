package com.example.order.order_service.models;

import com.example.order.order_service.DTO.ProductDTO;
import com.example.order.order_service.services.VendorClient;

public class VendorClientFallback implements VendorClient{

	@Override
	public ProductDTO getProductDetails(Long productId) {
		// TODO Auto-generated method stub
		ProductDTO fallbackProduct = new ProductDTO();
		fallbackProduct.setId(productId);
		fallbackProduct.setName("Unavailable");
		fallbackProduct.setPrice(0.0);
		return fallbackProduct;
	}

}
