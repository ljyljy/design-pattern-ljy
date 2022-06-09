package com.ljy.ood.factory.method;

/**
 * Author:   mkp
 * Date:     2021/1/6 20:24
 * Description:
 */
public class DesktopComputer implements Calcalation {
    @Override
    public void powerOn() {
        System.out.println("台式电脑开机");
    }

    @Override
    public void powerOff() {
        System.out.println(" 台式电脑关机");
    }
}
