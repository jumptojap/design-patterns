package com.zhuzheng.pattern.prototype.test1;

import java.io.Serializable;

/**
 * ClassName: Citation
 * Package: com.zhuzheng.pattern.prototype.test
 * Description:
 *
 * @Author: east_moon
 * @Create: 2024/12/9 - 16:29
 * Version: v1.0
 */
class Citation implements Cloneable{
    private Student student;

    public void setStudent(Student student) {
        this.student = student;
    }

    // 显示姓名
    public void show() {
        System.out.println("Name: " + student.getName());
    }

    @Override
    protected Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }
}


