package com.opisir.designpatterns.factory.simple.service.impl;

import com.opisir.designpatterns.dto.CreateOrderDTO;
import com.opisir.designpatterns.factory.simple.service.OrderService;
import org.springframework.stereotype.Service;

@Service(value = "integralOrderService")
public class IntegralOrderServiceImpl implements OrderService {
    @Override
    public void createOrder(CreateOrderDTO dto) {
        System.out.println("积分兑换下单的逻辑~~~");
    }
}
