package com.example.pos_system.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.example.pos_system.dto.PurchaseOrderDto;
import com.example.pos_system.model.PurchaseOrder;
import com.example.pos_system.repository.PurchaseOrderRepository;
import com.example.pos_system.repository.SupplierRepository;
import com.example.pos_system.service.PurchaseOrderService;
import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.transaction.Transactional;

@Service
public class PurchaseOrderServiceImpl extends BaseServiceImpl<PurchaseOrder, PurchaseOrderDto, String> 
        implements PurchaseOrderService {

    @Autowired
    private PurchaseOrderRepository purchaseOrderRepository;

    @Autowired
    private SupplierRepository supplierRepository; // Inject SupplierRepository

    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public JpaRepository<PurchaseOrder, String> getRepository() {
        return purchaseOrderRepository;
    }

    @Override
    protected PurchaseOrderDto convertToDto(PurchaseOrder entity) {
        return objectMapper.convertValue(entity, PurchaseOrderDto.class);
    }

    @Override
    @Transactional
    public PurchaseOrder create(PurchaseOrder purchaseOrder) {
        // Check if supplierId exists in Supplier table
        boolean supplierExists = supplierRepository.existsById(purchaseOrder.getSupplierId());
        if (!supplierExists) {
            throw new IllegalArgumentException("Supplier with ID " + purchaseOrder.getSupplierId() + " does not exist.");
        }

        return super.create(purchaseOrder); // Proceed if supplier exists
    }

    @Override
    public List<PurchaseOrder> getAll() {
        return super.getAll();
    }
}
