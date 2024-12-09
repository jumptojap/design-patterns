package com.zhuzheng.pattern.factory.factory_method;

/**
 * ClassName: Client
 * Package: com.zhuzheng.pattern.factory.factory_method
 * Description:
 *
 * @Author: east_moon
 * @Create: 2024/12/9 - 13:31
 * Version: v1.0
 */
public class Client {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        coffeeStore.setFactory(new AmericanCoffeeFactory());
        Coffee coffee = coffeeStore.orderCoffee();
        System.out.println(coffee.getName());
    }
}
