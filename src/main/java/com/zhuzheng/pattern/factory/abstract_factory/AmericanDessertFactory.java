package com.zhuzheng.pattern.factory.abstract_factory;

/**
 * ClassName: AmericanDessertFactory
 * Package: com.zhuzheng.pattern.factory.abstract_factory
 * Description:
 *
 * @Author: east_moon
 * @Create: 2024/12/9 - 13:51
 * Version: v1.0
 */
public class AmericanDessertFactory implements DessetFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
