package com.example.pos_system.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseOrderDetailDto {
    private String id;
    private String purchaseOrderId;
    private String productId;
    private double cost;
    private String barcode;
    private int qty;
    private double discount;
    private double amount;
}
