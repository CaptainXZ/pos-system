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
@Table(name = "sale_order_details")
public class SaleOrderDetail extends BaseEntity<String> {

    @ManyToOne
    @JoinColumn(name = "sale_order_id", referencedColumnName = "id")
    private SaleOrder saleOrder;

    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "id") 
    private Product product;
    
    @Column(nullable = false)
    private String barcode;
    @Column(nullable = false)
    private int qty;
    @Column(nullable = false)
    private double cost;
    @Column(nullable = false)
    private double price;

    private double discount;
    private double promotionDiscount;
    @Column(nullable = false)
    private double amount;

}
