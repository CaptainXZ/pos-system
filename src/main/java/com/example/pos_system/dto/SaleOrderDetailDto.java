package com.example.pos_system.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SaleOrderDetailDto {
    private String barcode;
    private int qty;
    private double cost;
    private double price;
    private double discount;
    private double promotionDiscount;
    private double amount;
}
