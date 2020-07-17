package com.skykis.principle.segregation;

interface Interface {
    void operation1();

    void operation2();

    void operation3();

    void operation4();

    void operation5();
}

/**
 * 接口隔离原则
 * Interface分别相对A和C不是最小接口
 * 解决方案：拆分
 */
public class Segregation {
    public static void main(String[] args) {

    }
}

class B implements Interface {
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

    @Override
    public void operation4() {
        System.out.println("B4");
    }

    @Override
    public void operation5() {
        System.out.println("B5");
    }
}

class D implements Interface {
    @Override
    public void operation1() {
        System.out.println("D1");
    }

    @Override
    public void operation2() {
        System.out.println("D2");
    }

    @Override
    public void operation3() {
        System.out.println("D3");
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
    public void depand1(Interface i) {
        i.operation1();
    }

    public void depand2(Interface i) {
        i.operation2();
    }

    public void depand3(Interface i) {
        i.operation3();
    }
}

/**
 * C通过Interface1调用D的1 4 5方法
 */
class C {
    public void depand1(Interface i) {
        i.operation1();
    }

    public void depand4(Interface i) {
        i.operation4();
    }

    public void depand5(Interface i) {
        i.operation5();
    }
}