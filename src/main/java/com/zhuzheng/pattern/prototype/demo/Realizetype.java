package com.zhuzheng.pattern.prototype.demo;

/**
 * ClassName: Realizetype
 * Package: com.zhuzheng.pattern.prototype
 * Description:
 *
 * @Author: east_moon
 * @Create: 2024/12/9 - 16:17
 * Version: v1.0
 */
public class Realizetype implements Cloneable{
    public Realizetype() {
        System.out.println("具体原型对象创建成功");
    }

    @Override
    public Realizetype clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功");
        return (Realizetype) super.clone();
    }
}
