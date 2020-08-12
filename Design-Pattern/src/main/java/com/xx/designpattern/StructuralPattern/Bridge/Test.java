package com.xx.designpattern.StructuralPattern.Bridge;

/**
 * 桥接模式
 *
 * @author xiaoxinga
 * @date 2020/06/08 10:49
 * @since
 */
public class Test {
    public static void main(String[] args) {
        Brand midea = new Midea(new WashingMachine());
        System.out.println(midea.description());

        Brand gree1 = new Gree(new WashingMachine());
        System.out.println(gree1.description());

        //添加新电器
        Brand gree2 = new Gree(new AirConditioner());
        System.out.println(gree2.description());

        //添加新品牌
        Brand haier1 = new Haier(new WashingMachine());
        System.out.println(haier1.description());
        Brand haier2 = new Haier(new WaterHeater());
        System.out.println(haier2.description());
    }
}
