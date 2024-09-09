package com.example.pos_system.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_purchase_order_details")
public class PurchaseOrderDetail extends BaseEntity<String> {

    @Column(name = "purchase_order_id", nullable = false)
    @NotBlank(message = "Purchase order ID is mandatory")
    private String purchaseOrderId;

    @Column(name = "product_id", nullable = false)
    @NotBlank(message = "Product ID is mandatory")
    private String productId;

    @Column(name = "cost", nullable = false)
    @Positive(message = "Cost must be positive")
    private double cost;

    @Column(name = "barcode")
    private String barcode;

    @Column(name = "qty", nullable = false)
    @Min(value = 0, message = "Quantity must be zero or positive")
    private int qty;

    @Column(name = "discount")
    @Min(value = 0, message = "Discount must be zero or positive")
    private double discount;

    @Column(name = "amount")
    @Min(value = 0, message = "Amount must be zero or positive")
    private double amount;
}
