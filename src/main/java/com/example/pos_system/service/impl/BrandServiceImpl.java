package com.example.pos_system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.example.pos_system.dto.brand.BrandDto;
import com.example.pos_system.model.Brand;
import com.example.pos_system.repository.BrandRepository;
import com.example.pos_system.service.BrandService;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class BrandServiceImpl extends BaseServiceImpl<Brand, BrandDto, String> implements BrandService {
	@Autowired
	private BrandRepository brandRepository;

	@Autowired
	ObjectMapper objectMapper;

	@Override
	public JpaRepository getRepository() {
		return brandRepository;
	}

	@Override
	protected BrandDto convertToDto(Brand entity) {
		return objectMapper.convertValue(entity, BrandDto.class);
	}

	@Override
	public List<Brand> getAll() {
		return super.getAll();
	}
}
