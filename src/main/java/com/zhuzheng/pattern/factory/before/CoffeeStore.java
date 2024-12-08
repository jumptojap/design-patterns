package com.zhuzheng.pattern.factory.before;

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
        Coffee coffee = null;
        if("american".equals(type)){
            coffee = new AmericanCoffee();
        } else if ("latte".equals(type)) {
            coffee = new LatteCoffee();
        }else{
            throw new RuntimeException("对不起，你点的咖啡没有");
        }
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
