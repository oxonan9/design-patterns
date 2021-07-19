package com.opisir.designpatterns.factory.simple.service;

import com.opisir.designpatterns.dto.CreateOrderDTO;

public interface OrderService {

    void createOrder(CreateOrderDTO userId);

}
