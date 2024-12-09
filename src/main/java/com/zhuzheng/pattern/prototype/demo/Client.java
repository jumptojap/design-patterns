package com.zhuzheng.pattern.prototype.demo;

/**
 * ClassName: Client
 * Package: com.zhuzheng.pattern.prototype.demo
 * Description:
 *
 * @Author: east_moon
 * @Create: 2024/12/9 - 16:23
 * Version: v1.0
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Realizetype realizetype = new Realizetype();
        Realizetype clone = realizetype.clone();
        System.out.println(realizetype);
        System.out.println(clone);
    }
}
