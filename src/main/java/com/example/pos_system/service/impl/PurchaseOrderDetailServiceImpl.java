package com.example.pos_system.service.impl;

import java.util.List;

import com.example.pos_system.dto.PurchaseOrderDetailDto;
import com.example.pos_system.model.PurchaseOrderDetail;
import com.example.pos_system.repository.PurchaseOrderDetailRepository;
import com.example.pos_system.repository.ProductRepository;
import com.example.pos_system.repository.PurchaseOrderRepository;
import com.example.pos_system.service.PurchaseOrderDetailService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class PurchaseOrderDetailServiceImpl extends BaseServiceImpl<PurchaseOrderDetail, PurchaseOrderDetailDto, String> 
        implements PurchaseOrderDetailService {

    @Autowired
    private PurchaseOrderDetailRepository purchaseOrderDetailRepository;

    @Autowired
    private PurchaseOrderRepository purchaseOrderRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public JpaRepository<PurchaseOrderDetail, String> getRepository() {
        return purchaseOrderDetailRepository;
    }

    @Override
    protected PurchaseOrderDetailDto convertToDto(PurchaseOrderDetail entity) {
        return objectMapper.convertValue(entity, PurchaseOrderDetailDto.class);
    }

    @Override
    public List<PurchaseOrderDetail> getAll() {
        return super.getAll();
    }

    @Override
    @Transactional
    public PurchaseOrderDetail create(PurchaseOrderDetail entity) {
        // Check if purchaseOrderId exists
        Optional<?> purchaseOrderExists = purchaseOrderRepository.findById(entity.getPurchaseOrderId());
        if (purchaseOrderExists.isEmpty()) {
            throw new IllegalArgumentException("Purchase Order ID not found.");
        }

        // Check if productId exists
        Optional<?> productExists = productRepository.findById(entity.getProductId());
        if (productExists.isEmpty()) {
            throw new IllegalArgumentException("Product ID not found.");
        }

        // Calculate amount before saving
        double discountAmount = entity.getCost() * entity.getQty() * (entity.getDiscount() / 100);
        double totalAmount = entity.getCost() * entity.getQty() - discountAmount;
        entity.setAmount(totalAmount);

        return super.create(entity);
    }

    @Override
    @Transactional
    public PurchaseOrderDetail update(String id, PurchaseOrderDetail entity) {
        // Check if purchaseOrderId exists
        Optional<?> purchaseOrderExists = purchaseOrderRepository.findById(entity.getPurchaseOrderId());
        if (purchaseOrderExists.isEmpty()) {
            throw new IllegalArgumentException("Purchase Order ID not found.");
        }

        // Check if productId exists
        Optional<?> productExists = productRepository.findById(entity.getProductId());
        if (productExists.isEmpty()) {
            throw new IllegalArgumentException("Product ID not found.");
        }

        // Calculate amount before updating
        double discountAmount = entity.getCost() * entity.getQty() * (entity.getDiscount() / 100);
        double totalAmount = entity.getCost() * entity.getQty() - discountAmount;
        entity.setAmount(totalAmount);

        return super.update(id, entity);
    }
}
