package com.zhuzheng.pattern.prototype.test;

/**
 * ClassName: Client
 * Package: com.zhuzheng.pattern.prototype.test
 * Description:
 *
 * @Author: east_moon
 * @Create: 2024/12/9 - 16:31
 * Version: v1.0
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation citation = new Citation();
        Student student = new Student();
        student.setName("张三");
        citation.setStudent(student);
        Citation clone = citation.clone();

        // 设置原对象和克隆对象的名字

        // 显示姓名
        citation.show();
        clone.show();
    }
}
