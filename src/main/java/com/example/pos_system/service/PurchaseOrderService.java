package com.example.pos_system.service;

import org.springframework.stereotype.Service;

import com.example.pos_system.dto.PurchaseOrderDto;
import com.example.pos_system.model.PurchaseOrder;

@Service
public interface PurchaseOrderService extends BaseService <PurchaseOrder, PurchaseOrderDto, String> {
    
}
