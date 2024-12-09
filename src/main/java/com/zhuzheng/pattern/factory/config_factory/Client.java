package com.zhuzheng.pattern.factory.config_factory;

/**
 * ClassName: Client
 * Package: com.zhuzheng.pattern.factory.config_factory
 * Description:
 *
 * @Author: east_moon
 * @Create: 2024/12/9 - 14:27
 * Version: v1.0
 */
public class Client {
    public static void main(String[] args) {
        Coffee coffee = CoffeeFactory.createCoffee("american");
        System.out.println(coffee.getName());
    }
}
