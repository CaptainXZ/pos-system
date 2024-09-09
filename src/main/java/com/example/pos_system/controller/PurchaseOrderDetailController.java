package com.example.pos_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pos_system.dto.PurchaseOrderDetailDto;
import com.example.pos_system.model.PurchaseOrderDetail;
import com.example.pos_system.service.BaseService;
import com.example.pos_system.service.PurchaseOrderDetailService;

@RestController
@RequestMapping("/api/v1/purchaseorderdetails")
public class PurchaseOrderDetailController extends BaseController<PurchaseOrderDetail, PurchaseOrderDetailDto, String>{
    
    @Autowired
    private PurchaseOrderDetailService purchaseOrderDetailService;

    @Override
    public BaseService<PurchaseOrderDetail, PurchaseOrderDetailDto, String> getService() {
        return purchaseOrderDetailService;
    }
}
