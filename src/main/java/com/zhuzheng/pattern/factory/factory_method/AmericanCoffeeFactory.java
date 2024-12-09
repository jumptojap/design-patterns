package com.zhuzheng.pattern.factory.factory_method;

/**
 * ClassName: AmericanCoffeeFactory
 * Package: com.zhuzheng.pattern.factory.factory_method
 * Description:
 *
 * @Author: east_moon
 * @Create: 2024/12/9 - 13:26
 * Version: v1.0
 */
public class AmericanCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
