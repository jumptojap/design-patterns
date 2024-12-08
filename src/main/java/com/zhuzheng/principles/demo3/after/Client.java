package com.zhuzheng.principles.demo3.after;


/**
 * ClassName: Client
 * Package: com.zhuzheng.principles.demo3.before
 * Description:
 *
 * @Author: east_moon
 * @Create: 2024/12/8 - 16:00
 * Version: v1.0
 */
public class Client {
    public static void main(String[] args) {
        XiJieHardDisk xiJieHardDisk = new XiJieHardDisk();
        IntelCpu intelCpu = new IntelCpu();
        KingstonMemory kingstonMemory = new KingstonMemory();
        Computer computer = new Computer();
        computer.setCpu(intelCpu);
        computer.setMemory(kingstonMemory);
        computer.setHardDisk(xiJieHardDisk);
        computer.run();
    }
}
