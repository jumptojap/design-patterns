package com.zhuzheng.pattern.factory.before;

/**
 * ClassName: Client
 * Package: com.zhuzheng.pattern.factory.before
 * Description:
 *
 * @Author: east_moon
 * @Create: 2024/12/8 - 19:34
 * Version: v1.0
 */
public class Client {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        Coffee coffee = coffeeStore.orderCoffee("latte");
        String name = coffee.getName();
        System.out.println(name);
    }
}
