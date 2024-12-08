package com.zhuzheng.principles.demo3.before;

/**
 * ClassName: Computer
 * Package: com.zhuzheng.principles.demo3.before
 * Description:
 *
 * @Author: east_moon
 * @Create: 2024/12/8 - 15:58
 * Version: v1.0
 */
public class Computer {
    private XiJieHardDisk xiJieHardDisk;
    private IntelCpu intelCpu;
    private KingstonMemory kingstonMemory;

    public void run(){
        System.out.println("运行计算机");
        System.out.println("硬盘上运行的数据是" + xiJieHardDisk.get());
        intelCpu.run();
        kingstonMemory.save();
    }

    public XiJieHardDisk getXiJieHardDisk() {
        return xiJieHardDisk;
    }

    public void setXiJieHardDisk(XiJieHardDisk xiJieHardDisk) {
        this.xiJieHardDisk = xiJieHardDisk;
    }

    public IntelCpu getIntelCpu() {
        return intelCpu;
    }

    public void setIntelCpu(IntelCpu intelCpu) {
        this.intelCpu = intelCpu;
    }

    public KingstonMemory getKingstonMemory() {
        return kingstonMemory;
    }

    public void setKingstonMemory(KingstonMemory kingstonMemory) {
        this.kingstonMemory = kingstonMemory;
    }
}
