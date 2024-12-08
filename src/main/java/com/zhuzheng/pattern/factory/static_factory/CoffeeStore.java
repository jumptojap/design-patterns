package com.zhuzheng.pattern.factory.static_factory;

/**
 * ClassName: CoffeeStore
 * Package: com.zhuzheng.pattern.factory.before
 * Description:
 *
 * @Author: east_moon
 * @Create: 2024/12/8 - 19:32
 * Version: v1.0
 */
public class CoffeeStore {
    public Coffee orderCoffee(String type){
        Coffee coffee = StatciCoffeeFactory.createCoffee("latte");
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
