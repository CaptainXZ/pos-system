package com.example.pos_system.model;

import java.sql.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "tbl_purchase_orders")
public class PurchaseOrder extends BaseEntity<String> {

    @Column(name = "reference_no", nullable = false)
    @NotBlank(message = "Reference number is mandatory")
    private String referenceNo;

    @Column(name = "purchase_order_number", nullable = false)
    @NotBlank(message = "Purchase order number is mandatory")
    private String purchaseOrderNumber;

    @Column(name = "date", nullable = false)
    @NotNull(message = "Date is mandatory")
    private Date date;

    @Column(name = "remark", nullable = false)
    @NotBlank(message = "Remark is mandatory")
    private String remark;

    @Column(name = "sub_total", nullable = false)
    @Positive(message = "Sub total must be positive")
    private double subTotal;

    @Column(name = "grand_total", nullable = false)
    @Positive(message = "Grand total must be positive")
    private double grandTotal;

    @Column(name = "supplier_id", nullable = false)
    @NotBlank(message = "Supplier ID is mandatory")
    private String supplierId;
}
