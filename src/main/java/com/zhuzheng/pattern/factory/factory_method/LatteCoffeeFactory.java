package com.zhuzheng.pattern.factory.factory_method;

/**
 * ClassName: LatteCoffeeFactory
 * Package: com.zhuzheng.pattern.factory.factory_method
 * Description:
 *
 * @Author: east_moon
 * @Create: 2024/12/9 - 13:29
 * Version: v1.0
 */
public class LatteCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
