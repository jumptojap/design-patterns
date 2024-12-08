package com.zhuzheng.principles.demo3.before;

/**
 * ClassName: XiJieHardDisk
 * Package: com.zhuzheng.principles.demo3.before
 * Description:
 *
 * @Author: east_moon
 * @Create: 2024/12/8 - 15:55
 * Version: v1.0
 */
public class XiJieHardDisk {
    public void save(String data){
        System.out.println("使用xijie硬盘存储数据");
    }
    public String get(){
        System.out.println("使用xijie硬盘获取数据");
        return "数据";
    }
}
