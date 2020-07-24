package com.skykis.principle.liskow.improve;

/**
 * 里氏替换原则
 * 分析：继承后重写方法，可能造成不必要的错误
 * 解决方案：继承一个更基础的基类
 */
public class Liskow {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3=" + a.func1(11, 3));
        System.out.println("1-8=" + a.func1(1, 8));

        System.out.println("-----------------------");

        B b = new B();
        System.out.println("11-3=" + b.func3(11, 3));
        System.out.println("1-8=" + b.func3(1, 8));
        System.out.println("11+3+9=" + b.func2(11, 3));
    }
}

class Base {
    // A和B都继承Base,让A和B之间的耦合度下降
}

class A extends Base {
    public int func1(int num1, int num2) {
        return num1 - num2;
    }
}

class B extends Base {
    // 通过组合关系使用A类方法
    private A a = new A();

    public int func1(int a, int b) {
        return a + b;
    }

    public int func2(int a, int b) {
        return func1(a, b) + 9;
    }

    public int func3(int a, int b) {
        return this.a.func1(a, b);
    }
}