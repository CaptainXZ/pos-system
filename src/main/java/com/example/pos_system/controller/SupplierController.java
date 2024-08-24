package com.example.pos_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pos_system.dto.supplier.SupplierDto;
import com.example.pos_system.model.Supplier;
import com.example.pos_system.service.BaseService;
import com.example.pos_system.service.SupplierService;

@RestController
@RequestMapping("/api/v1/supplier")
public class SupplierController extends BaseController<Supplier, SupplierDto, String> {

	@Autowired
	private SupplierService supplierService;

	@Override
	public BaseService<Supplier, SupplierDto, String> getService() {
		return supplierService;
	}
}
