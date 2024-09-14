package com.example.pos_system.service.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.example.pos_system.dto.StockDto;
import com.example.pos_system.model.Stock;
import com.example.pos_system.repository.StockRepository;
import com.example.pos_system.service.StockService;


@Service
public class StockImpl extends BaseServiceImpl<Stock, StockDto, String> implements StockService {

    @Autowired
    private StockRepository stockRepository;

    @Override
    public JpaRepository<Stock, String> getRepository() {
        return stockRepository;
    }

    @Override
    protected StockDto convertToDto(Stock stock) {
        StockDto dto = new StockDto();
        dto.setOnHand(stock.getOnHand());
        dto.setStatus(stock.getStatus());
        return dto;
    }
}
