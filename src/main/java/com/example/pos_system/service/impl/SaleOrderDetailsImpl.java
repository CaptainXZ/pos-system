package com.example.pos_system.service.impl;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.example.pos_system.dto.SaleOrderDetailDto;
import com.example.pos_system.model.SaleOrderDetail;
import com.example.pos_system.repository.SaleOrderDetailRepository;
import com.example.pos_system.service.SaleOrderDetailService;


@Service
public class SaleOrderDetailsImpl extends BaseServiceImpl<SaleOrderDetail, SaleOrderDetailDto, String> implements SaleOrderDetailService {

    @Autowired
    private SaleOrderDetailRepository saleOrderDetailRepository;

    @Override
    public JpaRepository<SaleOrderDetail, String> getRepository() {
        return saleOrderDetailRepository;
    }

    @Override
    protected SaleOrderDetailDto convertToDto(SaleOrderDetail saleOrderDetail) {
        SaleOrderDetailDto dto = new SaleOrderDetailDto();
        dto.setBarcode(saleOrderDetail.getBarcode());
        dto.setQty(saleOrderDetail.getQty());
        dto.setCost(saleOrderDetail.getCost());
        dto.setPrice(saleOrderDetail.getPrice());
        return dto;
    }

    @Override
    public Page<SaleOrderDetailDto> getAllWithPaginationAndSearch(Pageable pageable, String content) {
        return super.getAllWithPaginationAndSearch(pageable, content);
    }
}

