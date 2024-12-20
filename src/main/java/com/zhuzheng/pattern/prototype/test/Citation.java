package com.zhuzheng.pattern.prototype.test;

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
class Citation implements Cloneable, Serializable {
    private Student student;

    public void setStudent(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
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


