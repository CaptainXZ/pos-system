package com.example.pos_system.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.example.pos_system.dto.StockMovementDto;
import com.example.pos_system.model.StockMovement;
import com.example.pos_system.repository.StockMovementRepository;
import com.example.pos_system.service.StockMovementService;


@Service
public class StockMovementImpl extends BaseServiceImpl<StockMovement, StockMovementDto, String> implements StockMovementService {

    @Autowired
    private StockMovementRepository stockMovementRepository;

    @Override
    public JpaRepository<StockMovement, String> getRepository() {
        return stockMovementRepository;
    }

    @Override
    protected StockMovementDto convertToDto(StockMovement stockMovement) {
        StockMovementDto dto = new StockMovementDto();
        dto.setOpenQty(stockMovement.getOpenQty());
        dto.setOperationQty(stockMovement.getOperationQty());
        dto.setCloseQty(stockMovement.getCloseQty());
        return dto;
    }
}

