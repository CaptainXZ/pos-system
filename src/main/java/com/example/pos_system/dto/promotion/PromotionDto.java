package com.example.pos_system.dto.promotion;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PromotionDto {
    private String id;
    private String name;
    private String promotionType;
    private String buyItem;
    private String getItem;
    private Double discountPercentage;
    private String status;
}
