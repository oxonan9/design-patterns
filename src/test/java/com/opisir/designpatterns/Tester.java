package com.opisir.designpatterns;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.lang.Console;
import cn.hutool.core.lang.Validator;
import cn.hutool.core.util.ClassUtil;
import cn.hutool.core.util.StrUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@SpringBootTest
class Tester {

    @Test
    void contextLoads() {
//        String a = null;
//        Integer s = Convert.toInt(a);

        String[] strings = {"1", "2", "3"};
        Integer[] integers = Convert.toIntArray(strings);

//        String dateStr = "2021/07/17 03:06:02";
//        Date date = Convert.toDate(dateStr);

//        Validator.validate()
        System.out.println(integers);
        Console.log(integers);
        Console.error(integers);
        Console.log(StrUtil.hasEmpty("qd"," "));

        System.out.println(String.format("%s爱%s", "我", "大米"));

        System.out.println(StrUtil.format("{}爱{}", "我", "大米"));
    }

}
