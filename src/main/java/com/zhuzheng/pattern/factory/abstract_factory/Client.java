package com.zhuzheng.pattern.factory.abstract_factory;

/**
 * ClassName: Client
 * Package: com.zhuzheng.pattern.factory.abstract_factory
 * Description:
 *
 * @Author: east_moon
 * @Create: 2024/12/9 - 13:54
 * Version: v1.0
 */
public class Client {
    public static void main(String[] args) {
        ItalyDessertFactory factory = new ItalyDessertFactory();
        Coffee coffee = factory.createCoffee();
        Dessert dessert = factory.createDessert();
        System.out.println(coffee.getName());
        dessert.show();
    }
}
