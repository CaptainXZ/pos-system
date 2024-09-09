package com.example.pos_system.service;

import org.springframework.stereotype.Service;
import com.example.pos_system.dto.promotion.PromotionDto;
import com.example.pos_system.model.Promotion;

@Service
public interface PromotionService extends BaseService<Promotion, PromotionDto, String> {

}
