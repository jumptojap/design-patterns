package com.zhuzheng.pattern.factory.static_factory;

/**
 * ClassName: SimpleCoffeeFactory
 * Package: com.zhuzheng.pattern.factory.simple_factory
 * Description:
 *
 * @Author: east_moon
 * @Create: 2024/12/8 - 19:47
 * Version: v1.0
 */
public class StatciCoffeeFactory {
    public static Coffee createCoffee(String type){
        Coffee coffee = null;
        if("american".equals(type)){
            coffee = new AmericanCoffee();
        } else if ("latte".equals(type)) {
            coffee = new LatteCoffee();
        }else{
            throw new RuntimeException("对不起，你点的咖啡没有");
        }
        return coffee;
    }
}
