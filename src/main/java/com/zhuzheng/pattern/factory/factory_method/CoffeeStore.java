package com.zhuzheng.pattern.factory.factory_method;

import com.zhuzheng.pattern.factory.static_factory.StatciCoffeeFactory;

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
    private CoffeeFactory factory;

    public void setFactory(CoffeeFactory factory) {
        this.factory = factory;
    }
    public Coffee orderCoffee(){
        Coffee coffee = factory.createCoffee();
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
