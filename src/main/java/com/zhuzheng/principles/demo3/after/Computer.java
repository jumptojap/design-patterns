package com.zhuzheng.principles.demo3.after;

import com.zhuzheng.principles.demo3.before.IntelCpu;
import com.zhuzheng.principles.demo3.before.KingstonMemory;
import com.zhuzheng.principles.demo3.before.XiJieHardDisk;

import javax.print.attribute.HashAttributeSet;

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
    private Cpu cpu;
    private HardDisk hardDisk;
    private Memory memory;

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public void run(){
        System.out.println("运行计算机");
        System.out.println("硬盘上运行的数据是" +hardDisk.get());
        cpu.run();
        memory.save();
    }


}
