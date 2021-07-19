package com.opisir.designpatterns.factory.simple;

import cn.hutool.core.util.StrUtil;
import cn.hutool.extra.spring.SpringUtil;
import com.opisir.designpatterns.enums.OrderTypeEnum;
import com.opisir.designpatterns.factory.simple.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * 订单对象工厂类
 * Spring中
 */
@Component
public class OrderFactoryBySpring {

    /**
     * 创建对象的方法以create开头
     **/
    public OrderService createService(String orderType) throws Exception {
        //我这里使用hutool的工具类，通过客户端传的type进行拼接获取Bean实例
        OrderService bean = SpringUtil.getBean(orderType + "OrderService");
        if (bean == null) {
            throw new Exception("无效的订单类型");
        }
        return bean;
    }

}
