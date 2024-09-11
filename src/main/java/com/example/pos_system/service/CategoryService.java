package com.example.pos_system.service;

import org.springframework.stereotype.Service;

import com.example.pos_system.dto.category.CategoryDto;
import com.example.pos_system.model.Category;

@Service
public interface CategoryService extends BaseService<Category, CategoryDto, String> {

}