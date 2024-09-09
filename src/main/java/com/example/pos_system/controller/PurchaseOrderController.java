package com.example.pos_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.pos_system.dto.PurchaseOrderDto;
import com.example.pos_system.model.PurchaseOrder;
import com.example.pos_system.service.PurchaseOrderService;
import com.example.pos_system.service.BaseService;

@RestController
@RequestMapping("/api/v1/purchaseorders")
public class PurchaseOrderController extends BaseController<PurchaseOrder, PurchaseOrderDto, String> {

    @Autowired
    private PurchaseOrderService purchaseOrderService;

    @Override
    public BaseService<PurchaseOrder, PurchaseOrderDto, String> getService() {
        return purchaseOrderService;
    }
}
