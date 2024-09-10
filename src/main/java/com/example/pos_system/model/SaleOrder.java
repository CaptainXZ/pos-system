package com.example.pos_system.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.OneToMany;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "sale_orders")
public class SaleOrder extends BaseEntity<String> {

    @Column(name = "sale_number",nullable = false)
    private String saleNumber;
    private Date date;
    private String remark;
    private double subtotal;
    private double grandtotal;
    private double discount;
    @Column(name = "promotion_discount")
    private double promotionDiscount;


    @OneToMany(mappedBy = "saleOrder", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<SaleOrderDetail> saleOrderDetails;

}
