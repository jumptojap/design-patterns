package com.zhuzheng.principles.demo5;

/**
 * ClassName: Client
 * Package: com.zhuzheng.principles.demo5
 * Description:
 *
 * @Author: east_moon
 * @Create: 2024/12/8 - 19:13
 * Version: v1.0
 */
public class Client {
    public static void main(String[] args) {
        Agent agent = new Agent();
        Star star = new Star();
        star.setName("林青霞");
        agent.setStar(star);
        Fans fans = new Fans();
        fans.setName("李四");
        agent.setFans(fans);
        Company company = new Company();
        company.setName("华谊");
        agent.setCompany(company);
        agent.meet();
        agent.business();
    }
}
