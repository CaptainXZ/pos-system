package com.example.pos_system.dto;

import java.sql.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseOrderDto {
    private String id;
    private String referenceNo;
    private String purchaseOrderNumber;
    private Date date;
    private String remark;
    private double subtotal;
    private double grandTotal;
    private String supplierId;
    private String status;
    private List<PurchaseOrderDetailDto> details;
}
