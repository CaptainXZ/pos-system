package com.example.pos_system.service;

import org.springframework.stereotype.Service;

import com.example.pos_system.dto.product.ProductDto;
import com.example.pos_system.model.Product;

@Service
public interface ProductService extends BaseService<Product, ProductDto, String> {

}