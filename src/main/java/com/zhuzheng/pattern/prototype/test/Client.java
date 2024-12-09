package com.zhuzheng.pattern.prototype.test;

import java.io.*;

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
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Citation citation = new Citation();
        Student student = new Student();
        student.setName("张三");
        citation.setStudent(student);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./a.txt"));
        oos.writeObject(citation);
        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./a.txt"));
        Citation readObject = (Citation) ois.readObject();
        readObject.getStudent().setName("李四");
        System.out.println(readObject);
        System.out.println(citation);
        readObject.show();
        citation.show();
    }
}
