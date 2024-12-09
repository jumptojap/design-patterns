package com.zhuzheng.pattern.factory.abstract_factory;

/**
 * ClassName: DessetFactory
 * Package: com.zhuzheng.pattern.factory.abstract_factory
 * Description:
 *
 * @Author: east_moon
 * @Create: 2024/12/9 - 13:50
 * Version: v1.0
 */
public interface DessetFactory {
    Coffee createCoffee();
    Dessert createDessert();
}
