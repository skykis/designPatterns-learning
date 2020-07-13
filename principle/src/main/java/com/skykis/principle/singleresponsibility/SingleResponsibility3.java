package com.skykis.principle.singleresponsibility;

/**
 * 单一职责原则
 * 1.对原有类修改较少，只是增加方法
 * 2.类级别没有遵守单一职责原则，但是方法级别遵守单一职责原则
 */
public class SingleResponsibility3 {

    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.run("摩托车");
        vehicle2.run("汽车");
        vehicle2.runAir("飞机");
        vehicle2.runWater("轮船");
    }
}

/**
 * 交通工具
 */
class Vehicle2 {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上运行。");
    }

    public void runAir(String vehicle) {
        System.out.println(vehicle + "在天空上运行。");
    }

    public void runWater(String vehicle) {
        System.out.println(vehicle + "在水面上运行。");
    }
}