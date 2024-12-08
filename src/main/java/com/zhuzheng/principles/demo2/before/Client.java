package com.zhuzheng.principles.demo2.before;

/**
 * ClassName: Client
 * Package: com.zhuzheng.principles.demo2.before
 * Description:
 *
 * @Author: east_moon
 * @Create: 2024/12/8 - 15:38
 * Version: v1.0
 */
public class Client {
    public static void main(String[] args) {
        Project project = new Project();
        project.getDocuments().add(new ReadOnlyDocument());
        project.saveAll();
    }
}
