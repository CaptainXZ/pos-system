package com.example.pos_system.controller;


import com.example.pos_system.dto.SaleOrderDto;
import com.example.pos_system.model.SaleOrder;
import com.example.pos_system.service.BaseService;
import com.example.pos_system.service.SaleOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/sale-orders")
public class SaleOrderController extends BaseController<SaleOrder, SaleOrderDto, String> {

    @Autowired
    private SaleOrderService saleOrderService;

    @Override
    public BaseService<SaleOrder, SaleOrderDto, String> getService() {
        return saleOrderService;
    }
}

