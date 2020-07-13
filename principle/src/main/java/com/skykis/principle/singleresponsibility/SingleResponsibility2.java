package com.skykis.principle.singleresponsibility;

/**
 * 单一职责原则
 * 1.遵守单一职责原则
 * 2.缺点：改动很大（分解类，以及调用方的修改）
 * 3.进一步改进：直接改动Vehicle类（改动代码较少） => SingleResponsibility3
 */
public class SingleResponsibility2 {

    public static void main(String[] args) {
        RoadVehicle road = new RoadVehicle();
        road.run("摩托车");
        road.run("汽车");

        AirVehicle air = new AirVehicle();
        air.run("飞机");

        WaterVehicle water = new WaterVehicle();
        water.run("轮船");
    }
}

/**
 * 地面交通工具
 */
class RoadVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上运行。");
    }
}

/**
 * 空中交通工具
 */
class AirVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在天空上运行。");
    }
}

/**
 * 水面交通工具
 */
class WaterVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在水面上运行。");
    }
}