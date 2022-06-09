package com.ljy.ood.factory.simple;

/**
 * Author:   mkp
 * Date:     2021/1/6 20:15
 * Description:
 */
public class XmComputer implements Calcalation{
    @Override
    public void powerOn() {
        System.out.println("小米电脑正在开机");
    }

    @Override
    public void powerOff() {
        System.out.println("小米电脑正在关机");
    }
}
