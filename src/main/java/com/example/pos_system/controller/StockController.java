package com.example.pos_system.controller;


import com.example.pos_system.dto.StockDto;
import com.example.pos_system.model.Stock;
import com.example.pos_system.service.BaseService;
import com.example.pos_system.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/stocks")
public class StockController extends BaseController<Stock, StockDto, String> {

    @Autowired
    private StockService stockService;

    @Override
    public BaseService<Stock, StockDto, String> getService() {
        return stockService;
    }
}

