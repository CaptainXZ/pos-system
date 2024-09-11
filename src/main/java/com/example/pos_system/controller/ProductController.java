package com.example.pos_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pos_system.dto.product.ProductDto;
import com.example.pos_system.model.Product;
import com.example.pos_system.service.BaseService;
import com.example.pos_system.service.ProductService;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController extends BaseController<Product, ProductDto, String> {

	@Autowired
	private ProductService productService;

	@Override
	public BaseService<Product, ProductDto, String> getService() {
		return productService;
	}
}
