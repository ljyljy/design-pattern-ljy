package com.ljy.ood.factory.simple;

/**
 * Author:   mkp
 * Date:     2021/1/6 20:18
 * Description:
 */
public class Computer {
    public static void main(String[] args) {
        //创建工厂
        ComputerFactory computerFactory = new ComputerFactory();
        Calcalation dell = computerFactory.create("DELL");
        dell.powerOn();
        dell.powerOff();

        Calcalation xm = computerFactory.create("XM");
        xm.powerOn();
        xm.powerOff();
    }
}
