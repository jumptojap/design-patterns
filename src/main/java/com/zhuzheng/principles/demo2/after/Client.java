package com.zhuzheng.principles.demo2.after;

/**
 * ClassName: Client
 * Package: com.zhuzheng.principles.demo2.after
 * Description:
 *
 * @Author: east_moon
 * @Create: 2024/12/8 - 15:42
 * Version: v1.0
 */
public class Client {
    public static void main(String[] args) {
        Project project = new Project();
        project.getDocuments().add(new Document());
        project.getWritableDocuments().add(new WritableDocument());
        project.saveAll();
        project.openAll();
    }
}
