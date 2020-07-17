package com.skykis.principle.segregation.improve;

interface Interface1 {
    void operation1();
}

interface Interface2 {
    void operation2();

    void operation3();
}

interface Interface3 {
    void operation4();

    void operation5();
}

/**
 * 接口隔离原则
 * Interface1分别相对A和C不是最小接口
 * 解决方案：拆分
 */
public class Segregation {
    public static void main(String[] args) {
        new A().depand1(new B());// A类通过接口依赖B类
    }
}

class B implements Interface1, Interface2 {
    @Override
    public void operation1() {
        System.out.println("B1");
    }

    @Override
    public void operation2() {
        System.out.println("B2");
    }

    @Override
    public void operation3() {
        System.out.println("B3");
    }
}

class D implements Interface1, Interface3 {
    @Override
    public void operation1() {
        System.out.println("D1");
    }

    @Override
    public void operation4() {
        System.out.println("D4");
    }

    @Override
    public void operation5() {
        System.out.println("D5");
    }
}

/**
 * A通过Interface1调用B类的1 2 3方法
 */
class A {
    public void depand1(Interface1 i) {
        i.operation1();
    }

    public void depand2(Interface2 i) {
        i.operation2();
    }

    public void depand3(Interface2 i) {
        i.operation3();
    }
}

/**
 * C通过Interface1调用D的1 4 5方法
 */
class C {
    public void depand1(Interface1 i) {
        i.operation1();
    }

    public void depand4(Interface3 i) {
        i.operation4();
    }

    public void depand5(Interface3 i) {
        i.operation5();
    }
}