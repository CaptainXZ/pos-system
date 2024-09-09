package com.example.pos_system.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pos_system.model.PurchaseOrderDetail;

public interface PurchaseOrderDetailRepository extends JpaRepository <PurchaseOrderDetail, String> {
    List<PurchaseOrderDetail> findByPurchaseOrderId(String purchaseOrderId);
}
