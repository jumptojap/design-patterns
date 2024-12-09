package com.zhuzheng.pattern.factory.abstract_factory;

/**
 * ClassName: ItalyDessertFactory
 * Package: com.zhuzheng.pattern.factory.abstract_factory
 * Description:
 *
 * @Author: east_moon
 * @Create: 2024/12/9 - 13:53
 * Version: v1.0
 */
public class ItalyDessertFactory implements DessetFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Trimisu();
    }
}
