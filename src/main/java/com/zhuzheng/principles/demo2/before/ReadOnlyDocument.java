package com.zhuzheng.principles.demo2.before;

/**
 * ClassName: ReadOnlyDocument
 * Package: com.zhuzheng.principles.demo2.before
 * Description:
 *
 * @Author: east_moon
 * @Create: 2024/12/8 - 15:34
 * Version: v1.0
 */
public class ReadOnlyDocument extends Document {
    @Override
    public void save() {
        super.save();
        throw new RuntimeException("无法保存已读文件");
    }
}
