package com.opisir.designpatterns.factory.simple.service.impl;

import com.opisir.designpatterns.dto.CreateOrderDTO;
import com.opisir.designpatterns.factory.simple.service.OrderService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service(value = "normalOrderService")
public class NormalOrderServiceImpl implements OrderService {
    @Override
    public void createOrder(CreateOrderDTO dto) {
        System.out.println("普通下单的逻辑~~~");
    }
}
