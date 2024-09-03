package com.example.pos_system.model;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_promotions")
public class Promotion extends BaseEntity<String> {
    private String name;

    @Column(name = "promotion_type", nullable = false)
    @NotNull(message = "Promotion Type can not be null.")
    private String promotionType;

    @Column(name = "buy_item", nullable = false)
    @NotNull(message = "Buy Item can not be null.")
    private UUID buyItem;

    @Column(name = "get_item", nullable = false)
    @NotNull(message = "Get Item can not be null.")
    private UUID getItem;

    @Column(name = "discount_percentage", nullable = false)
    @NotNull(message = "Discount Percentage can not be null.")
    private Double discountPercentage;
}
