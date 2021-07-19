package com.opisir.designpatterns.api;

import com.opisir.designpatterns.dto.CreateOrderDTO;
import com.opisir.designpatterns.factory.simple.OrderFactoryBySpring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class OrderController {

    @Autowired
    private OrderFactoryBySpring orderFactory;

    /**
     * 下单
     */
    @PostMapping("/create")
    public void register(@RequestBody CreateOrderDTO dto) throws Exception {
        orderFactory.createService(dto.getOrderType()).createOrder(dto);
    }

}
