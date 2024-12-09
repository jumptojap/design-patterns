package com.zhuzheng.pattern.factory.abstract_factory;

/**
 * ClassName: Coffee
 * Package: com.zhuzheng.pattern.factory.before
 * Description:
 *
 * @Author: east_moon
 * @Create: 2024/12/8 - 19:29
 * Version: v1.0
 */
public abstract class Coffee {
    public abstract String getName();
    public void addSugar(){
        System.out.println("加糖");
    }
    public void addMilk(){
        System.out.println("加奶");
    }
}
