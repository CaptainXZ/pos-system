package com.example.pos_system.controller;

import com.example.pos_system.dto.StockMovementDto;
import com.example.pos_system.model.StockMovement;
import com.example.pos_system.service.BaseService;
import com.example.pos_system.service.StockMovementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/stock-movements")
public class StockMovementController extends BaseController<StockMovement, StockMovementDto, String> {

    @Autowired
    private StockMovementService stockMovementService;

    @Override
    public BaseService<StockMovement, StockMovementDto, String> getService() {
        return stockMovementService;
    }
}
