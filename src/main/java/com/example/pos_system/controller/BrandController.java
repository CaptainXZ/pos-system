package com.example.pos_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pos_system.dto.brand.BrandDto;
import com.example.pos_system.model.Brand;
import com.example.pos_system.service.BaseService;
import com.example.pos_system.service.BrandService;

@RestController
@RequestMapping("/api/v1/brands")
public class BrandController extends BaseController<Brand, BrandDto, String> {

	@Autowired
	private BrandService brandService;

	@Override
	public BaseService<Brand, BrandDto, String> getService() {
		return brandService;
	}
}
