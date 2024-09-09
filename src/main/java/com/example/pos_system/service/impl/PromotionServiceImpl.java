package com.example.pos_system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.example.pos_system.dto.promotion.PromotionDto;
import com.example.pos_system.model.Promotion;
import com.example.pos_system.repository.PromotionRepository;
import com.example.pos_system.service.PromotionService;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class PromotionServiceImpl extends BaseServiceImpl<Promotion, PromotionDto, String> implements PromotionService {

    @Autowired
    private PromotionRepository promotionRepository;
    @Autowired
    ObjectMapper objectMapper;

    @Override
    public JpaRepository getRepository() {
        return promotionRepository;
    }

    @Override
    protected PromotionDto convertToDto(Promotion entity) {
        return objectMapper.convertValue(entity, PromotionDto.class);
    }

    @Override
    public List<Promotion> getAll() {
        return super.getAll();
    }
}
