package com.opisir.designpatterns.enums;

public enum  OrderTypeEnum {

    NORMAL("normal","普通订单","normalOrderServiceImpl"),
    PINTUAN("pintuan","拼团订单","pintuanOrderServiceImpl"),
    INTEGRAL("integral","积分兑换订单","integralOrderServiceImpl"),
    ;

    private String type;
    private String desc;
    private String clazz;

    OrderTypeEnum(String type, String desc, String clazz) {
        this.type = type;
        this.desc = desc;
        this.clazz = clazz;
    }

    public String getType() {
        return type;
    }

    public String getDesc() {
        return desc;
    }

    public String getClazz() {
        return clazz;
    }

}
