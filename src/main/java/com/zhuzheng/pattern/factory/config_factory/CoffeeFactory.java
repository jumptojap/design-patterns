package com.zhuzheng.pattern.factory.config_factory;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * ClassName: CoffeeFactory
 * Package: com.zhuzheng.pattern.factory.config_factory
 * Description:
 *
 * @Author: east_moon
 * @Create: 2024/12/9 - 14:04
 * Version: v1.0
 */
public class CoffeeFactory {
    private static Map<String, Coffee> map = new HashMap<>();
    static{
        Properties properties = new Properties();
        try {
            properties.load(CoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties"));
            Set<Object> keys = properties.keySet();
            for (Object key : keys) {
                String className = properties.getProperty((String) key);
                Class<Coffee> clazz = (Class<Coffee>) Class.forName(className);
                Coffee coffee = clazz.getDeclaredConstructor().newInstance();
                map.put((String)key, coffee);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static Coffee createCoffee(String name){
        return map.get(name);
    }
}
