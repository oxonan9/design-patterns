package com.opisir.designpatterns.dto;

import lombok.Data;
import lombok.Getter;

@Data
public class CreateOrderDTO {
    private Integer skuId; //商品id
    private Integer quantity; //购买数量
    private String orderType; //下单类型 normal正常 pintuan拼团 integral虚拟积分
}
