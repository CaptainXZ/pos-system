package com.example.pos_system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.example.pos_system.dto.product.ProductDto;
import com.example.pos_system.model.Product;
import com.example.pos_system.repository.ProductRepository;
import com.example.pos_system.service.ProductService;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class ProductServiceImpl extends BaseServiceImpl<Product, ProductDto, String> implements ProductService {
	@Autowired
	private ProductRepository productRepository;

	@Autowired
	ObjectMapper objectMapper;

	@Override
	public JpaRepository getRepository() {
		return productRepository;
	}

	@Override
	protected ProductDto convertToDto(Product entity) {
		return objectMapper.convertValue(entity, ProductDto.class);
	}

	@Override
	public List<Product> getAll() {
		return super.getAll();
	}
}
