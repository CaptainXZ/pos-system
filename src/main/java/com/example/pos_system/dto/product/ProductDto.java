package com.example.pos_system.dto.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {
	private String id;
	private String name;
	private String description;
	private String status;
	private String brandId;
	private String categoryId;
	private double price;
	private double cost;
	private String image;
	private String barcode;
	private String supplierId;
	private int minOrder;
	private int maxOrder;
}
