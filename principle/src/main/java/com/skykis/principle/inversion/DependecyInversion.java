package com.skykis.principle.inversion;

/**
 * 依赖倒转原则
 * 分析
 * 1.简单
 * 2.如果改变依赖类，则需要新增类及处理类的方法
 * 解决思路：引入抽象接口，让处理类的方法改为处理接口的方法——>细节依赖抽象
 */
public class DependecyInversion {
    public static void main(String[] args) {
        new Person().receive(new Email());
    }
}

class Email {
    public String getInfo() {
        return "hello world";
    }
}

/**
 * 接收消息
 */
class Person {
    public void receive(Email email) {
        System.out.println(email.getInfo());
    }
}