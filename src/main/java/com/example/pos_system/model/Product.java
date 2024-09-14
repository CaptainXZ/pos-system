package com.example.pos_system.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_products")
public class Product extends BaseEntity<String> {
	private String name;
	@Column(name = "description", nullable = true)
	private String description;
	@Column(name = "image", nullable = true)
	private String image;
	@Column(name = "price")
	private double price;
	@Column(name = "cost")
	private double cost;
	@Column(name = "barcode")
	private String barcode;
	@Column(name = "brand_id")
	private String brandId;
	@Column(name = "category_id")
	private String categoryId;
	@Column(name = "supplier_id")
	private String supplierId;
	@Column(name = "min_order")
	private int minOrder;
	@Column(name = "max_order")
	private int maxOrder;
}
