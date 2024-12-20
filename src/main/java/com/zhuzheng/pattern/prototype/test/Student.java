package com.zhuzheng.pattern.prototype.test;

import com.zhuzheng.principles.demo4.before.SafetyDoor;

import java.io.Serializable;

/**
 * ClassName: Student
 * Package: com.zhuzheng.pattern.prototype.test
 * Description:
 *
 * @Author: east_moon
 * @Create: 2024/12/9 - 18:47
 * Version: v1.0
 */
public class Student implements Serializable{
    private String name;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
