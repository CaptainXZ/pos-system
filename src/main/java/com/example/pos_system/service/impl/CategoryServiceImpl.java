package com.example.pos_system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.example.pos_system.dto.category.CategoryDto;
import com.example.pos_system.model.Category;
import com.example.pos_system.repository.CategoryRepository;
import com.example.pos_system.service.CategoryService;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class CategoryServiceImpl extends BaseServiceImpl<Category, CategoryDto, String> implements CategoryService {
	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	ObjectMapper objectMapper;

	@Override
	public JpaRepository getRepository() {
		return categoryRepository;
	}

	@Override
	protected CategoryDto convertToDto(Category entity) {
		return objectMapper.convertValue(entity, CategoryDto.class);
	}

	@Override
	public List<Category> getAll() {
		return super.getAll();
	}
}
