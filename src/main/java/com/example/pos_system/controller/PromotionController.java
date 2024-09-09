package com.example.pos_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pos_system.dto.promotion.PromotionDto;
import com.example.pos_system.model.Promotion;
import com.example.pos_system.service.BaseService;
import com.example.pos_system.service.PromotionService;

@RestController
@RequestMapping("/api/v1/promotion")
public class PromotionController extends BaseController<Promotion, PromotionDto, String> {

    @Autowired
    private PromotionService promotionService;

    @Override
    public BaseService<Promotion, PromotionDto, String> getService() {
        return promotionService;
    }

}
