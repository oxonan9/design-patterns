package com.opisir.designpatterns.factory.simple;

import cn.hutool.core.util.StrUtil;
import com.opisir.designpatterns.enums.OrderTypeEnum;
import com.opisir.designpatterns.factory.simple.service.OrderService;
import com.opisir.designpatterns.factory.simple.service.impl.IntegralOrderServiceImpl;
import com.opisir.designpatterns.factory.simple.service.impl.NormalOrderServiceImpl;
import com.opisir.designpatterns.factory.simple.service.impl.PintuanOrderServiceImpl;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * 订单对象工厂
 * 一般以Factory结尾
 */
public class OrderFactory {

    private static Map<String,OrderService> map = new HashMap();

    //第二种方式：使用static静态代码块 将对象进行缓存，节省空间，提高效率，同时可以避免在createService中的if-else代码
    static{
        map.put("normal",new NormalOrderServiceImpl());
        map.put("pintuan",new PintuanOrderServiceImpl());
        map.put("integral",new IntegralOrderServiceImpl());
    }

    /**
     * 创建对象的方法以create开头
     **/
    public static OrderService createService(String orderType) throws Exception {
        //第一种方式
//        switch (orderTypeEnum.getType()) {
//            case "normal":
//                return new NormalOrderServiceImpl();
//            case "pintuan":
//                return new PintuanOrderServiceImpl();
//            case "integral":
//                return new IntegralOrderServiceImpl();
//        }
        if (StrUtil.isBlank(orderType)) {
            throw new Exception("无效的订单类型");
        }
        return map.get(orderType);
    }
}
