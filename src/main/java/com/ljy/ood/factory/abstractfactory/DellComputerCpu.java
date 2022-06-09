package com.ljy.ood.factory.abstractfactory;

/**
 * Author:   mkp
 * Date:     2021/1/6 20:36
 * Description:
 */
public class DellComputerCpu implements Cpu {
    @Override
    public void makeCpu() {
        System.out.println("制作dell cpu");
    }
}
