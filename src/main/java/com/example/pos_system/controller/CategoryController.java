package com.example.pos_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pos_system.dto.category.CategoryDto;
import com.example.pos_system.model.Category;
import com.example.pos_system.service.BaseService;
import com.example.pos_system.service.CategoryService;

@RestController
@RequestMapping("/api/v1/categories")
public class CategoryController extends BaseController<Category, CategoryDto, String> {

	@Autowired
	private CategoryService categoryService;

	@Override
	public BaseService<Category, CategoryDto, String> getService() {
		return categoryService;
	}
}
