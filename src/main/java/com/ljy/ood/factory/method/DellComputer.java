package com.ljy.ood.factory.method;

/**
 * Author:   mkp
 * Date:     2021/1/6 20:14
 * Description:
 */
public class DellComputer implements Calcalation {
    @Override
    public void powerOn() {
        System.out.println("Dell 电脑正在开机");
    }

    @Override
    public void powerOff() {
        System.out.println("Dell 电脑正在关机");
    }
}
