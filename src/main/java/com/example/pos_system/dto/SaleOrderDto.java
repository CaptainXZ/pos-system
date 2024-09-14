package com.example.pos_system.dto;


import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SaleOrderDto {
    private String saleNumber;
    private Date date;
    private String remark;
    private double subtotal;
    private double grandtotal;
    private double discount;
    private double promotionDiscount;
    private String status;
    private List<SaleOrderDetailDto> saleOrderDetails;

}

