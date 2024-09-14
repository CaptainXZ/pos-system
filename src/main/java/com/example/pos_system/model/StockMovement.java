package com.example.pos_system.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "stock_movement")
public class StockMovement extends BaseEntity<String> {

    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private Product product;

    @Column(name = "open_qty",nullable = false)
    private int openQty;
    @Column(name = "operation_qty",nullable = false)
    private int operationQty;
    @Column(name = "close_qty",nullable = false)
    private int closeQty;
}

