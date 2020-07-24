package com.skykis.principle.inversion.improve;

/**
 * 定义接口
 */
interface IReceiver {
    String getInfo();
}

public class DependecyInversion {
    public static void main(String[] args) {
        new Person().receive(new Email());
        new Person().receive(new Wexin());
    }
}

class Wexin implements IReceiver {
    public String getInfo() {
        return "hello wexin";
    }
}

class Email implements IReceiver {
    public String getInfo() {
        return "hello email";
    }
}

/**
 * 接收消息
 */
class Person {
    public void receive(IReceiver receiver) {
        System.out.println(receiver.getInfo());
    }
}