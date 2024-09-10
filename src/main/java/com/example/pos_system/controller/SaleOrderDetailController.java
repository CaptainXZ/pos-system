package com.example.pos_system.controller;




import com.example.pos_system.dto.SaleOrderDetailDto;
import com.example.pos_system.model.SaleOrderDetail;
import com.example.pos_system.service.BaseService;
import com.example.pos_system.service.SaleOrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/sale-order-details")
public class SaleOrderDetailController extends BaseController<SaleOrderDetail, SaleOrderDetailDto, String> {

    @Autowired
    private SaleOrderDetailService saleOrderDetailService;

    @Override
    public BaseService<SaleOrderDetail, SaleOrderDetailDto, String> getService() {
        return saleOrderDetailService;
    }
}
