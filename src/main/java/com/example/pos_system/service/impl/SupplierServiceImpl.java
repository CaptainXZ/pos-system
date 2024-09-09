package com.example.pos_system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.example.pos_system.dto.supplier.SupplierDto;
import com.example.pos_system.model.Supplier;
import com.example.pos_system.repository.SupplierRepository;
import com.example.pos_system.service.SupplierService;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class SupplierServiceImpl extends BaseServiceImpl<Supplier, SupplierDto, String>
        implements SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;
    @Autowired
    ObjectMapper objectMapper;

    @Override
    public JpaRepository getRepository() {
        return supplierRepository;
    }

    @Override
    protected SupplierDto convertToDto(Supplier entity) {
        return objectMapper.convertValue(entity, SupplierDto.class);
    }

    @Override
    public List<Supplier> getAll() {
        return super.getAll();
    }

}
