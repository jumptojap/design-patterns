package com.zhuzheng.principles.demo1;

/**
 * ClassName: SougouInput
 * Package: com.zhuzheng.principles.demo1
 * Description:
 *
 * @Author: east_moon
 * @Create: 2024/12/8 - 15:04
 * Version: v1.0
 */
public class SougouInput {
    private AbstractSkin skin;

    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }
    public void display(){
        skin.display();
    }
}
