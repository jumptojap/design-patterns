package com.zhuzheng.principles.demo2.before;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: Project
 * Package: com.zhuzheng.principles.demo2.before
 * Description:
 *
 * @Author: east_moon
 * @Create: 2024/12/8 - 15:35
 * Version: v1.0
 */
public class Project {
    private List<Document> documents = new ArrayList<>();

    public List<Document> getDocuments() {
        return documents;
    }

    public void openAll(){
        for(Document document : documents){
            document.open();
        }
    }
    public void saveAll(){
        for(Document document : documents){
            document.save();
        }
    }
}
