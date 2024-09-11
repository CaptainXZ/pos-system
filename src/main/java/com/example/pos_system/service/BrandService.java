package com.example.pos_system.service;

import org.springframework.stereotype.Service;

import com.example.pos_system.dto.brand.BrandDto;
import com.example.pos_system.model.Brand;

@Service
public interface BrandService extends BaseService<Brand, BrandDto, String> {

}