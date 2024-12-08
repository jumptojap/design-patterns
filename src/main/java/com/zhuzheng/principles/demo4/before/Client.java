package com.zhuzheng.principles.demo4.before;

/**
 * ClassName: Client
 * Package: com.zhuzheng.principles.demo4.before
 * Description:
 *
 * @Author: east_moon
 * @Create: 2024/12/8 - 16:19
 * Version: v1.0
 */
public class Client {
    public static void main(String[] args) {
        SafetyDoor safetyDoor = new MySafetyDoor();
        safetyDoor.antiTheft();
        safetyDoor.waterProof();
        safetyDoor.fireProof();
    }
}
