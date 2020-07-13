package com.skykis.principle.singleresponsibility;

/**
 * 单一职责原则
 * 在run方法中，违反了单一职责原则
 * 解决方案：根据入参vehicle职责不同分解成不同的类 => SingleResponsibility2
 */
public class SingleResponsibility1 {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.run("飞机");
        vehicle.run("轮船");
    }
}

/**
 * 交通工具
 */
class Vehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上运行。");
    }
}