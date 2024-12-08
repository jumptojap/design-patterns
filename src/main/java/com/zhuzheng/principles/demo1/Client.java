package com.zhuzheng.principles.demo1;

/**
 * ClassName: Client
 * Package: com.zhuzheng.principles.demo1
 * Description:
 *
 * @Author: east_moon
 * @Create: 2024/12/8 - 15:05
 * Version: v1.0
 */
public class Client {
    public static void main(String[] args) {
        SougouInput sougouInput = new SougouInput();
        DefaultSkin defaultSkin = new DefaultSkin();
        NewSkin newSkin = new NewSkin();
        sougouInput.setSkin(defaultSkin);
        sougouInput.display();
        sougouInput.setSkin(newSkin);
        sougouInput.display();
    }
}
