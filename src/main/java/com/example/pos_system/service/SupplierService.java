package com.example.pos_system.service;

import org.springframework.stereotype.Service;

import com.example.pos_system.dto.supplier.SupplierDto;
import com.example.pos_system.model.Supplier;

@Service
public interface SupplierService extends BaseService<Supplier, SupplierDto, String> {
}
