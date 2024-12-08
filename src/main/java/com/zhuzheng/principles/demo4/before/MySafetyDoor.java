package com.zhuzheng.principles.demo4.before;

/**
 * ClassName: MySafetyDoor
 * Package: com.zhuzheng.principles.demo4.before
 * Description:
 *
 * @Author: east_moon
 * @Create: 2024/12/8 - 16:18
 * Version: v1.0
 */
public class MySafetyDoor implements SafetyDoor {
    @Override
    public void antiTheft() {
        System.out.println("防盗");
    }

    @Override
    public void fireProof() {
        System.out.println("防火");
    }

    @Override
    public void waterProof() {
        System.out.println("防水");
    }
}
