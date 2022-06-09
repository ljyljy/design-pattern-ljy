package com.ljy.ood.factory.method;

/**
 * Author:   mkp
 * Date:     2021/1/6 20:26
 * Description:
 */
public class Computer {
    public static void main(String[] args) {
        DesktopFactory desktopFactory = new DesktopFactory();
        Calcalation calcalation = desktopFactory.create();
        calcalation.powerOn();
        calcalation.powerOff();

        DellFactory dellFactory = new DellFactory();
        Calcalation dell = dellFactory.create();
        dell.powerOn();
        dell.powerOff();
    }
}
