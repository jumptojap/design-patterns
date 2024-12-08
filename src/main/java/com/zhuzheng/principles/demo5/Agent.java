package com.zhuzheng.principles.demo5;

/**
 * ClassName: Agent
 * Package: com.zhuzheng.principles.demo5
 * Description:
 *
 * @Author: east_moon
 * @Create: 2024/12/8 - 19:11
 * Version: v1.0
 */
public class Agent {
    private Star star;
    private Company company;
    private Fans fans;
    public void meet(){
        System.out.println(star.getName() + "和粉丝" + fans.getName() + "见面");
    }
    public void business(){
        System.out.println(star.getName() + "和公司" + company.getName() + "洽谈");
    }
    public Star getStar() {
        return star;
    }

    public void setStar(Star star) {
        this.star = star;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Fans getFans() {
        return fans;
    }

    public void setFans(Fans fans) {
        this.fans = fans;
    }
}
