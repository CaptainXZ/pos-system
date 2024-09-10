package com.example.pos_system.service.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.example.pos_system.dto.SaleOrderDto;
import com.example.pos_system.model.SaleOrder;
import com.example.pos_system.repository.SalesOrderRepository;
import com.example.pos_system.service.SaleOrderService;

@Service
public class SaleOrderImpl extends BaseServiceImpl<SaleOrder, SaleOrderDto, String> implements SaleOrderService {

    @Autowired
    private SalesOrderRepository saleOrderRepository;

    @Override
    public JpaRepository<SaleOrder, String> getRepository() {
        return saleOrderRepository;
    }

    @Override
    protected SaleOrderDto convertToDto(SaleOrder saleOrder) {
        SaleOrderDto dto = new SaleOrderDto();
        dto.setSaleNumber(saleOrder.getSaleNumber());
        dto.setDate(saleOrder.getDate());
        dto.setRemark(saleOrder.getRemark());
        dto.setSubtotal(saleOrder.getSubtotal());
        dto.setGrandtotal(saleOrder.getGrandtotal());
        return dto;
    }

    @Override
    public Page<SaleOrderDto> getAllWithPaginationAndSearch(Pageable pageable, String content) {
        return super.getAllWithPaginationAndSearch(pageable, content);
    }
}

