package com.example.pos_system.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StockMovementDto {
    private String productName;
    private int openQty;
    private int operationQty;
    private int closeQty;

}

