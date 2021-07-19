package com.opisir.designpatterns.factory.simple.service.impl;

import com.opisir.designpatterns.dto.CreateOrderDTO;
import com.opisir.designpatterns.factory.simple.service.OrderService;
import org.springframework.stereotype.Service;

@Service
public class PintuanOrderServiceImpl implements OrderService {
    @Override
    public void createOrder(CreateOrderDTO dto) {
        System.out.println("拼团下单的逻辑~~~");
    }
}
