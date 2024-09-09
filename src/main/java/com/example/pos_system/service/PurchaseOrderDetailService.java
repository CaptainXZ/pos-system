package com.example.pos_system.service;

import org.springframework.stereotype.Service;

import com.example.pos_system.dto.PurchaseOrderDetailDto;
import com.example.pos_system.model.PurchaseOrderDetail;

@Service
public interface PurchaseOrderDetailService extends BaseService <PurchaseOrderDetail, PurchaseOrderDetailDto, String> {
    
}
