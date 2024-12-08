package com.zhuzheng.principles.demo4.after;

/**
 * ClassName: Client
 * Package: com.zhuzheng.principles.demo4.after
 * Description:
 *
 * @Author: east_moon
 * @Create: 2024/12/8 - 16:20
 * Version: v1.0
 */
public class Client {
    public static void main(String[] args) {
        MySafetyDoor mySafetyDoor = new MySafetyDoor();
        mySafetyDoor.waterProof();
        mySafetyDoor.fireProof();
        mySafetyDoor.antiTheft();
    }
}
